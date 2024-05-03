package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ZhucaiLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 主材留言
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("zhucai_liuyan")
public class ZhucaiLiuyanView extends ZhucaiLiuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 房源
		*/
		@ColumnInfo(comment="房源",type="int(11)")
		private Integer fangyuanTypes;
			/**
			* 房源的值
			*/
			@ColumnInfo(comment="房源的字典表值",type="varchar(200)")
			private String fangyuanValue;
		/**
		* 户型
		*/
		@ColumnInfo(comment="户型",type="int(11)")
		private Integer huxingTypes;
			/**
			* 户型的值
			*/
			@ColumnInfo(comment="户型的字典表值",type="varchar(200)")
			private String huxingValue;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;
	//级联表 主材
		/**
		* 主材名称
		*/

		@ColumnInfo(comment="主材名称",type="varchar(200)")
		private String zhucaiName;
		/**
		* 主材编号
		*/

		@ColumnInfo(comment="主材编号",type="varchar(200)")
		private String zhucaiUuidNumber;
		/**
		* 主材照片
		*/

		@ColumnInfo(comment="主材照片",type="varchar(200)")
		private String zhucaiPhoto;
		/**
		* 单位
		*/

		@ColumnInfo(comment="单位",type="varchar(200)")
		private String zhucaiDanwei;
		/**
		* 生产厂家
		*/

		@ColumnInfo(comment="生产厂家",type="varchar(200)")
		private String zhucaiShengchanchangjia;
		/**
		* 主材类型
		*/
		@ColumnInfo(comment="主材类型",type="int(11)")
		private Integer zhucaiTypes;
			/**
			* 主材类型的值
			*/
			@ColumnInfo(comment="主材类型的字典表值",type="varchar(200)")
			private String zhucaiValue;
		/**
		* 品牌
		*/
		@ColumnInfo(comment="品牌",type="int(11)")
		private Integer pinpaiTypes;
			/**
			* 品牌的值
			*/
			@ColumnInfo(comment="品牌的字典表值",type="varchar(200)")
			private String pinpaiValue;
		/**
		* 主材价格
		*/
		@ColumnInfo(comment="主材价格",type="decimal(10,2)")
		private Double zhucaiJiage;
		/**
		* 主材热度
		*/

		@ColumnInfo(comment="主材热度",type="int(11)")
		private Integer zhucaiClicknum;
		/**
		* 主材详情
		*/

		@ColumnInfo(comment="主材详情",type="text")
		private String zhucaiContent;
		/**
		* 是否上架
		*/
		@ColumnInfo(comment="是否上架",type="int(11)")
		private Integer shangxiaTypes;
			/**
			* 是否上架的值
			*/
			@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
			private String shangxiaValue;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer zhucaiDelete;



	public ZhucaiLiuyanView() {

	}

	public ZhucaiLiuyanView(ZhucaiLiuyanEntity zhucaiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, zhucaiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}
		/**
		* 获取： 房源
		*/
		public Integer getFangyuanTypes() {
			return fangyuanTypes;
		}
		/**
		* 设置： 房源
		*/
		public void setFangyuanTypes(Integer fangyuanTypes) {
			this.fangyuanTypes = fangyuanTypes;
		}


			/**
			* 获取： 房源的值
			*/
			public String getFangyuanValue() {
				return fangyuanValue;
			}
			/**
			* 设置： 房源的值
			*/
			public void setFangyuanValue(String fangyuanValue) {
				this.fangyuanValue = fangyuanValue;
			}
		/**
		* 获取： 户型
		*/
		public Integer getHuxingTypes() {
			return huxingTypes;
		}
		/**
		* 设置： 户型
		*/
		public void setHuxingTypes(Integer huxingTypes) {
			this.huxingTypes = huxingTypes;
		}


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

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}
	//级联表的get和set 主材

		/**
		* 获取： 主材名称
		*/
		public String getZhucaiName() {
			return zhucaiName;
		}
		/**
		* 设置： 主材名称
		*/
		public void setZhucaiName(String zhucaiName) {
			this.zhucaiName = zhucaiName;
		}

		/**
		* 获取： 主材编号
		*/
		public String getZhucaiUuidNumber() {
			return zhucaiUuidNumber;
		}
		/**
		* 设置： 主材编号
		*/
		public void setZhucaiUuidNumber(String zhucaiUuidNumber) {
			this.zhucaiUuidNumber = zhucaiUuidNumber;
		}

		/**
		* 获取： 主材照片
		*/
		public String getZhucaiPhoto() {
			return zhucaiPhoto;
		}
		/**
		* 设置： 主材照片
		*/
		public void setZhucaiPhoto(String zhucaiPhoto) {
			this.zhucaiPhoto = zhucaiPhoto;
		}

		/**
		* 获取： 单位
		*/
		public String getZhucaiDanwei() {
			return zhucaiDanwei;
		}
		/**
		* 设置： 单位
		*/
		public void setZhucaiDanwei(String zhucaiDanwei) {
			this.zhucaiDanwei = zhucaiDanwei;
		}

		/**
		* 获取： 生产厂家
		*/
		public String getZhucaiShengchanchangjia() {
			return zhucaiShengchanchangjia;
		}
		/**
		* 设置： 生产厂家
		*/
		public void setZhucaiShengchanchangjia(String zhucaiShengchanchangjia) {
			this.zhucaiShengchanchangjia = zhucaiShengchanchangjia;
		}
		/**
		* 获取： 主材类型
		*/
		public Integer getZhucaiTypes() {
			return zhucaiTypes;
		}
		/**
		* 设置： 主材类型
		*/
		public void setZhucaiTypes(Integer zhucaiTypes) {
			this.zhucaiTypes = zhucaiTypes;
		}


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
		/**
		* 获取： 品牌
		*/
		public Integer getPinpaiTypes() {
			return pinpaiTypes;
		}
		/**
		* 设置： 品牌
		*/
		public void setPinpaiTypes(Integer pinpaiTypes) {
			this.pinpaiTypes = pinpaiTypes;
		}


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

		/**
		* 获取： 主材价格
		*/
		public Double getZhucaiJiage() {
			return zhucaiJiage;
		}
		/**
		* 设置： 主材价格
		*/
		public void setZhucaiJiage(Double zhucaiJiage) {
			this.zhucaiJiage = zhucaiJiage;
		}

		/**
		* 获取： 主材热度
		*/
		public Integer getZhucaiClicknum() {
			return zhucaiClicknum;
		}
		/**
		* 设置： 主材热度
		*/
		public void setZhucaiClicknum(Integer zhucaiClicknum) {
			this.zhucaiClicknum = zhucaiClicknum;
		}

		/**
		* 获取： 主材详情
		*/
		public String getZhucaiContent() {
			return zhucaiContent;
		}
		/**
		* 设置： 主材详情
		*/
		public void setZhucaiContent(String zhucaiContent) {
			this.zhucaiContent = zhucaiContent;
		}
		/**
		* 获取： 是否上架
		*/
		public Integer getShangxiaTypes() {
			return shangxiaTypes;
		}
		/**
		* 设置： 是否上架
		*/
		public void setShangxiaTypes(Integer shangxiaTypes) {
			this.shangxiaTypes = shangxiaTypes;
		}


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

		/**
		* 获取： 逻辑删除
		*/
		public Integer getZhucaiDelete() {
			return zhucaiDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setZhucaiDelete(Integer zhucaiDelete) {
			this.zhucaiDelete = zhucaiDelete;
		}


	@Override
	public String toString() {
		return "ZhucaiLiuyanView{" +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", zhucaiName=" + zhucaiName +
			", zhucaiUuidNumber=" + zhucaiUuidNumber +
			", zhucaiPhoto=" + zhucaiPhoto +
			", zhucaiDanwei=" + zhucaiDanwei +
			", zhucaiShengchanchangjia=" + zhucaiShengchanchangjia +
			", zhucaiJiage=" + zhucaiJiage +
			", zhucaiClicknum=" + zhucaiClicknum +
			", zhucaiContent=" + zhucaiContent +
			", zhucaiDelete=" + zhucaiDelete +
			"} " + super.toString();
	}
}
