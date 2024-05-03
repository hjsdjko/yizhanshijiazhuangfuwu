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
 * 装修风格
 *
 * @author 
 * @email
 */
@TableName("zhuangxiufengge")
public class ZhuangxiufenggeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhuangxiufenggeEntity() {

	}

	public ZhuangxiufenggeEntity(T t) {
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
     * 风格名称
     */
    @ColumnInfo(comment="风格名称",type="varchar(200)")
    @TableField(value = "zhuangxiufengge_name")

    private String zhuangxiufenggeName;


    /**
     * 装修风格编号
     */
    @ColumnInfo(comment="装修风格编号",type="varchar(200)")
    @TableField(value = "zhuangxiufengge_uuid_number")

    private String zhuangxiufenggeUuidNumber;


    /**
     * 装修风格照片
     */
    @ColumnInfo(comment="装修风格照片",type="varchar(200)")
    @TableField(value = "zhuangxiufengge_photo")

    private String zhuangxiufenggePhoto;


    /**
     * 装修风格类型
     */
    @ColumnInfo(comment="装修风格类型",type="int(11)")
    @TableField(value = "zhuangxiufengge_types")

    private Integer zhuangxiufenggeTypes;


    /**
     * 户型
     */
    @ColumnInfo(comment="户型",type="int(11)")
    @TableField(value = "huxing_types")

    private Integer huxingTypes;


    /**
     * 装修风格库存
     */
    @ColumnInfo(comment="装修风格库存",type="int(11)")
    @TableField(value = "zhuangxiufengge_kucun_number")

    private Integer zhuangxiufenggeKucunNumber;


    /**
     * 风格热度
     */
    @ColumnInfo(comment="风格热度",type="int(11)")
    @TableField(value = "zhuangxiufengge_clicknum")

    private Integer zhuangxiufenggeClicknum;


    /**
     * 装修风格详情
     */
    @ColumnInfo(comment="装修风格详情",type="text")
    @TableField(value = "zhuangxiufengge_content")

    private String zhuangxiufenggeContent;


    /**
     * 是否上架
     */
    @ColumnInfo(comment="是否上架",type="int(11)")
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "zhuangxiufengge_delete")

    private Integer zhuangxiufenggeDelete;


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
	 * 获取：风格名称
	 */
    public String getZhuangxiufenggeName() {
        return zhuangxiufenggeName;
    }
    /**
	 * 设置：风格名称
	 */

    public void setZhuangxiufenggeName(String zhuangxiufenggeName) {
        this.zhuangxiufenggeName = zhuangxiufenggeName;
    }
    /**
	 * 获取：装修风格编号
	 */
    public String getZhuangxiufenggeUuidNumber() {
        return zhuangxiufenggeUuidNumber;
    }
    /**
	 * 设置：装修风格编号
	 */

    public void setZhuangxiufenggeUuidNumber(String zhuangxiufenggeUuidNumber) {
        this.zhuangxiufenggeUuidNumber = zhuangxiufenggeUuidNumber;
    }
    /**
	 * 获取：装修风格照片
	 */
    public String getZhuangxiufenggePhoto() {
        return zhuangxiufenggePhoto;
    }
    /**
	 * 设置：装修风格照片
	 */

    public void setZhuangxiufenggePhoto(String zhuangxiufenggePhoto) {
        this.zhuangxiufenggePhoto = zhuangxiufenggePhoto;
    }
    /**
	 * 获取：装修风格类型
	 */
    public Integer getZhuangxiufenggeTypes() {
        return zhuangxiufenggeTypes;
    }
    /**
	 * 设置：装修风格类型
	 */

    public void setZhuangxiufenggeTypes(Integer zhuangxiufenggeTypes) {
        this.zhuangxiufenggeTypes = zhuangxiufenggeTypes;
    }
    /**
	 * 获取：户型
	 */
    public Integer getHuxingTypes() {
        return huxingTypes;
    }
    /**
	 * 设置：户型
	 */

    public void setHuxingTypes(Integer huxingTypes) {
        this.huxingTypes = huxingTypes;
    }
    /**
	 * 获取：装修风格库存
	 */
    public Integer getZhuangxiufenggeKucunNumber() {
        return zhuangxiufenggeKucunNumber;
    }
    /**
	 * 设置：装修风格库存
	 */

    public void setZhuangxiufenggeKucunNumber(Integer zhuangxiufenggeKucunNumber) {
        this.zhuangxiufenggeKucunNumber = zhuangxiufenggeKucunNumber;
    }
    /**
	 * 获取：风格热度
	 */
    public Integer getZhuangxiufenggeClicknum() {
        return zhuangxiufenggeClicknum;
    }
    /**
	 * 设置：风格热度
	 */

    public void setZhuangxiufenggeClicknum(Integer zhuangxiufenggeClicknum) {
        this.zhuangxiufenggeClicknum = zhuangxiufenggeClicknum;
    }
    /**
	 * 获取：装修风格详情
	 */
    public String getZhuangxiufenggeContent() {
        return zhuangxiufenggeContent;
    }
    /**
	 * 设置：装修风格详情
	 */

    public void setZhuangxiufenggeContent(String zhuangxiufenggeContent) {
        this.zhuangxiufenggeContent = zhuangxiufenggeContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 设置：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getZhuangxiufenggeDelete() {
        return zhuangxiufenggeDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setZhuangxiufenggeDelete(Integer zhuangxiufenggeDelete) {
        this.zhuangxiufenggeDelete = zhuangxiufenggeDelete;
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
        return "Zhuangxiufengge{" +
            ", id=" + id +
            ", zhuangxiufenggeName=" + zhuangxiufenggeName +
            ", zhuangxiufenggeUuidNumber=" + zhuangxiufenggeUuidNumber +
            ", zhuangxiufenggePhoto=" + zhuangxiufenggePhoto +
            ", zhuangxiufenggeTypes=" + zhuangxiufenggeTypes +
            ", huxingTypes=" + huxingTypes +
            ", zhuangxiufenggeKucunNumber=" + zhuangxiufenggeKucunNumber +
            ", zhuangxiufenggeClicknum=" + zhuangxiufenggeClicknum +
            ", zhuangxiufenggeContent=" + zhuangxiufenggeContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", zhuangxiufenggeDelete=" + zhuangxiufenggeDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
