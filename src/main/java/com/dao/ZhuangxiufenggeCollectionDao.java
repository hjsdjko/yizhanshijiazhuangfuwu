package com.dao;

import com.entity.ZhuangxiufenggeCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuangxiufenggeCollectionView;

/**
 * 装修风格收藏 Dao 接口
 *
 * @author 
 */
public interface ZhuangxiufenggeCollectionDao extends BaseMapper<ZhuangxiufenggeCollectionEntity> {

   List<ZhuangxiufenggeCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
