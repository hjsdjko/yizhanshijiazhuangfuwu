package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ShouhouEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 售后服务
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("shouhou")
public class ShouhouView extends ShouhouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 服务类型的值
	*/
	@ColumnInfo(comment="服务类型的字典表值",type="varchar(200)")
	private String shouhouValue;

	//级联表 合同
					 
		/**
		* 合同 的 用户
		*/
		@ColumnInfo(comment="用户",type="int(11)")
		private Integer hetongYonghuId;
		/**
		* 合同编号
		*/

		@ColumnInfo(comment="合同编号",type="varchar(200)")
		private String hetongUuidNumber;
		/**
		* 合同名称
		*/

		@ColumnInfo(comment="合同名称",type="varchar(200)")
		private String hetongName;
		/**
		* 合同文件
		*/

		@ColumnInfo(comment="合同文件",type="varchar(200)")
		private String hetongFile;
		/**
		* 合同状态
		*/
		@ColumnInfo(comment="合同状态",type="int(11)")
		private Integer hetongTypes;
			/**
			* 合同状态的值
			*/
			@ColumnInfo(comment="合同状态的字典表值",type="varchar(200)")
			private String hetongValue;
		/**
		* 合同金额
		*/
		@ColumnInfo(comment="合同金额",type="decimal(10,2)")
		private Double hetongHuafei;
		/**
		* 违约金
		*/
		@ColumnInfo(comment="违约金",type="decimal(10,2)")
		private Double hetongWeiyuejin;
		/**
		* 合同内容
		*/

		@ColumnInfo(comment="合同内容",type="text")
		private String hetongContent;
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



	public ShouhouView() {

	}

	public ShouhouView(ShouhouEntity shouhouEntity) {
		try {
			BeanUtils.copyProperties(this, shouhouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 服务类型的值
	*/
	public String getShouhouValue() {
		return shouhouValue;
	}
	/**
	* 设置： 服务类型的值
	*/
	public void setShouhouValue(String shouhouValue) {
		this.shouhouValue = shouhouValue;
	}


	//级联表的get和set 合同
		/**
		* 获取：合同 的 用户
		*/
		public Integer getHetongYonghuId() {
			return hetongYonghuId;
		}
		/**
		* 设置：合同 的 用户
		*/
		public void setHetongYonghuId(Integer hetongYonghuId) {
			this.hetongYonghuId = hetongYonghuId;
		}

		/**
		* 获取： 合同编号
		*/
		public String getHetongUuidNumber() {
			return hetongUuidNumber;
		}
		/**
		* 设置： 合同编号
		*/
		public void setHetongUuidNumber(String hetongUuidNumber) {
			this.hetongUuidNumber = hetongUuidNumber;
		}

		/**
		* 获取： 合同名称
		*/
		public String getHetongName() {
			return hetongName;
		}
		/**
		* 设置： 合同名称
		*/
		public void setHetongName(String hetongName) {
			this.hetongName = hetongName;
		}

		/**
		* 获取： 合同文件
		*/
		public String getHetongFile() {
			return hetongFile;
		}
		/**
		* 设置： 合同文件
		*/
		public void setHetongFile(String hetongFile) {
			this.hetongFile = hetongFile;
		}
		/**
		* 获取： 合同状态
		*/
		public Integer getHetongTypes() {
			return hetongTypes;
		}
		/**
		* 设置： 合同状态
		*/
		public void setHetongTypes(Integer hetongTypes) {
			this.hetongTypes = hetongTypes;
		}


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

		/**
		* 获取： 合同金额
		*/
		public Double getHetongHuafei() {
			return hetongHuafei;
		}
		/**
		* 设置： 合同金额
		*/
		public void setHetongHuafei(Double hetongHuafei) {
			this.hetongHuafei = hetongHuafei;
		}

		/**
		* 获取： 违约金
		*/
		public Double getHetongWeiyuejin() {
			return hetongWeiyuejin;
		}
		/**
		* 设置： 违约金
		*/
		public void setHetongWeiyuejin(Double hetongWeiyuejin) {
			this.hetongWeiyuejin = hetongWeiyuejin;
		}

		/**
		* 获取： 合同内容
		*/
		public String getHetongContent() {
			return hetongContent;
		}
		/**
		* 设置： 合同内容
		*/
		public void setHetongContent(String hetongContent) {
			this.hetongContent = hetongContent;
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
		return "ShouhouView{" +
			", shouhouValue=" + shouhouValue +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", hetongUuidNumber=" + hetongUuidNumber +
			", hetongName=" + hetongName +
			", hetongFile=" + hetongFile +
			", hetongHuafei=" + hetongHuafei +
			", hetongWeiyuejin=" + hetongWeiyuejin +
			", hetongContent=" + hetongContent +
			"} " + super.toString();
	}
}
