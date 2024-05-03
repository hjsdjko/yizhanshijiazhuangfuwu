package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.HetongEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 合同
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("hetong")
public class HetongView extends HetongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 合同状态的值
	*/
	@ColumnInfo(comment="合同状态的字典表值",type="varchar(200)")
	private String hetongValue;

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



	public HetongView() {

	}

	public HetongView(HetongEntity hetongEntity) {
		try {
			BeanUtils.copyProperties(this, hetongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 合同状态的值
	*/
	public String getHetongValue() {
		return hetongValue;
	}
	/**
	* 设置： 合同状态的值
	*/
	public void setHetongValue(String hetongValue) {
		this.hetongValue = hetongValue;
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


	@Override
	public String toString() {
		return "HetongView{" +
			", hetongValue=" + hetongValue +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
