package com.entity.vo;

import com.entity.ZhuangxiufenggeEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 装修风格
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhuangxiufengge")
public class ZhuangxiufenggeVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 风格名称
     */

    @TableField(value = "zhuangxiufengge_name")
    private String zhuangxiufenggeName;


    /**
     * 装修风格编号
     */

    @TableField(value = "zhuangxiufengge_uuid_number")
    private String zhuangxiufenggeUuidNumber;


    /**
     * 装修风格照片
     */

    @TableField(value = "zhuangxiufengge_photo")
    private String zhuangxiufenggePhoto;


    /**
     * 装修风格类型
     */

    @TableField(value = "zhuangxiufengge_types")
    private Integer zhuangxiufenggeTypes;


    /**
     * 户型
     */

    @TableField(value = "huxing_types")
    private Integer huxingTypes;


    /**
     * 装修风格库存
     */

    @TableField(value = "zhuangxiufengge_kucun_number")
    private Integer zhuangxiufenggeKucunNumber;


    /**
     * 风格热度
     */

    @TableField(value = "zhuangxiufengge_clicknum")
    private Integer zhuangxiufenggeClicknum;


    /**
     * 装修风格详情
     */

    @TableField(value = "zhuangxiufengge_content")
    private String zhuangxiufenggeContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "zhuangxiufengge_delete")
    private Integer zhuangxiufenggeDelete;


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
	 * 设置：风格名称
	 */
    public String getZhuangxiufenggeName() {
        return zhuangxiufenggeName;
    }


    /**
	 * 获取：风格名称
	 */

    public void setZhuangxiufenggeName(String zhuangxiufenggeName) {
        this.zhuangxiufenggeName = zhuangxiufenggeName;
    }
    /**
	 * 设置：装修风格编号
	 */
    public String getZhuangxiufenggeUuidNumber() {
        return zhuangxiufenggeUuidNumber;
    }


    /**
	 * 获取：装修风格编号
	 */

    public void setZhuangxiufenggeUuidNumber(String zhuangxiufenggeUuidNumber) {
        this.zhuangxiufenggeUuidNumber = zhuangxiufenggeUuidNumber;
    }
    /**
	 * 设置：装修风格照片
	 */
    public String getZhuangxiufenggePhoto() {
        return zhuangxiufenggePhoto;
    }


    /**
	 * 获取：装修风格照片
	 */

    public void setZhuangxiufenggePhoto(String zhuangxiufenggePhoto) {
        this.zhuangxiufenggePhoto = zhuangxiufenggePhoto;
    }
    /**
	 * 设置：装修风格类型
	 */
    public Integer getZhuangxiufenggeTypes() {
        return zhuangxiufenggeTypes;
    }


    /**
	 * 获取：装修风格类型
	 */

    public void setZhuangxiufenggeTypes(Integer zhuangxiufenggeTypes) {
        this.zhuangxiufenggeTypes = zhuangxiufenggeTypes;
    }
    /**
	 * 设置：户型
	 */
    public Integer getHuxingTypes() {
        return huxingTypes;
    }


    /**
	 * 获取：户型
	 */

    public void setHuxingTypes(Integer huxingTypes) {
        this.huxingTypes = huxingTypes;
    }
    /**
	 * 设置：装修风格库存
	 */
    public Integer getZhuangxiufenggeKucunNumber() {
        return zhuangxiufenggeKucunNumber;
    }


    /**
	 * 获取：装修风格库存
	 */

    public void setZhuangxiufenggeKucunNumber(Integer zhuangxiufenggeKucunNumber) {
        this.zhuangxiufenggeKucunNumber = zhuangxiufenggeKucunNumber;
    }
    /**
	 * 设置：风格热度
	 */
    public Integer getZhuangxiufenggeClicknum() {
        return zhuangxiufenggeClicknum;
    }


    /**
	 * 获取：风格热度
	 */

    public void setZhuangxiufenggeClicknum(Integer zhuangxiufenggeClicknum) {
        this.zhuangxiufenggeClicknum = zhuangxiufenggeClicknum;
    }
    /**
	 * 设置：装修风格详情
	 */
    public String getZhuangxiufenggeContent() {
        return zhuangxiufenggeContent;
    }


    /**
	 * 获取：装修风格详情
	 */

    public void setZhuangxiufenggeContent(String zhuangxiufenggeContent) {
        this.zhuangxiufenggeContent = zhuangxiufenggeContent;
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
    public Integer getZhuangxiufenggeDelete() {
        return zhuangxiufenggeDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setZhuangxiufenggeDelete(Integer zhuangxiufenggeDelete) {
        this.zhuangxiufenggeDelete = zhuangxiufenggeDelete;
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
