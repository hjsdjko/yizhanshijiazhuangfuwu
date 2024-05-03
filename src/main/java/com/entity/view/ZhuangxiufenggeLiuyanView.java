package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ZhuangxiufenggeLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 装修风格留言
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("zhuangxiufengge_liuyan")
public class ZhuangxiufenggeLiuyanView extends ZhuangxiufenggeLiuyanEntity implements Serializable {
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
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;
	//级联表 装修风格
		/**
		* 风格名称
		*/

		@ColumnInfo(comment="风格名称",type="varchar(200)")
		private String zhuangxiufenggeName;
		/**
		* 装修风格编号
		*/

		@ColumnInfo(comment="装修风格编号",type="varchar(200)")
		private String zhuangxiufenggeUuidNumber;
		/**
		* 装修风格照片
		*/

		@ColumnInfo(comment="装修风格照片",type="varchar(200)")
		private String zhuangxiufenggePhoto;
		/**
		* 装修风格类型
		*/
		@ColumnInfo(comment="装修风格类型",type="int(11)")
		private Integer zhuangxiufenggeTypes;
			/**
			* 装修风格类型的值
			*/
			@ColumnInfo(comment="装修风格类型的字典表值",type="varchar(200)")
			private String zhuangxiufenggeValue;
		/**
		* 装修风格库存
		*/

		@ColumnInfo(comment="装修风格库存",type="int(11)")
		private Integer zhuangxiufenggeKucunNumber;
		/**
		* 风格热度
		*/

		@ColumnInfo(comment="风格热度",type="int(11)")
		private Integer zhuangxiufenggeClicknum;
		/**
		* 装修风格详情
		*/

		@ColumnInfo(comment="装修风格详情",type="text")
		private String zhuangxiufenggeContent;
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
		private Integer zhuangxiufenggeDelete;

	//重复字段
			/**
			* 重复字段 的types
			*/
			@ColumnInfo(comment="重复字段 的types",type="Integer")
			private Integer huxingTypes;
				@ColumnInfo(comment="重复字段 的值",type="varchar(200)")
				private String huxingValue;


	public ZhuangxiufenggeLiuyanView() {

	}

	public ZhuangxiufenggeLiuyanView(ZhuangxiufenggeLiuyanEntity zhuangxiufenggeLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, zhuangxiufenggeLiuyanEntity);
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
	//级联表的get和set 装修风格

		/**
		* 获取： 风格名称
		*/
		public String getZhuangxiufenggeName() {
			return zhuangxiufenggeName;
		}
		/**
		* 设置： 风格名称
		*/
		public void setZhuangxiufenggeName(String zhuangxiufenggeName) {
			this.zhuangxiufenggeName = zhuangxiufenggeName;
		}

		/**
		* 获取： 装修风格编号
		*/
		public String getZhuangxiufenggeUuidNumber() {
			return zhuangxiufenggeUuidNumber;
		}
		/**
		* 设置： 装修风格编号
		*/
		public void setZhuangxiufenggeUuidNumber(String zhuangxiufenggeUuidNumber) {
			this.zhuangxiufenggeUuidNumber = zhuangxiufenggeUuidNumber;
		}

		/**
		* 获取： 装修风格照片
		*/
		public String getZhuangxiufenggePhoto() {
			return zhuangxiufenggePhoto;
		}
		/**
		* 设置： 装修风格照片
		*/
		public void setZhuangxiufenggePhoto(String zhuangxiufenggePhoto) {
			this.zhuangxiufenggePhoto = zhuangxiufenggePhoto;
		}
		/**
		* 获取： 装修风格类型
		*/
		public Integer getZhuangxiufenggeTypes() {
			return zhuangxiufenggeTypes;
		}
		/**
		* 设置： 装修风格类型
		*/
		public void setZhuangxiufenggeTypes(Integer zhuangxiufenggeTypes) {
			this.zhuangxiufenggeTypes = zhuangxiufenggeTypes;
		}


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

		/**
		* 获取： 装修风格库存
		*/
		public Integer getZhuangxiufenggeKucunNumber() {
			return zhuangxiufenggeKucunNumber;
		}
		/**
		* 设置： 装修风格库存
		*/
		public void setZhuangxiufenggeKucunNumber(Integer zhuangxiufenggeKucunNumber) {
			this.zhuangxiufenggeKucunNumber = zhuangxiufenggeKucunNumber;
		}

		/**
		* 获取： 风格热度
		*/
		public Integer getZhuangxiufenggeClicknum() {
			return zhuangxiufenggeClicknum;
		}
		/**
		* 设置： 风格热度
		*/
		public void setZhuangxiufenggeClicknum(Integer zhuangxiufenggeClicknum) {
			this.zhuangxiufenggeClicknum = zhuangxiufenggeClicknum;
		}

		/**
		* 获取： 装修风格详情
		*/
		public String getZhuangxiufenggeContent() {
			return zhuangxiufenggeContent;
		}
		/**
		* 设置： 装修风格详情
		*/
		public void setZhuangxiufenggeContent(String zhuangxiufenggeContent) {
			this.zhuangxiufenggeContent = zhuangxiufenggeContent;
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
		public Integer getZhuangxiufenggeDelete() {
			return zhuangxiufenggeDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setZhuangxiufenggeDelete(Integer zhuangxiufenggeDelete) {
			this.zhuangxiufenggeDelete = zhuangxiufenggeDelete;
		}

	//重复字段
			/**
			* 获取： 重复字段 的types
			*/
			public Integer getHuxingTypes() {
			return huxingTypes;
			}
			/**
			* 设置： 重复字段 的types
			*/
			public void setHuxingTypes(Integer huxingTypes) {
			this.huxingTypes = huxingTypes;
			}
				public String getHuxingValue() {
				return huxingValue;
				}
				public void setHuxingValue(String huxingValue) {
				this.huxingValue = huxingValue;
				}

	@Override
	public String toString() {
		return "ZhuangxiufenggeLiuyanView{" +
			", zhuangxiufenggeName=" + zhuangxiufenggeName +
			", zhuangxiufenggeUuidNumber=" + zhuangxiufenggeUuidNumber +
			", zhuangxiufenggePhoto=" + zhuangxiufenggePhoto +
			", zhuangxiufenggeKucunNumber=" + zhuangxiufenggeKucunNumber +
			", zhuangxiufenggeClicknum=" + zhuangxiufenggeClicknum +
			", zhuangxiufenggeContent=" + zhuangxiufenggeContent +
			", zhuangxiufenggeDelete=" + zhuangxiufenggeDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
