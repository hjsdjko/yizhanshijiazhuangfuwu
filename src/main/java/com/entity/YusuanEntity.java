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
 * 预算
 *
 * @author 
 * @email
 */
@TableName("yusuan")
public class YusuanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YusuanEntity() {

	}

	public YusuanEntity(T t) {
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
     * 风格
     */
    @ColumnInfo(comment="风格",type="int(11)")
    @TableField(value = "zhuangxiufengge_id")

    private Integer zhuangxiufenggeId;


    /**
     * 预算名称
     */
    @ColumnInfo(comment="预算名称",type="varchar(200)")
    @TableField(value = "yusuan_name")

    private String yusuanName;


    /**
     * 预算编号
     */
    @ColumnInfo(comment="预算编号",type="varchar(200)")
    @TableField(value = "yusuan_uuid_number")

    private String yusuanUuidNumber;


    /**
     * 预算类型
     */
    @ColumnInfo(comment="预算类型",type="int(11)")
    @TableField(value = "yusuan_types")

    private Integer yusuanTypes;


    /**
     * 预计花费
     */
    @ColumnInfo(comment="预计花费",type="decimal(10,2)")
    @TableField(value = "yusuan_huafei")

    private Double yusuanHuafei;


    /**
     * 预算详细介绍
     */
    @ColumnInfo(comment="预算详细介绍",type="text")
    @TableField(value = "yusuan_content")

    private String yusuanContent;


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
	 * 获取：风格
	 */
    public Integer getZhuangxiufenggeId() {
        return zhuangxiufenggeId;
    }
    /**
	 * 设置：风格
	 */

    public void setZhuangxiufenggeId(Integer zhuangxiufenggeId) {
        this.zhuangxiufenggeId = zhuangxiufenggeId;
    }
    /**
	 * 获取：预算名称
	 */
    public String getYusuanName() {
        return yusuanName;
    }
    /**
	 * 设置：预算名称
	 */

    public void setYusuanName(String yusuanName) {
        this.yusuanName = yusuanName;
    }
    /**
	 * 获取：预算编号
	 */
    public String getYusuanUuidNumber() {
        return yusuanUuidNumber;
    }
    /**
	 * 设置：预算编号
	 */

    public void setYusuanUuidNumber(String yusuanUuidNumber) {
        this.yusuanUuidNumber = yusuanUuidNumber;
    }
    /**
	 * 获取：预算类型
	 */
    public Integer getYusuanTypes() {
        return yusuanTypes;
    }
    /**
	 * 设置：预算类型
	 */

    public void setYusuanTypes(Integer yusuanTypes) {
        this.yusuanTypes = yusuanTypes;
    }
    /**
	 * 获取：预计花费
	 */
    public Double getYusuanHuafei() {
        return yusuanHuafei;
    }
    /**
	 * 设置：预计花费
	 */

    public void setYusuanHuafei(Double yusuanHuafei) {
        this.yusuanHuafei = yusuanHuafei;
    }
    /**
	 * 获取：预算详细介绍
	 */
    public String getYusuanContent() {
        return yusuanContent;
    }
    /**
	 * 设置：预算详细介绍
	 */

    public void setYusuanContent(String yusuanContent) {
        this.yusuanContent = yusuanContent;
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
        return "Yusuan{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", zhuangxiufenggeId=" + zhuangxiufenggeId +
            ", yusuanName=" + yusuanName +
            ", yusuanUuidNumber=" + yusuanUuidNumber +
            ", yusuanTypes=" + yusuanTypes +
            ", yusuanHuafei=" + yusuanHuafei +
            ", yusuanContent=" + yusuanContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
