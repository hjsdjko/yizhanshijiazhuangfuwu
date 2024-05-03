
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
 * 装修风格
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/zhuangxiufengge")
public class ZhuangxiufenggeController {
    private static final Logger logger = LoggerFactory.getLogger(ZhuangxiufenggeController.class);

    private static final String TABLE_NAME = "zhuangxiufengge";

    @Autowired
    private ZhuangxiufenggeService zhuangxiufenggeService;


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
        params.put("zhuangxiufenggeDeleteStart",1);params.put("zhuangxiufenggeDeleteEnd",1);
        CommonUtil.checkMap(params);
        PageUtils page = zhuangxiufenggeService.queryPage(params);

        //字典表数据转换
        List<ZhuangxiufenggeView> list =(List<ZhuangxiufenggeView>)page.getList();
        for(ZhuangxiufenggeView c:list){
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
        ZhuangxiufenggeEntity zhuangxiufengge = zhuangxiufenggeService.selectById(id);
        if(zhuangxiufengge !=null){
            //entity转view
            ZhuangxiufenggeView view = new ZhuangxiufenggeView();
            BeanUtils.copyProperties( zhuangxiufengge , view );//把实体数据重构到view中
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
    public R save(@RequestBody ZhuangxiufenggeEntity zhuangxiufengge, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,zhuangxiufengge:{}",this.getClass().getName(),zhuangxiufengge.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ZhuangxiufenggeEntity> queryWrapper = new EntityWrapper<ZhuangxiufenggeEntity>()
            .eq("zhuangxiufengge_name", zhuangxiufengge.getZhuangxiufenggeName())
            .eq("zhuangxiufengge_types", zhuangxiufengge.getZhuangxiufenggeTypes())
            .eq("huxing_types", zhuangxiufengge.getHuxingTypes())
            .eq("zhuangxiufengge_kucun_number", zhuangxiufengge.getZhuangxiufenggeKucunNumber())
            .eq("shangxia_types", zhuangxiufengge.getShangxiaTypes())
            .eq("zhuangxiufengge_delete", zhuangxiufengge.getZhuangxiufenggeDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhuangxiufenggeEntity zhuangxiufenggeEntity = zhuangxiufenggeService.selectOne(queryWrapper);
        if(zhuangxiufenggeEntity==null){
            zhuangxiufengge.setZhuangxiufenggeClicknum(1);
            zhuangxiufengge.setShangxiaTypes(1);
            zhuangxiufengge.setZhuangxiufenggeDelete(1);
            zhuangxiufengge.setInsertTime(new Date());
            zhuangxiufengge.setCreateTime(new Date());
            zhuangxiufenggeService.insert(zhuangxiufengge);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ZhuangxiufenggeEntity zhuangxiufengge, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,zhuangxiufengge:{}",this.getClass().getName(),zhuangxiufengge.toString());
        ZhuangxiufenggeEntity oldZhuangxiufenggeEntity = zhuangxiufenggeService.selectById(zhuangxiufengge.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        if("".equals(zhuangxiufengge.getZhuangxiufenggePhoto()) || "null".equals(zhuangxiufengge.getZhuangxiufenggePhoto())){
                zhuangxiufengge.setZhuangxiufenggePhoto(null);
        }

            zhuangxiufenggeService.updateById(zhuangxiufengge);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<ZhuangxiufenggeEntity> oldZhuangxiufenggeList =zhuangxiufenggeService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        ArrayList<ZhuangxiufenggeEntity> list = new ArrayList<>();
        for(Integer id:ids){
            ZhuangxiufenggeEntity zhuangxiufenggeEntity = new ZhuangxiufenggeEntity();
            zhuangxiufenggeEntity.setId(id);
            zhuangxiufenggeEntity.setZhuangxiufenggeDelete(2);
            list.add(zhuangxiufenggeEntity);
        }
        if(list != null && list.size() >0){
            zhuangxiufenggeService.updateBatchById(list);
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
            List<ZhuangxiufenggeEntity> zhuangxiufenggeList = new ArrayList<>();//上传的东西
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
                            ZhuangxiufenggeEntity zhuangxiufenggeEntity = new ZhuangxiufenggeEntity();
//                            zhuangxiufenggeEntity.setZhuangxiufenggeName(data.get(0));                    //风格名称 要改的
//                            zhuangxiufenggeEntity.setZhuangxiufenggeUuidNumber(data.get(0));                    //装修风格编号 要改的
//                            zhuangxiufenggeEntity.setZhuangxiufenggePhoto("");//详情和图片
//                            zhuangxiufenggeEntity.setZhuangxiufenggeTypes(Integer.valueOf(data.get(0)));   //装修风格类型 要改的
//                            zhuangxiufenggeEntity.setHuxingTypes(Integer.valueOf(data.get(0)));   //户型 要改的
//                            zhuangxiufenggeEntity.setZhuangxiufenggeKucunNumber(Integer.valueOf(data.get(0)));   //装修风格库存 要改的
//                            zhuangxiufenggeEntity.setZhuangxiufenggeClicknum(Integer.valueOf(data.get(0)));   //风格热度 要改的
//                            zhuangxiufenggeEntity.setZhuangxiufenggeContent("");//详情和图片
//                            zhuangxiufenggeEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            zhuangxiufenggeEntity.setZhuangxiufenggeDelete(1);//逻辑删除字段
//                            zhuangxiufenggeEntity.setInsertTime(date);//时间
//                            zhuangxiufenggeEntity.setCreateTime(date);//时间
                            zhuangxiufenggeList.add(zhuangxiufenggeEntity);


                            //把要查询是否重复的字段放入map中
                                //装修风格编号
                                if(seachFields.containsKey("zhuangxiufenggeUuidNumber")){
                                    List<String> zhuangxiufenggeUuidNumber = seachFields.get("zhuangxiufenggeUuidNumber");
                                    zhuangxiufenggeUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> zhuangxiufenggeUuidNumber = new ArrayList<>();
                                    zhuangxiufenggeUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("zhuangxiufenggeUuidNumber",zhuangxiufenggeUuidNumber);
                                }
                        }

                        //查询是否重复
                         //装修风格编号
                        List<ZhuangxiufenggeEntity> zhuangxiufenggeEntities_zhuangxiufenggeUuidNumber = zhuangxiufenggeService.selectList(new EntityWrapper<ZhuangxiufenggeEntity>().in("zhuangxiufengge_uuid_number", seachFields.get("zhuangxiufenggeUuidNumber")).eq("zhuangxiufengge_delete", 1));
                        if(zhuangxiufenggeEntities_zhuangxiufenggeUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ZhuangxiufenggeEntity s:zhuangxiufenggeEntities_zhuangxiufenggeUuidNumber){
                                repeatFields.add(s.getZhuangxiufenggeUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [装修风格编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        zhuangxiufenggeService.insertBatch(zhuangxiufenggeList);
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
        List<ZhuangxiufenggeView> returnZhuangxiufenggeViewList = new ArrayList<>();

        //查看收藏
        Map<String, Object> params1 = new HashMap<>(params);params1.put("sort","id");params1.put("yonghuId",request.getSession().getAttribute("userId"));
        PageUtils pageUtils = zhuangxiufenggeCollectionService.queryPage(params1);
        List<ZhuangxiufenggeCollectionView> collectionViewsList =(List<ZhuangxiufenggeCollectionView>)pageUtils.getList();
        Map<Integer,Integer> typeMap=new HashMap<>();//购买的类型list
        for(ZhuangxiufenggeCollectionView collectionView:collectionViewsList){
            Integer zhuangxiufenggeTypes = collectionView.getZhuangxiufenggeTypes();
            if(typeMap.containsKey(zhuangxiufenggeTypes)){
                typeMap.put(zhuangxiufenggeTypes,typeMap.get(zhuangxiufenggeTypes)+1);
            }else{
                typeMap.put(zhuangxiufenggeTypes,1);
            }
        }
        List<Integer> typeList = new ArrayList<>();//排序后的有序的类型 按最多到最少
        typeMap.entrySet().stream().sorted((o1, o2) -> o2.getValue() - o1.getValue()).forEach(e -> typeList.add(e.getKey()));//排序
        Integer limit = Integer.valueOf(String.valueOf(params.get("limit")));
        for(Integer type:typeList){
            Map<String, Object> params2 = new HashMap<>(params);params2.put("zhuangxiufenggeTypes",type);
            PageUtils pageUtils1 = zhuangxiufenggeService.queryPage(params2);
            List<ZhuangxiufenggeView> zhuangxiufenggeViewList =(List<ZhuangxiufenggeView>)pageUtils1.getList();
            returnZhuangxiufenggeViewList.addAll(zhuangxiufenggeViewList);
            if(returnZhuangxiufenggeViewList.size()>= limit) break;//返回的推荐数量大于要的数量 跳出循环
        }
        //正常查询出来商品,用于补全推荐缺少的数据
        PageUtils page = zhuangxiufenggeService.queryPage(params);
        if(returnZhuangxiufenggeViewList.size()<limit){//返回数量还是小于要求数量
            int toAddNum = limit - returnZhuangxiufenggeViewList.size();//要添加的数量
            List<ZhuangxiufenggeView> zhuangxiufenggeViewList =(List<ZhuangxiufenggeView>)page.getList();
            for(ZhuangxiufenggeView zhuangxiufenggeView:zhuangxiufenggeViewList){
                Boolean addFlag = true;
                for(ZhuangxiufenggeView returnZhuangxiufenggeView:returnZhuangxiufenggeViewList){
                    if(returnZhuangxiufenggeView.getId().intValue() ==zhuangxiufenggeView.getId().intValue()) addFlag=false;//返回的数据中已存在此商品
                }
                if(addFlag){
                    toAddNum=toAddNum-1;
                    returnZhuangxiufenggeViewList.add(zhuangxiufenggeView);
                    if(toAddNum==0) break;//够数量了
                }
            }
        }else {
            returnZhuangxiufenggeViewList = returnZhuangxiufenggeViewList.subList(0, limit);
        }

        for(ZhuangxiufenggeView c:returnZhuangxiufenggeViewList)
            dictionaryService.dictionaryConvert(c, request);
        page.setList(returnZhuangxiufenggeViewList);
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
        PageUtils page = zhuangxiufenggeService.queryPage(params);

        //字典表数据转换
        List<ZhuangxiufenggeView> list =(List<ZhuangxiufenggeView>)page.getList();
        for(ZhuangxiufenggeView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ZhuangxiufenggeEntity zhuangxiufengge = zhuangxiufenggeService.selectById(id);
            if(zhuangxiufengge !=null){

                //点击数量加1
                zhuangxiufengge.setZhuangxiufenggeClicknum(zhuangxiufengge.getZhuangxiufenggeClicknum()+1);
                zhuangxiufenggeService.updateById(zhuangxiufengge);

                //entity转view
                ZhuangxiufenggeView view = new ZhuangxiufenggeView();
                BeanUtils.copyProperties( zhuangxiufengge , view );//把实体数据重构到view中

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
    public R add(@RequestBody ZhuangxiufenggeEntity zhuangxiufengge, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,zhuangxiufengge:{}",this.getClass().getName(),zhuangxiufengge.toString());
        Wrapper<ZhuangxiufenggeEntity> queryWrapper = new EntityWrapper<ZhuangxiufenggeEntity>()
            .eq("zhuangxiufengge_name", zhuangxiufengge.getZhuangxiufenggeName())
            .eq("zhuangxiufengge_uuid_number", zhuangxiufengge.getZhuangxiufenggeUuidNumber())
            .eq("zhuangxiufengge_types", zhuangxiufengge.getZhuangxiufenggeTypes())
            .eq("huxing_types", zhuangxiufengge.getHuxingTypes())
            .eq("zhuangxiufengge_kucun_number", zhuangxiufengge.getZhuangxiufenggeKucunNumber())
            .eq("zhuangxiufengge_clicknum", zhuangxiufengge.getZhuangxiufenggeClicknum())
            .eq("shangxia_types", zhuangxiufengge.getShangxiaTypes())
            .eq("zhuangxiufengge_delete", zhuangxiufengge.getZhuangxiufenggeDelete())
//            .notIn("zhuangxiufengge_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhuangxiufenggeEntity zhuangxiufenggeEntity = zhuangxiufenggeService.selectOne(queryWrapper);
        if(zhuangxiufenggeEntity==null){
            zhuangxiufengge.setZhuangxiufenggeClicknum(1);
            zhuangxiufengge.setZhuangxiufenggeDelete(1);
            zhuangxiufengge.setInsertTime(new Date());
            zhuangxiufengge.setCreateTime(new Date());
        zhuangxiufenggeService.insert(zhuangxiufengge);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

