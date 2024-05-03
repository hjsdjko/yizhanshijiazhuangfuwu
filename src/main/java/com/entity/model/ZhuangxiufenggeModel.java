package com.entity.model;

import com.entity.ZhuangxiufenggeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 装修风格
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhuangxiufenggeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 风格名称
     */
    private String zhuangxiufenggeName;


    /**
     * 装修风格编号
     */
    private String zhuangxiufenggeUuidNumber;


    /**
     * 装修风格照片
     */
    private String zhuangxiufenggePhoto;


    /**
     * 装修风格类型
     */
    private Integer zhuangxiufenggeTypes;


    /**
     * 户型
     */
    private Integer huxingTypes;


    /**
     * 装修风格库存
     */
    private Integer zhuangxiufenggeKucunNumber;


    /**
     * 风格热度
     */
    private Integer zhuangxiufenggeClicknum;


    /**
     * 装修风格详情
     */
    private String zhuangxiufenggeContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer zhuangxiufenggeDelete;


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
