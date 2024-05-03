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
 * 工程安排
 *
 * @author 
 * @email
 */
@TableName("gongchenganpai")
public class GongchenganpaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GongchenganpaiEntity() {

	}

	public GongchenganpaiEntity(T t) {
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
     * 工程安排编号
     */
    @ColumnInfo(comment="工程安排编号",type="varchar(200)")
    @TableField(value = "gongchenganpai_uuid_number")

    private String gongchenganpaiUuidNumber;


    /**
     * 工程安排名称
     */
    @ColumnInfo(comment="工程安排名称",type="varchar(200)")
    @TableField(value = "gongchenganpai_name")

    private String gongchenganpaiName;


    /**
     * 工程安排附件
     */
    @ColumnInfo(comment="工程安排附件",type="varchar(200)")
    @TableField(value = "gongchenganpai_file")

    private String gongchenganpaiFile;


    /**
     * 负责人
     */
    @ColumnInfo(comment="负责人",type="varchar(200)")
    @TableField(value = "gongchenganpai_fuzeren")

    private String gongchenganpaiFuzeren;


    /**
     * 联系方式
     */
    @ColumnInfo(comment="联系方式",type="varchar(200)")
    @TableField(value = "gongchenganpai_lianxifangshi")

    private String gongchenganpaiLianxifangshi;


    /**
     * 工程进度
     */
    @ColumnInfo(comment="工程进度",type="int(11)")
    @TableField(value = "gongchenganpai_types")

    private Integer gongchenganpaiTypes;


    /**
     * 工程安排内容
     */
    @ColumnInfo(comment="工程安排内容",type="text")
    @TableField(value = "gongchenganpai_content")

    private String gongchenganpaiContent;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="text")
    @TableField(value = "gongchenganpai_beizhu_content")

    private String gongchenganpaiBeizhuContent;


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
	 * 获取：工程安排编号
	 */
    public String getGongchenganpaiUuidNumber() {
        return gongchenganpaiUuidNumber;
    }
    /**
	 * 设置：工程安排编号
	 */

    public void setGongchenganpaiUuidNumber(String gongchenganpaiUuidNumber) {
        this.gongchenganpaiUuidNumber = gongchenganpaiUuidNumber;
    }
    /**
	 * 获取：工程安排名称
	 */
    public String getGongchenganpaiName() {
        return gongchenganpaiName;
    }
    /**
	 * 设置：工程安排名称
	 */

    public void setGongchenganpaiName(String gongchenganpaiName) {
        this.gongchenganpaiName = gongchenganpaiName;
    }
    /**
	 * 获取：工程安排附件
	 */
    public String getGongchenganpaiFile() {
        return gongchenganpaiFile;
    }
    /**
	 * 设置：工程安排附件
	 */

    public void setGongchenganpaiFile(String gongchenganpaiFile) {
        this.gongchenganpaiFile = gongchenganpaiFile;
    }
    /**
	 * 获取：负责人
	 */
    public String getGongchenganpaiFuzeren() {
        return gongchenganpaiFuzeren;
    }
    /**
	 * 设置：负责人
	 */

    public void setGongchenganpaiFuzeren(String gongchenganpaiFuzeren) {
        this.gongchenganpaiFuzeren = gongchenganpaiFuzeren;
    }
    /**
	 * 获取：联系方式
	 */
    public String getGongchenganpaiLianxifangshi() {
        return gongchenganpaiLianxifangshi;
    }
    /**
	 * 设置：联系方式
	 */

    public void setGongchenganpaiLianxifangshi(String gongchenganpaiLianxifangshi) {
        this.gongchenganpaiLianxifangshi = gongchenganpaiLianxifangshi;
    }
    /**
	 * 获取：工程进度
	 */
    public Integer getGongchenganpaiTypes() {
        return gongchenganpaiTypes;
    }
    /**
	 * 设置：工程进度
	 */

    public void setGongchenganpaiTypes(Integer gongchenganpaiTypes) {
        this.gongchenganpaiTypes = gongchenganpaiTypes;
    }
    /**
	 * 获取：工程安排内容
	 */
    public String getGongchenganpaiContent() {
        return gongchenganpaiContent;
    }
    /**
	 * 设置：工程安排内容
	 */

    public void setGongchenganpaiContent(String gongchenganpaiContent) {
        this.gongchenganpaiContent = gongchenganpaiContent;
    }
    /**
	 * 获取：备注
	 */
    public String getGongchenganpaiBeizhuContent() {
        return gongchenganpaiBeizhuContent;
    }
    /**
	 * 设置：备注
	 */

    public void setGongchenganpaiBeizhuContent(String gongchenganpaiBeizhuContent) {
        this.gongchenganpaiBeizhuContent = gongchenganpaiBeizhuContent;
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
        return "Gongchenganpai{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", hetongId=" + hetongId +
            ", gongchenganpaiUuidNumber=" + gongchenganpaiUuidNumber +
            ", gongchenganpaiName=" + gongchenganpaiName +
            ", gongchenganpaiFile=" + gongchenganpaiFile +
            ", gongchenganpaiFuzeren=" + gongchenganpaiFuzeren +
            ", gongchenganpaiLianxifangshi=" + gongchenganpaiLianxifangshi +
            ", gongchenganpaiTypes=" + gongchenganpaiTypes +
            ", gongchenganpaiContent=" + gongchenganpaiContent +
            ", gongchenganpaiBeizhuContent=" + gongchenganpaiBeizhuContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
