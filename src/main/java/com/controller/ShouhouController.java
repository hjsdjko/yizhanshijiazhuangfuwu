
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 售后服务
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shouhou")
public class ShouhouController {
    private static final Logger logger = LoggerFactory.getLogger(ShouhouController.class);

    private static final String TABLE_NAME = "shouhou";

    @Autowired
    private ShouhouService shouhouService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private GongchenganpaiService gongchenganpaiService;//工程安排
    @Autowired
    private HetongService hetongService;//合同
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private YusuanService yusuanService;//预算
    @Autowired
    private ZhuangxiufenggeService zhuangxiufenggeService;//装修风格
    @Autowired
    private ZhuangxiufenggeCollectionService zhuangxiufenggeCollectionService;//装修风格收藏
    @Autowired
    private ZhuangxiufenggeLiuyanService zhuangxiufenggeLiuyanService;//装修风格留言
    @Autowired
    private ZhucaiService zhucaiService;//主材
    @Autowired
    private ZhucaiCollectionService zhucaiCollectionService;//主材收藏
    @Autowired
    private ZhucaiLiuyanService zhucaiLiuyanService;//主材留言
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = shouhouService.queryPage(params);

        //字典表数据转换
        List<ShouhouView> list =(List<ShouhouView>)page.getList();
        for(ShouhouView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShouhouEntity shouhou = shouhouService.selectById(id);
        if(shouhou !=null){
            //entity转view
            ShouhouView view = new ShouhouView();
            BeanUtils.copyProperties( shouhou , view );//把实体数据重构到view中
            //级联表 用户
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(shouhou.getYonghuId());
            if(yonghu != null){
            BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setYonghuId(yonghu.getId());
            }
            //级联表 合同
            //级联表
            HetongEntity hetong = hetongService.selectById(shouhou.getHetongId());
            if(hetong != null){
            BeanUtils.copyProperties( hetong , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setHetongId(hetong.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ShouhouEntity shouhou, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shouhou:{}",this.getClass().getName(),shouhou.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            shouhou.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<ShouhouEntity> queryWrapper = new EntityWrapper<ShouhouEntity>()
            .eq("yonghu_id", shouhou.getYonghuId())
            .eq("hetong_id", shouhou.getHetongId())
            .eq("shouhou_name", shouhou.getShouhouName())
            .eq("shouhou_types", shouhou.getShouhouTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShouhouEntity shouhouEntity = shouhouService.selectOne(queryWrapper);
        if(shouhouEntity==null){
            shouhou.setInsertTime(new Date());
            shouhou.setCreateTime(new Date());
            shouhouService.insert(shouhou);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShouhouEntity shouhou, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,shouhou:{}",this.getClass().getName(),shouhou.toString());
        ShouhouEntity oldShouhouEntity = shouhouService.selectById(shouhou.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            shouhou.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(shouhou.getShouhouFile()) || "null".equals(shouhou.getShouhouFile())){
                shouhou.setShouhouFile(null);
        }

            shouhouService.updateById(shouhou);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<ShouhouEntity> oldShouhouList =shouhouService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        shouhouService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<ShouhouEntity> shouhouList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ShouhouEntity shouhouEntity = new ShouhouEntity();
//                            shouhouEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            shouhouEntity.setHetongId(Integer.valueOf(data.get(0)));   //合同 要改的
//                            shouhouEntity.setShouhouName(data.get(0));                    //售后服务名称 要改的
//                            shouhouEntity.setShouhouUuidNumber(data.get(0));                    //售后服务编号 要改的
//                            shouhouEntity.setShouhouFile(data.get(0));                    //售后服务附件 要改的
//                            shouhouEntity.setShouhouTypes(Integer.valueOf(data.get(0)));   //服务类型 要改的
//                            shouhouEntity.setFuwuTime(sdf.parse(data.get(0)));          //服务时间 要改的
//                            shouhouEntity.setShouhouContent("");//详情和图片
//                            shouhouEntity.setInsertTime(date);//时间
//                            shouhouEntity.setCreateTime(date);//时间
                            shouhouList.add(shouhouEntity);


                            //把要查询是否重复的字段放入map中
                                //售后服务编号
                                if(seachFields.containsKey("shouhouUuidNumber")){
                                    List<String> shouhouUuidNumber = seachFields.get("shouhouUuidNumber");
                                    shouhouUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> shouhouUuidNumber = new ArrayList<>();
                                    shouhouUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("shouhouUuidNumber",shouhouUuidNumber);
                                }
                        }

                        //查询是否重复
                         //售后服务编号
                        List<ShouhouEntity> shouhouEntities_shouhouUuidNumber = shouhouService.selectList(new EntityWrapper<ShouhouEntity>().in("shouhou_uuid_number", seachFields.get("shouhouUuidNumber")));
                        if(shouhouEntities_shouhouUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ShouhouEntity s:shouhouEntities_shouhouUuidNumber){
                                repeatFields.add(s.getShouhouUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [售后服务编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        shouhouService.insertBatch(shouhouList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = shouhouService.queryPage(params);

        //字典表数据转换
        List<ShouhouView> list =(List<ShouhouView>)page.getList();
        for(ShouhouView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShouhouEntity shouhou = shouhouService.selectById(id);
            if(shouhou !=null){


                //entity转view
                ShouhouView view = new ShouhouView();
                BeanUtils.copyProperties( shouhou , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(shouhou.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //级联表
                    HetongEntity hetong = hetongService.selectById(shouhou.getHetongId());
                if(hetong != null){
                    BeanUtils.copyProperties( hetong , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setHetongId(hetong.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ShouhouEntity shouhou, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,shouhou:{}",this.getClass().getName(),shouhou.toString());
        Wrapper<ShouhouEntity> queryWrapper = new EntityWrapper<ShouhouEntity>()
            .eq("yonghu_id", shouhou.getYonghuId())
            .eq("hetong_id", shouhou.getHetongId())
            .eq("shouhou_name", shouhou.getShouhouName())
            .eq("shouhou_uuid_number", shouhou.getShouhouUuidNumber())
            .eq("shouhou_types", shouhou.getShouhouTypes())
//            .notIn("shouhou_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShouhouEntity shouhouEntity = shouhouService.selectOne(queryWrapper);
        if(shouhouEntity==null){
            shouhou.setInsertTime(new Date());
            shouhou.setCreateTime(new Date());
        shouhouService.insert(shouhou);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

