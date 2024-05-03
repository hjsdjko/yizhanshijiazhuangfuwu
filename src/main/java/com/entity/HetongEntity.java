package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 合同
 *
 * @author 
 * @email
 */
@TableName("hetong")
public class HetongEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HetongEntity() {

	}

	public HetongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 合同编号
     */
    @ColumnInfo(comment="合同编号",type="varchar(200)")
    @TableField(value = "hetong_uuid_number")

    private String hetongUuidNumber;


    /**
     * 合同名称
     */
    @ColumnInfo(comment="合同名称",type="varchar(200)")
    @TableField(value = "hetong_name")

    private String hetongName;


    /**
     * 合同文件
     */
    @ColumnInfo(comment="合同文件",type="varchar(200)")
    @TableField(value = "hetong_file")

    private String hetongFile;


    /**
     * 合同状态
     */
    @ColumnInfo(comment="合同状态",type="int(11)")
    @TableField(value = "hetong_types")

    private Integer hetongTypes;


    /**
     * 合同金额
     */
    @ColumnInfo(comment="合同金额",type="decimal(10,2)")
    @TableField(value = "hetong_huafei")

    private Double hetongHuafei;


    /**
     * 违约金
     */
    @ColumnInfo(comment="违约金",type="decimal(10,2)")
    @TableField(value = "hetong_weiyuejin")

    private Double hetongWeiyuejin;


    /**
     * 合同内容
     */
    @ColumnInfo(comment="合同内容",type="text")
    @TableField(value = "hetong_content")

    private String hetongContent;


    /**
     * 开具时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="开具时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：合同编号
	 */
    public String getHetongUuidNumber() {
        return hetongUuidNumber;
    }
    /**
	 * 设置：合同编号
	 */

    public void setHetongUuidNumber(String hetongUuidNumber) {
        this.hetongUuidNumber = hetongUuidNumber;
    }
    /**
	 * 获取：合同名称
	 */
    public String getHetongName() {
        return hetongName;
    }
    /**
	 * 设置：合同名称
	 */

    public void setHetongName(String hetongName) {
        this.hetongName = hetongName;
    }
    /**
	 * 获取：合同文件
	 */
    public String getHetongFile() {
        return hetongFile;
    }
    /**
	 * 设置：合同文件
	 */

    public void setHetongFile(String hetongFile) {
        this.hetongFile = hetongFile;
    }
    /**
	 * 获取：合同状态
	 */
    public Integer getHetongTypes() {
        return hetongTypes;
    }
    /**
	 * 设置：合同状态
	 */

    public void setHetongTypes(Integer hetongTypes) {
        this.hetongTypes = hetongTypes;
    }
    /**
	 * 获取：合同金额
	 */
    public Double getHetongHuafei() {
        return hetongHuafei;
    }
    /**
	 * 设置：合同金额
	 */

    public void setHetongHuafei(Double hetongHuafei) {
        this.hetongHuafei = hetongHuafei;
    }
    /**
	 * 获取：违约金
	 */
    public Double getHetongWeiyuejin() {
        return hetongWeiyuejin;
    }
    /**
	 * 设置：违约金
	 */

    public void setHetongWeiyuejin(Double hetongWeiyuejin) {
        this.hetongWeiyuejin = hetongWeiyuejin;
    }
    /**
	 * 获取：合同内容
	 */
    public String getHetongContent() {
        return hetongContent;
    }
    /**
	 * 设置：合同内容
	 */

    public void setHetongContent(String hetongContent) {
        this.hetongContent = hetongContent;
    }
    /**
	 * 获取：开具时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：开具时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Hetong{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", hetongUuidNumber=" + hetongUuidNumber +
            ", hetongName=" + hetongName +
            ", hetongFile=" + hetongFile +
            ", hetongTypes=" + hetongTypes +
            ", hetongHuafei=" + hetongHuafei +
            ", hetongWeiyuejin=" + hetongWeiyuejin +
            ", hetongContent=" + hetongContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
