package com.entity.model;

import com.entity.GongchenganpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 工程安排
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GongchenganpaiModel implements Serializable {
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
     * 工程安排编号
     */
    private String gongchenganpaiUuidNumber;


    /**
     * 工程安排名称
     */
    private String gongchenganpaiName;


    /**
     * 工程安排附件
     */
    private String gongchenganpaiFile;


    /**
     * 负责人
     */
    private String gongchenganpaiFuzeren;


    /**
     * 联系方式
     */
    private String gongchenganpaiLianxifangshi;


    /**
     * 工程进度
     */
    private Integer gongchenganpaiTypes;


    /**
     * 工程安排内容
     */
    private String gongchenganpaiContent;


    /**
     * 备注
     */
    private String gongchenganpaiBeizhuContent;


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
	 * 获取：工程安排编号
	 */
    public String getGongchenganpaiUuidNumber() {
        return gongchenganpaiUuidNumber;
    }


    /**
	 * 设置：工程安排编号
	 */
    public void setGongchenganpaiUuidNumber(String gongchenganpaiUuidNumber) {
        this.gongchenganpaiUuidNumber = gongchenganpaiUuidNumber;
    }
    /**
	 * 获取：工程安排名称
	 */
    public String getGongchenganpaiName() {
        return gongchenganpaiName;
    }


    /**
	 * 设置：工程安排名称
	 */
    public void setGongchenganpaiName(String gongchenganpaiName) {
        this.gongchenganpaiName = gongchenganpaiName;
    }
    /**
	 * 获取：工程安排附件
	 */
    public String getGongchenganpaiFile() {
        return gongchenganpaiFile;
    }


    /**
	 * 设置：工程安排附件
	 */
    public void setGongchenganpaiFile(String gongchenganpaiFile) {
        this.gongchenganpaiFile = gongchenganpaiFile;
    }
    /**
	 * 获取：负责人
	 */
    public String getGongchenganpaiFuzeren() {
        return gongchenganpaiFuzeren;
    }


    /**
	 * 设置：负责人
	 */
    public void setGongchenganpaiFuzeren(String gongchenganpaiFuzeren) {
        this.gongchenganpaiFuzeren = gongchenganpaiFuzeren;
    }
    /**
	 * 获取：联系方式
	 */
    public String getGongchenganpaiLianxifangshi() {
        return gongchenganpaiLianxifangshi;
    }


    /**
	 * 设置：联系方式
	 */
    public void setGongchenganpaiLianxifangshi(String gongchenganpaiLianxifangshi) {
        this.gongchenganpaiLianxifangshi = gongchenganpaiLianxifangshi;
    }
    /**
	 * 获取：工程进度
	 */
    public Integer getGongchenganpaiTypes() {
        return gongchenganpaiTypes;
    }


    /**
	 * 设置：工程进度
	 */
    public void setGongchenganpaiTypes(Integer gongchenganpaiTypes) {
        this.gongchenganpaiTypes = gongchenganpaiTypes;
    }
    /**
	 * 获取：工程安排内容
	 */
    public String getGongchenganpaiContent() {
        return gongchenganpaiContent;
    }


    /**
	 * 设置：工程安排内容
	 */
    public void setGongchenganpaiContent(String gongchenganpaiContent) {
        this.gongchenganpaiContent = gongchenganpaiContent;
    }
    /**
	 * 获取：备注
	 */
    public String getGongchenganpaiBeizhuContent() {
        return gongchenganpaiBeizhuContent;
    }


    /**
	 * 设置：备注
	 */
    public void setGongchenganpaiBeizhuContent(String gongchenganpaiBeizhuContent) {
        this.gongchenganpaiBeizhuContent = gongchenganpaiBeizhuContent;
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
