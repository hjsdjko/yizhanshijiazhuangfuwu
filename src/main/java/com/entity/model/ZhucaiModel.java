package com.entity.model;

import com.entity.ZhucaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 主材
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhucaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 主材名称
     */
    private String zhucaiName;


    /**
     * 主材编号
     */
    private String zhucaiUuidNumber;


    /**
     * 主材照片
     */
    private String zhucaiPhoto;


    /**
     * 单位
     */
    private String zhucaiDanwei;


    /**
     * 生产厂家
     */
    private String zhucaiShengchanchangjia;


    /**
     * 主材类型
     */
    private Integer zhucaiTypes;


    /**
     * 品牌
     */
    private Integer pinpaiTypes;


    /**
     * 主材价格
     */
    private Double zhucaiJiage;


    /**
     * 主材热度
     */
    private Integer zhucaiClicknum;


    /**
     * 主材详情
     */
    private String zhucaiContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer zhucaiDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
