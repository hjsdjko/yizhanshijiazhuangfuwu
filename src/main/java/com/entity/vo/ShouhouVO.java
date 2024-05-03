package com.entity.vo;

import com.entity.ShouhouEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 售后服务
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shouhou")
public class ShouhouVO implements Serializable {
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
     * 合同
     */

    @TableField(value = "hetong_id")
    private Integer hetongId;


    /**
     * 售后服务名称
     */

    @TableField(value = "shouhou_name")
    private String shouhouName;


    /**
     * 售后服务编号
     */

    @TableField(value = "shouhou_uuid_number")
    private String shouhouUuidNumber;


    /**
     * 售后服务附件
     */

    @TableField(value = "shouhou_file")
    private String shouhouFile;


    /**
     * 服务类型
     */

    @TableField(value = "shouhou_types")
    private Integer shouhouTypes;


    /**
     * 服务时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "fuwu_time")
    private Date fuwuTime;


    /**
     * 售后服务内容
     */

    @TableField(value = "shouhou_content")
    private String shouhouContent;


    /**
     * 录入时间
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
	 * 设置：合同
	 */
    public Integer getHetongId() {
        return hetongId;
    }


    /**
	 * 获取：合同
	 */

    public void setHetongId(Integer hetongId) {
        this.hetongId = hetongId;
    }
    /**
	 * 设置：售后服务名称
	 */
    public String getShouhouName() {
        return shouhouName;
    }


    /**
	 * 获取：售后服务名称
	 */

    public void setShouhouName(String shouhouName) {
        this.shouhouName = shouhouName;
    }
    /**
	 * 设置：售后服务编号
	 */
    public String getShouhouUuidNumber() {
        return shouhouUuidNumber;
    }


    /**
	 * 获取：售后服务编号
	 */

    public void setShouhouUuidNumber(String shouhouUuidNumber) {
        this.shouhouUuidNumber = shouhouUuidNumber;
    }
    /**
	 * 设置：售后服务附件
	 */
    public String getShouhouFile() {
        return shouhouFile;
    }


    /**
	 * 获取：售后服务附件
	 */

    public void setShouhouFile(String shouhouFile) {
        this.shouhouFile = shouhouFile;
    }
    /**
	 * 设置：服务类型
	 */
    public Integer getShouhouTypes() {
        return shouhouTypes;
    }


    /**
	 * 获取：服务类型
	 */

    public void setShouhouTypes(Integer shouhouTypes) {
        this.shouhouTypes = shouhouTypes;
    }
    /**
	 * 设置：服务时间
	 */
    public Date getFuwuTime() {
        return fuwuTime;
    }


    /**
	 * 获取：服务时间
	 */

    public void setFuwuTime(Date fuwuTime) {
        this.fuwuTime = fuwuTime;
    }
    /**
	 * 设置：售后服务内容
	 */
    public String getShouhouContent() {
        return shouhouContent;
    }


    /**
	 * 获取：售后服务内容
	 */

    public void setShouhouContent(String shouhouContent) {
        this.shouhouContent = shouhouContent;
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
