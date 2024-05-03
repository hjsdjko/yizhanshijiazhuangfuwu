package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ZhuangxiufenggeEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 装修风格
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("zhuangxiufengge")
public class ZhuangxiufenggeView extends ZhuangxiufenggeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 装修风格类型的值
	*/
	@ColumnInfo(comment="装修风格类型的字典表值",type="varchar(200)")
	private String zhuangxiufenggeValue;
	/**
	* 户型的值
	*/
	@ColumnInfo(comment="户型的字典表值",type="varchar(200)")
	private String huxingValue;
	/**
	* 是否上架的值
	*/
	@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
	private String shangxiaValue;




	public ZhuangxiufenggeView() {

	}

	public ZhuangxiufenggeView(ZhuangxiufenggeEntity zhuangxiufenggeEntity) {
		try {
			BeanUtils.copyProperties(this, zhuangxiufenggeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 装修风格类型的值
	*/
	public String getZhuangxiufenggeValue() {
		return zhuangxiufenggeValue;
	}
	/**
	* 设置： 装修风格类型的值
	*/
	public void setZhuangxiufenggeValue(String zhuangxiufenggeValue) {
		this.zhuangxiufenggeValue = zhuangxiufenggeValue;
	}
	//当前表的
	/**
	* 获取： 户型的值
	*/
	public String getHuxingValue() {
		return huxingValue;
	}
	/**
	* 设置： 户型的值
	*/
	public void setHuxingValue(String huxingValue) {
		this.huxingValue = huxingValue;
	}
	//当前表的
	/**
	* 获取： 是否上架的值
	*/
	public String getShangxiaValue() {
		return shangxiaValue;
	}
	/**
	* 设置： 是否上架的值
	*/
	public void setShangxiaValue(String shangxiaValue) {
		this.shangxiaValue = shangxiaValue;
	}




	@Override
	public String toString() {
		return "ZhuangxiufenggeView{" +
			", zhuangxiufenggeValue=" + zhuangxiufenggeValue +
			", huxingValue=" + huxingValue +
			", shangxiaValue=" + shangxiaValue +
			"} " + super.toString();
	}
}
