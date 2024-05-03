package com.dao;

import com.entity.ZhucaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhucaiView;

/**
 * 主材 Dao 接口
 *
 * @author 
 */
public interface ZhucaiDao extends BaseMapper<ZhucaiEntity> {

   List<ZhucaiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
