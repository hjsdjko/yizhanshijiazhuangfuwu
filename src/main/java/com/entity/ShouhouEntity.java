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
 * 售后服务
 *
 * @author 
 * @email
 */
@TableName("shouhou")
public class ShouhouEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShouhouEntity() {

	}

	public ShouhouEntity(T t) {
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
     * 合同
     */
    @ColumnInfo(comment="合同",type="int(11)")
    @TableField(value = "hetong_id")

    private Integer hetongId;


    /**
     * 售后服务名称
     */
    @ColumnInfo(comment="售后服务名称",type="varchar(200)")
    @TableField(value = "shouhou_name")

    private String shouhouName;


    /**
     * 售后服务编号
     */
    @ColumnInfo(comment="售后服务编号",type="varchar(200)")
    @TableField(value = "shouhou_uuid_number")

    private String shouhouUuidNumber;


    /**
     * 售后服务附件
     */
    @ColumnInfo(comment="售后服务附件",type="varchar(200)")
    @TableField(value = "shouhou_file")

    private String shouhouFile;


    /**
     * 服务类型
     */
    @ColumnInfo(comment="服务类型",type="int(11)")
    @TableField(value = "shouhou_types")

    private Integer shouhouTypes;


    /**
     * 服务时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="服务时间",type="timestamp")
    @TableField(value = "fuwu_time")

    private Date fuwuTime;


    /**
     * 售后服务内容
     */
    @ColumnInfo(comment="售后服务内容",type="text")
    @TableField(value = "shouhou_content")

    private String shouhouContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
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
	 * 获取：合同
	 */
    public Integer getHetongId() {
        return hetongId;
    }
    /**
	 * 设置：合同
	 */

    public void setHetongId(Integer hetongId) {
        this.hetongId = hetongId;
    }
    /**
	 * 获取：售后服务名称
	 */
    public String getShouhouName() {
        return shouhouName;
    }
    /**
	 * 设置：售后服务名称
	 */

    public void setShouhouName(String shouhouName) {
        this.shouhouName = shouhouName;
    }
    /**
	 * 获取：售后服务编号
	 */
    public String getShouhouUuidNumber() {
        return shouhouUuidNumber;
    }
    /**
	 * 设置：售后服务编号
	 */

    public void setShouhouUuidNumber(String shouhouUuidNumber) {
        this.shouhouUuidNumber = shouhouUuidNumber;
    }
    /**
	 * 获取：售后服务附件
	 */
    public String getShouhouFile() {
        return shouhouFile;
    }
    /**
	 * 设置：售后服务附件
	 */

    public void setShouhouFile(String shouhouFile) {
        this.shouhouFile = shouhouFile;
    }
    /**
	 * 获取：服务类型
	 */
    public Integer getShouhouTypes() {
        return shouhouTypes;
    }
    /**
	 * 设置：服务类型
	 */

    public void setShouhouTypes(Integer shouhouTypes) {
        this.shouhouTypes = shouhouTypes;
    }
    /**
	 * 获取：服务时间
	 */
    public Date getFuwuTime() {
        return fuwuTime;
    }
    /**
	 * 设置：服务时间
	 */

    public void setFuwuTime(Date fuwuTime) {
        this.fuwuTime = fuwuTime;
    }
    /**
	 * 获取：售后服务内容
	 */
    public String getShouhouContent() {
        return shouhouContent;
    }
    /**
	 * 设置：售后服务内容
	 */

    public void setShouhouContent(String shouhouContent) {
        this.shouhouContent = shouhouContent;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
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
        return "Shouhou{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", hetongId=" + hetongId +
            ", shouhouName=" + shouhouName +
            ", shouhouUuidNumber=" + shouhouUuidNumber +
            ", shouhouFile=" + shouhouFile +
            ", shouhouTypes=" + shouhouTypes +
            ", fuwuTime=" + DateUtil.convertString(fuwuTime,"yyyy-MM-dd") +
            ", shouhouContent=" + shouhouContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
