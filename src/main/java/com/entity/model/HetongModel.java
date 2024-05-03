package com.entity.model;

import com.entity.HetongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 合同
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HetongModel implements Serializable {
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
     * 合同编号
     */
    private String hetongUuidNumber;


    /**
     * 合同名称
     */
    private String hetongName;


    /**
     * 合同文件
     */
    private String hetongFile;


    /**
     * 合同状态
     */
    private Integer hetongTypes;


    /**
     * 合同金额
     */
    private Double hetongHuafei;


    /**
     * 违约金
     */
    private Double hetongWeiyuejin;


    /**
     * 合同内容
     */
    private String hetongContent;


    /**
     * 开具时间
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
	 * 获取：合同编号
	 */
    public String getHetongUuidNumber() {
        return hetongUuidNumber;
    }


    /**
	 * 设置：合同编号
	 */
    public void setHetongUuidNumber(String hetongUuidNumber) {
        this.hetongUuidNumber = hetongUuidNumber;
    }
    /**
	 * 获取：合同名称
	 */
    public String getHetongName() {
        return hetongName;
    }


    /**
	 * 设置：合同名称
	 */
    public void setHetongName(String hetongName) {
        this.hetongName = hetongName;
    }
    /**
	 * 获取：合同文件
	 */
    public String getHetongFile() {
        return hetongFile;
    }


    /**
	 * 设置：合同文件
	 */
    public void setHetongFile(String hetongFile) {
        this.hetongFile = hetongFile;
    }
    /**
	 * 获取：合同状态
	 */
    public Integer getHetongTypes() {
        return hetongTypes;
    }


    /**
	 * 设置：合同状态
	 */
    public void setHetongTypes(Integer hetongTypes) {
        this.hetongTypes = hetongTypes;
    }
    /**
	 * 获取：合同金额
	 */
    public Double getHetongHuafei() {
        return hetongHuafei;
    }


    /**
	 * 设置：合同金额
	 */
    public void setHetongHuafei(Double hetongHuafei) {
        this.hetongHuafei = hetongHuafei;
    }
    /**
	 * 获取：违约金
	 */
    public Double getHetongWeiyuejin() {
        return hetongWeiyuejin;
    }


    /**
	 * 设置：违约金
	 */
    public void setHetongWeiyuejin(Double hetongWeiyuejin) {
        this.hetongWeiyuejin = hetongWeiyuejin;
    }
    /**
	 * 获取：合同内容
	 */
    public String getHetongContent() {
        return hetongContent;
    }


    /**
	 * 设置：合同内容
	 */
    public void setHetongContent(String hetongContent) {
        this.hetongContent = hetongContent;
    }
    /**
	 * 获取：开具时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：开具时间
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
