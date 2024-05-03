package com.dao;

import com.entity.ZhucaiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhucaiCollectionView;

/**
 * 主材收藏 Dao 接口
 *
 * @author 
 */
public interface ZhucaiCollectionDao extends BaseMapper<ZhucaiCollectionEntity> {

   List<ZhucaiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
