package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ZhucaiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 主材
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("zhucai")
public class ZhucaiView extends ZhucaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 主材类型的值
	*/
	@ColumnInfo(comment="主材类型的字典表值",type="varchar(200)")
	private String zhucaiValue;
	/**
	* 品牌的值
	*/
	@ColumnInfo(comment="品牌的字典表值",type="varchar(200)")
	private String pinpaiValue;
	/**
	* 是否上架的值
	*/
	@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
	private String shangxiaValue;




	public ZhucaiView() {

	}

	public ZhucaiView(ZhucaiEntity zhucaiEntity) {
		try {
			BeanUtils.copyProperties(this, zhucaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 主材类型的值
	*/
	public String getZhucaiValue() {
		return zhucaiValue;
	}
	/**
	* 设置： 主材类型的值
	*/
	public void setZhucaiValue(String zhucaiValue) {
		this.zhucaiValue = zhucaiValue;
	}
	//当前表的
	/**
	* 获取： 品牌的值
	*/
	public String getPinpaiValue() {
		return pinpaiValue;
	}
	/**
	* 设置： 品牌的值
	*/
	public void setPinpaiValue(String pinpaiValue) {
		this.pinpaiValue = pinpaiValue;
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
		return "ZhucaiView{" +
			", zhucaiValue=" + zhucaiValue +
			", pinpaiValue=" + pinpaiValue +
			", shangxiaValue=" + shangxiaValue +
			"} " + super.toString();
	}
}
