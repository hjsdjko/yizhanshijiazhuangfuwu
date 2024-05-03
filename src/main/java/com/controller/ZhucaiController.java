
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
 * 主材
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/zhucai")
public class ZhucaiController {
    private static final Logger logger = LoggerFactory.getLogger(ZhucaiController.class);

    private static final String TABLE_NAME = "zhucai";

    @Autowired
    private ZhucaiService zhucaiService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private GongchenganpaiService gongchenganpaiService;//工程安排
    @Autowired
    private HetongService hetongService;//合同
    @Autowired
    private ShouhouService shouhouService;//售后服务
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
        params.put("zhucaiDeleteStart",1);params.put("zhucaiDeleteEnd",1);
        CommonUtil.checkMap(params);
        PageUtils page = zhucaiService.queryPage(params);

        //字典表数据转换
        List<ZhucaiView> list =(List<ZhucaiView>)page.getList();
        for(ZhucaiView c:list){
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
        ZhucaiEntity zhucai = zhucaiService.selectById(id);
        if(zhucai !=null){
            //entity转view
            ZhucaiView view = new ZhucaiView();
            BeanUtils.copyProperties( zhucai , view );//把实体数据重构到view中
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
    public R save(@RequestBody ZhucaiEntity zhucai, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,zhucai:{}",this.getClass().getName(),zhucai.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ZhucaiEntity> queryWrapper = new EntityWrapper<ZhucaiEntity>()
            .eq("zhucai_name", zhucai.getZhucaiName())
            .eq("zhucai_danwei", zhucai.getZhucaiDanwei())
            .eq("zhucai_shengchanchangjia", zhucai.getZhucaiShengchanchangjia())
            .eq("zhucai_types", zhucai.getZhucaiTypes())
            .eq("pinpai_types", zhucai.getPinpaiTypes())
            .eq("shangxia_types", zhucai.getShangxiaTypes())
            .eq("zhucai_delete", zhucai.getZhucaiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhucaiEntity zhucaiEntity = zhucaiService.selectOne(queryWrapper);
        if(zhucaiEntity==null){
            zhucai.setZhucaiClicknum(1);
            zhucai.setShangxiaTypes(1);
            zhucai.setZhucaiDelete(1);
            zhucai.setInsertTime(new Date());
            zhucai.setCreateTime(new Date());
            zhucaiService.insert(zhucai);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ZhucaiEntity zhucai, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,zhucai:{}",this.getClass().getName(),zhucai.toString());
        ZhucaiEntity oldZhucaiEntity = zhucaiService.selectById(zhucai.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        if("".equals(zhucai.getZhucaiPhoto()) || "null".equals(zhucai.getZhucaiPhoto())){
                zhucai.setZhucaiPhoto(null);
        }

            zhucaiService.updateById(zhucai);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<ZhucaiEntity> oldZhucaiList =zhucaiService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        ArrayList<ZhucaiEntity> list = new ArrayList<>();
        for(Integer id:ids){
            ZhucaiEntity zhucaiEntity = new ZhucaiEntity();
            zhucaiEntity.setId(id);
            zhucaiEntity.setZhucaiDelete(2);
            list.add(zhucaiEntity);
        }
        if(list != null && list.size() >0){
            zhucaiService.updateBatchById(list);
        }

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
            List<ZhucaiEntity> zhucaiList = new ArrayList<>();//上传的东西
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
                            ZhucaiEntity zhucaiEntity = new ZhucaiEntity();
//                            zhucaiEntity.setZhucaiName(data.get(0));                    //主材名称 要改的
//                            zhucaiEntity.setZhucaiUuidNumber(data.get(0));                    //主材编号 要改的
//                            zhucaiEntity.setZhucaiPhoto("");//详情和图片
//                            zhucaiEntity.setZhucaiDanwei(data.get(0));                    //单位 要改的
//                            zhucaiEntity.setZhucaiShengchanchangjia(data.get(0));                    //生产厂家 要改的
//                            zhucaiEntity.setZhucaiTypes(Integer.valueOf(data.get(0)));   //主材类型 要改的
//                            zhucaiEntity.setPinpaiTypes(Integer.valueOf(data.get(0)));   //品牌 要改的
//                            zhucaiEntity.setZhucaiJiage(data.get(0));                    //主材价格 要改的
//                            zhucaiEntity.setZhucaiClicknum(Integer.valueOf(data.get(0)));   //主材热度 要改的
//                            zhucaiEntity.setZhucaiContent("");//详情和图片
//                            zhucaiEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            zhucaiEntity.setZhucaiDelete(1);//逻辑删除字段
//                            zhucaiEntity.setInsertTime(date);//时间
//                            zhucaiEntity.setCreateTime(date);//时间
                            zhucaiList.add(zhucaiEntity);


                            //把要查询是否重复的字段放入map中
                                //主材编号
                                if(seachFields.containsKey("zhucaiUuidNumber")){
                                    List<String> zhucaiUuidNumber = seachFields.get("zhucaiUuidNumber");
                                    zhucaiUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> zhucaiUuidNumber = new ArrayList<>();
                                    zhucaiUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("zhucaiUuidNumber",zhucaiUuidNumber);
                                }
                        }

                        //查询是否重复
                         //主材编号
                        List<ZhucaiEntity> zhucaiEntities_zhucaiUuidNumber = zhucaiService.selectList(new EntityWrapper<ZhucaiEntity>().in("zhucai_uuid_number", seachFields.get("zhucaiUuidNumber")).eq("zhucai_delete", 1));
                        if(zhucaiEntities_zhucaiUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ZhucaiEntity s:zhucaiEntities_zhucaiUuidNumber){
                                repeatFields.add(s.getZhucaiUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [主材编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        zhucaiService.insertBatch(zhucaiList);
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
    * 个性推荐
    */
    @IgnoreAuth
    @RequestMapping("/gexingtuijian")
    public R gexingtuijian(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("gexingtuijian方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        CommonUtil.checkMap(params);
        List<ZhucaiView> returnZhucaiViewList = new ArrayList<>();

        //查看收藏
        Map<String, Object> params1 = new HashMap<>(params);params1.put("sort","id");params1.put("yonghuId",request.getSession().getAttribute("userId"));
        PageUtils pageUtils = zhucaiCollectionService.queryPage(params1);
        List<ZhucaiCollectionView> collectionViewsList =(List<ZhucaiCollectionView>)pageUtils.getList();
        Map<Integer,Integer> typeMap=new HashMap<>();//购买的类型list
        for(ZhucaiCollectionView collectionView:collectionViewsList){
            Integer zhucaiTypes = collectionView.getZhucaiTypes();
            if(typeMap.containsKey(zhucaiTypes)){
                typeMap.put(zhucaiTypes,typeMap.get(zhucaiTypes)+1);
            }else{
                typeMap.put(zhucaiTypes,1);
            }
        }
        List<Integer> typeList = new ArrayList<>();//排序后的有序的类型 按最多到最少
        typeMap.entrySet().stream().sorted((o1, o2) -> o2.getValue() - o1.getValue()).forEach(e -> typeList.add(e.getKey()));//排序
        Integer limit = Integer.valueOf(String.valueOf(params.get("limit")));
        for(Integer type:typeList){
            Map<String, Object> params2 = new HashMap<>(params);params2.put("zhucaiTypes",type);
            PageUtils pageUtils1 = zhucaiService.queryPage(params2);
            List<ZhucaiView> zhucaiViewList =(List<ZhucaiView>)pageUtils1.getList();
            returnZhucaiViewList.addAll(zhucaiViewList);
            if(returnZhucaiViewList.size()>= limit) break;//返回的推荐数量大于要的数量 跳出循环
        }
        //正常查询出来商品,用于补全推荐缺少的数据
        PageUtils page = zhucaiService.queryPage(params);
        if(returnZhucaiViewList.size()<limit){//返回数量还是小于要求数量
            int toAddNum = limit - returnZhucaiViewList.size();//要添加的数量
            List<ZhucaiView> zhucaiViewList =(List<ZhucaiView>)page.getList();
            for(ZhucaiView zhucaiView:zhucaiViewList){
                Boolean addFlag = true;
                for(ZhucaiView returnZhucaiView:returnZhucaiViewList){
                    if(returnZhucaiView.getId().intValue() ==zhucaiView.getId().intValue()) addFlag=false;//返回的数据中已存在此商品
                }
                if(addFlag){
                    toAddNum=toAddNum-1;
                    returnZhucaiViewList.add(zhucaiView);
                    if(toAddNum==0) break;//够数量了
                }
            }
        }else {
            returnZhucaiViewList = returnZhucaiViewList.subList(0, limit);
        }

        for(ZhucaiView c:returnZhucaiViewList)
            dictionaryService.dictionaryConvert(c, request);
        page.setList(returnZhucaiViewList);
        return R.ok().put("data", page);
    }

    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = zhucaiService.queryPage(params);

        //字典表数据转换
        List<ZhucaiView> list =(List<ZhucaiView>)page.getList();
        for(ZhucaiView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ZhucaiEntity zhucai = zhucaiService.selectById(id);
            if(zhucai !=null){

                //点击数量加1
                zhucai.setZhucaiClicknum(zhucai.getZhucaiClicknum()+1);
                zhucaiService.updateById(zhucai);

                //entity转view
                ZhucaiView view = new ZhucaiView();
                BeanUtils.copyProperties( zhucai , view );//把实体数据重构到view中

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
    public R add(@RequestBody ZhucaiEntity zhucai, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,zhucai:{}",this.getClass().getName(),zhucai.toString());
        Wrapper<ZhucaiEntity> queryWrapper = new EntityWrapper<ZhucaiEntity>()
            .eq("zhucai_name", zhucai.getZhucaiName())
            .eq("zhucai_uuid_number", zhucai.getZhucaiUuidNumber())
            .eq("zhucai_danwei", zhucai.getZhucaiDanwei())
            .eq("zhucai_shengchanchangjia", zhucai.getZhucaiShengchanchangjia())
            .eq("zhucai_types", zhucai.getZhucaiTypes())
            .eq("pinpai_types", zhucai.getPinpaiTypes())
            .eq("zhucai_clicknum", zhucai.getZhucaiClicknum())
            .eq("shangxia_types", zhucai.getShangxiaTypes())
            .eq("zhucai_delete", zhucai.getZhucaiDelete())
//            .notIn("zhucai_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhucaiEntity zhucaiEntity = zhucaiService.selectOne(queryWrapper);
        if(zhucaiEntity==null){
            zhucai.setZhucaiClicknum(1);
            zhucai.setZhucaiDelete(1);
            zhucai.setInsertTime(new Date());
            zhucai.setCreateTime(new Date());
        zhucaiService.insert(zhucai);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

