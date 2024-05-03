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
 * 主材
 *
 * @author 
 * @email
 */
@TableName("zhucai")
public class ZhucaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhucaiEntity() {

	}

	public ZhucaiEntity(T t) {
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
     * 主材名称
     */
    @ColumnInfo(comment="主材名称",type="varchar(200)")
    @TableField(value = "zhucai_name")

    private String zhucaiName;


    /**
     * 主材编号
     */
    @ColumnInfo(comment="主材编号",type="varchar(200)")
    @TableField(value = "zhucai_uuid_number")

    private String zhucaiUuidNumber;


    /**
     * 主材照片
     */
    @ColumnInfo(comment="主材照片",type="varchar(200)")
    @TableField(value = "zhucai_photo")

    private String zhucaiPhoto;


    /**
     * 单位
     */
    @ColumnInfo(comment="单位",type="varchar(200)")
    @TableField(value = "zhucai_danwei")

    private String zhucaiDanwei;


    /**
     * 生产厂家
     */
    @ColumnInfo(comment="生产厂家",type="varchar(200)")
    @TableField(value = "zhucai_shengchanchangjia")

    private String zhucaiShengchanchangjia;


    /**
     * 主材类型
     */
    @ColumnInfo(comment="主材类型",type="int(11)")
    @TableField(value = "zhucai_types")

    private Integer zhucaiTypes;


    /**
     * 品牌
     */
    @ColumnInfo(comment="品牌",type="int(11)")
    @TableField(value = "pinpai_types")

    private Integer pinpaiTypes;


    /**
     * 主材价格
     */
    @ColumnInfo(comment="主材价格",type="decimal(10,2)")
    @TableField(value = "zhucai_jiage")

    private Double zhucaiJiage;


    /**
     * 主材热度
     */
    @ColumnInfo(comment="主材热度",type="int(11)")
    @TableField(value = "zhucai_clicknum")

    private Integer zhucaiClicknum;


    /**
     * 主材详情
     */
    @ColumnInfo(comment="主材详情",type="text")
    @TableField(value = "zhucai_content")

    private String zhucaiContent;


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
    @TableField(value = "zhucai_delete")

    private Integer zhucaiDelete;


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
	 * 获取：主材名称
	 */
    public String getZhucaiName() {
        return zhucaiName;
    }
    /**
	 * 设置：主材名称
	 */

    public void setZhucaiName(String zhucaiName) {
        this.zhucaiName = zhucaiName;
    }
    /**
	 * 获取：主材编号
	 */
    public String getZhucaiUuidNumber() {
        return zhucaiUuidNumber;
    }
    /**
	 * 设置：主材编号
	 */

    public void setZhucaiUuidNumber(String zhucaiUuidNumber) {
        this.zhucaiUuidNumber = zhucaiUuidNumber;
    }
    /**
	 * 获取：主材照片
	 */
    public String getZhucaiPhoto() {
        return zhucaiPhoto;
    }
    /**
	 * 设置：主材照片
	 */

    public void setZhucaiPhoto(String zhucaiPhoto) {
        this.zhucaiPhoto = zhucaiPhoto;
    }
    /**
	 * 获取：单位
	 */
    public String getZhucaiDanwei() {
        return zhucaiDanwei;
    }
    /**
	 * 设置：单位
	 */

    public void setZhucaiDanwei(String zhucaiDanwei) {
        this.zhucaiDanwei = zhucaiDanwei;
    }
    /**
	 * 获取：生产厂家
	 */
    public String getZhucaiShengchanchangjia() {
        return zhucaiShengchanchangjia;
    }
    /**
	 * 设置：生产厂家
	 */

    public void setZhucaiShengchanchangjia(String zhucaiShengchanchangjia) {
        this.zhucaiShengchanchangjia = zhucaiShengchanchangjia;
    }
    /**
	 * 获取：主材类型
	 */
    public Integer getZhucaiTypes() {
        return zhucaiTypes;
    }
    /**
	 * 设置：主材类型
	 */

    public void setZhucaiTypes(Integer zhucaiTypes) {
        this.zhucaiTypes = zhucaiTypes;
    }
    /**
	 * 获取：品牌
	 */
    public Integer getPinpaiTypes() {
        return pinpaiTypes;
    }
    /**
	 * 设置：品牌
	 */

    public void setPinpaiTypes(Integer pinpaiTypes) {
        this.pinpaiTypes = pinpaiTypes;
    }
    /**
	 * 获取：主材价格
	 */
    public Double getZhucaiJiage() {
        return zhucaiJiage;
    }
    /**
	 * 设置：主材价格
	 */

    public void setZhucaiJiage(Double zhucaiJiage) {
        this.zhucaiJiage = zhucaiJiage;
    }
    /**
	 * 获取：主材热度
	 */
    public Integer getZhucaiClicknum() {
        return zhucaiClicknum;
    }
    /**
	 * 设置：主材热度
	 */

    public void setZhucaiClicknum(Integer zhucaiClicknum) {
        this.zhucaiClicknum = zhucaiClicknum;
    }
    /**
	 * 获取：主材详情
	 */
    public String getZhucaiContent() {
        return zhucaiContent;
    }
    /**
	 * 设置：主材详情
	 */

    public void setZhucaiContent(String zhucaiContent) {
        this.zhucaiContent = zhucaiContent;
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
    public Integer getZhucaiDelete() {
        return zhucaiDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setZhucaiDelete(Integer zhucaiDelete) {
        this.zhucaiDelete = zhucaiDelete;
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
        return "Zhucai{" +
            ", id=" + id +
            ", zhucaiName=" + zhucaiName +
            ", zhucaiUuidNumber=" + zhucaiUuidNumber +
            ", zhucaiPhoto=" + zhucaiPhoto +
            ", zhucaiDanwei=" + zhucaiDanwei +
            ", zhucaiShengchanchangjia=" + zhucaiShengchanchangjia +
            ", zhucaiTypes=" + zhucaiTypes +
            ", pinpaiTypes=" + pinpaiTypes +
            ", zhucaiJiage=" + zhucaiJiage +
            ", zhucaiClicknum=" + zhucaiClicknum +
            ", zhucaiContent=" + zhucaiContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", zhucaiDelete=" + zhucaiDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
