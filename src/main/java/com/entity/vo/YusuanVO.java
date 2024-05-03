package com.entity.vo;

import com.entity.YusuanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 预算
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yusuan")
public class YusuanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 风格
     */

    @TableField(value = "zhuangxiufengge_id")
    private Integer zhuangxiufenggeId;


    /**
     * 预算名称
     */

    @TableField(value = "yusuan_name")
    private String yusuanName;


    /**
     * 预算编号
     */

    @TableField(value = "yusuan_uuid_number")
    private String yusuanUuidNumber;


    /**
     * 预算类型
     */

    @TableField(value = "yusuan_types")
    private Integer yusuanTypes;


    /**
     * 预计花费
     */

    @TableField(value = "yusuan_huafei")
    private Double yusuanHuafei;


    /**
     * 预算详细介绍
     */

    @TableField(value = "yusuan_content")
    private String yusuanContent;


    /**
     * 开具时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show3 photoShow
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
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：风格
	 */
    public Integer getZhuangxiufenggeId() {
        return zhuangxiufenggeId;
    }


    /**
	 * 获取：风格
	 */

    public void setZhuangxiufenggeId(Integer zhuangxiufenggeId) {
        this.zhuangxiufenggeId = zhuangxiufenggeId;
    }
    /**
	 * 设置：预算名称
	 */
    public String getYusuanName() {
        return yusuanName;
    }


    /**
	 * 获取：预算名称
	 */

    public void setYusuanName(String yusuanName) {
        this.yusuanName = yusuanName;
    }
    /**
	 * 设置：预算编号
	 */
    public String getYusuanUuidNumber() {
        return yusuanUuidNumber;
    }


    /**
	 * 获取：预算编号
	 */

    public void setYusuanUuidNumber(String yusuanUuidNumber) {
        this.yusuanUuidNumber = yusuanUuidNumber;
    }
    /**
	 * 设置：预算类型
	 */
    public Integer getYusuanTypes() {
        return yusuanTypes;
    }


    /**
	 * 获取：预算类型
	 */

    public void setYusuanTypes(Integer yusuanTypes) {
        this.yusuanTypes = yusuanTypes;
    }
    /**
	 * 设置：预计花费
	 */
    public Double getYusuanHuafei() {
        return yusuanHuafei;
    }


    /**
	 * 获取：预计花费
	 */

    public void setYusuanHuafei(Double yusuanHuafei) {
        this.yusuanHuafei = yusuanHuafei;
    }
    /**
	 * 设置：预算详细介绍
	 */
    public String getYusuanContent() {
        return yusuanContent;
    }


    /**
	 * 获取：预算详细介绍
	 */

    public void setYusuanContent(String yusuanContent) {
        this.yusuanContent = yusuanContent;
    }
    /**
	 * 设置：开具时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：开具时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show3 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show3 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
