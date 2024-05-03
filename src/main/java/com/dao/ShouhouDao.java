package com.dao;

import com.entity.ShouhouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouhouView;

/**
 * 售后服务 Dao 接口
 *
 * @author 
 */
public interface ShouhouDao extends BaseMapper<ShouhouEntity> {

   List<ShouhouView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
