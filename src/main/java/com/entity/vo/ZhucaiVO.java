package com.entity.vo;

import com.entity.ZhucaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 主材
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhucai")
public class ZhucaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 主材名称
     */

    @TableField(value = "zhucai_name")
    private String zhucaiName;


    /**
     * 主材编号
     */

    @TableField(value = "zhucai_uuid_number")
    private String zhucaiUuidNumber;


    /**
     * 主材照片
     */

    @TableField(value = "zhucai_photo")
    private String zhucaiPhoto;


    /**
     * 单位
     */

    @TableField(value = "zhucai_danwei")
    private String zhucaiDanwei;


    /**
     * 生产厂家
     */

    @TableField(value = "zhucai_shengchanchangjia")
    private String zhucaiShengchanchangjia;


    /**
     * 主材类型
     */

    @TableField(value = "zhucai_types")
    private Integer zhucaiTypes;


    /**
     * 品牌
     */

    @TableField(value = "pinpai_types")
    private Integer pinpaiTypes;


    /**
     * 主材价格
     */

    @TableField(value = "zhucai_jiage")
    private Double zhucaiJiage;


    /**
     * 主材热度
     */

    @TableField(value = "zhucai_clicknum")
    private Integer zhucaiClicknum;


    /**
     * 主材详情
     */

    @TableField(value = "zhucai_content")
    private String zhucaiContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "zhucai_delete")
    private Integer zhucaiDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：主材名称
	 */
    public String getZhucaiName() {
        return zhucaiName;
    }


    /**
	 * 获取：主材名称
	 */

    public void setZhucaiName(String zhucaiName) {
        this.zhucaiName = zhucaiName;
    }
    /**
	 * 设置：主材编号
	 */
    public String getZhucaiUuidNumber() {
        return zhucaiUuidNumber;
    }


    /**
	 * 获取：主材编号
	 */

    public void setZhucaiUuidNumber(String zhucaiUuidNumber) {
        this.zhucaiUuidNumber = zhucaiUuidNumber;
    }
    /**
	 * 设置：主材照片
	 */
    public String getZhucaiPhoto() {
        return zhucaiPhoto;
    }


    /**
	 * 获取：主材照片
	 */

    public void setZhucaiPhoto(String zhucaiPhoto) {
        this.zhucaiPhoto = zhucaiPhoto;
    }
    /**
	 * 设置：单位
	 */
    public String getZhucaiDanwei() {
        return zhucaiDanwei;
    }


    /**
	 * 获取：单位
	 */

    public void setZhucaiDanwei(String zhucaiDanwei) {
        this.zhucaiDanwei = zhucaiDanwei;
    }
    /**
	 * 设置：生产厂家
	 */
    public String getZhucaiShengchanchangjia() {
        return zhucaiShengchanchangjia;
    }


    /**
	 * 获取：生产厂家
	 */

    public void setZhucaiShengchanchangjia(String zhucaiShengchanchangjia) {
        this.zhucaiShengchanchangjia = zhucaiShengchanchangjia;
    }
    /**
	 * 设置：主材类型
	 */
    public Integer getZhucaiTypes() {
        return zhucaiTypes;
    }


    /**
	 * 获取：主材类型
	 */

    public void setZhucaiTypes(Integer zhucaiTypes) {
        this.zhucaiTypes = zhucaiTypes;
    }
    /**
	 * 设置：品牌
	 */
    public Integer getPinpaiTypes() {
        return pinpaiTypes;
    }


    /**
	 * 获取：品牌
	 */

    public void setPinpaiTypes(Integer pinpaiTypes) {
        this.pinpaiTypes = pinpaiTypes;
    }
    /**
	 * 设置：主材价格
	 */
    public Double getZhucaiJiage() {
        return zhucaiJiage;
    }


    /**
	 * 获取：主材价格
	 */

    public void setZhucaiJiage(Double zhucaiJiage) {
        this.zhucaiJiage = zhucaiJiage;
    }
    /**
	 * 设置：主材热度
	 */
    public Integer getZhucaiClicknum() {
        return zhucaiClicknum;
    }


    /**
	 * 获取：主材热度
	 */

    public void setZhucaiClicknum(Integer zhucaiClicknum) {
        this.zhucaiClicknum = zhucaiClicknum;
    }
    /**
	 * 设置：主材详情
	 */
    public String getZhucaiContent() {
        return zhucaiContent;
    }


    /**
	 * 获取：主材详情
	 */

    public void setZhucaiContent(String zhucaiContent) {
        this.zhucaiContent = zhucaiContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getZhucaiDelete() {
        return zhucaiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setZhucaiDelete(Integer zhucaiDelete) {
        this.zhucaiDelete = zhucaiDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
