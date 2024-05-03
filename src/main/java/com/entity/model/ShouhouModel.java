package com.entity.model;

import com.entity.ShouhouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 售后服务
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShouhouModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 合同
     */
    private Integer hetongId;


    /**
     * 售后服务名称
     */
    private String shouhouName;


    /**
     * 售后服务编号
     */
    private String shouhouUuidNumber;


    /**
     * 售后服务附件
     */
    private String shouhouFile;


    /**
     * 服务类型
     */
    private Integer shouhouTypes;


    /**
     * 服务时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date fuwuTime;


    /**
     * 售后服务内容
     */
    private String shouhouContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show3 photoShow
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
	 * 获取：售后服务名称
	 */
    public String getShouhouName() {
        return shouhouName;
    }


    /**
	 * 设置：售后服务名称
	 */
    public void setShouhouName(String shouhouName) {
        this.shouhouName = shouhouName;
    }
    /**
	 * 获取：售后服务编号
	 */
    public String getShouhouUuidNumber() {
        return shouhouUuidNumber;
    }


    /**
	 * 设置：售后服务编号
	 */
    public void setShouhouUuidNumber(String shouhouUuidNumber) {
        this.shouhouUuidNumber = shouhouUuidNumber;
    }
    /**
	 * 获取：售后服务附件
	 */
    public String getShouhouFile() {
        return shouhouFile;
    }


    /**
	 * 设置：售后服务附件
	 */
    public void setShouhouFile(String shouhouFile) {
        this.shouhouFile = shouhouFile;
    }
    /**
	 * 获取：服务类型
	 */
    public Integer getShouhouTypes() {
        return shouhouTypes;
    }


    /**
	 * 设置：服务类型
	 */
    public void setShouhouTypes(Integer shouhouTypes) {
        this.shouhouTypes = shouhouTypes;
    }
    /**
	 * 获取：服务时间
	 */
    public Date getFuwuTime() {
        return fuwuTime;
    }


    /**
	 * 设置：服务时间
	 */
    public void setFuwuTime(Date fuwuTime) {
        this.fuwuTime = fuwuTime;
    }
    /**
	 * 获取：售后服务内容
	 */
    public String getShouhouContent() {
        return shouhouContent;
    }


    /**
	 * 设置：售后服务内容
	 */
    public void setShouhouContent(String shouhouContent) {
        this.shouhouContent = shouhouContent;
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
	 * 获取：创建时间  show3 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show3 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
