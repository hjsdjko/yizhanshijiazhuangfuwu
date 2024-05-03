package com.entity.vo;

import com.entity.GongchenganpaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 工程安排
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gongchenganpai")
public class GongchenganpaiVO implements Serializable {
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
     * 工程安排编号
     */

    @TableField(value = "gongchenganpai_uuid_number")
    private String gongchenganpaiUuidNumber;


    /**
     * 工程安排名称
     */

    @TableField(value = "gongchenganpai_name")
    private String gongchenganpaiName;


    /**
     * 工程安排附件
     */

    @TableField(value = "gongchenganpai_file")
    private String gongchenganpaiFile;


    /**
     * 负责人
     */

    @TableField(value = "gongchenganpai_fuzeren")
    private String gongchenganpaiFuzeren;


    /**
     * 联系方式
     */

    @TableField(value = "gongchenganpai_lianxifangshi")
    private String gongchenganpaiLianxifangshi;


    /**
     * 工程进度
     */

    @TableField(value = "gongchenganpai_types")
    private Integer gongchenganpaiTypes;


    /**
     * 工程安排内容
     */

    @TableField(value = "gongchenganpai_content")
    private String gongchenganpaiContent;


    /**
     * 备注
     */

    @TableField(value = "gongchenganpai_beizhu_content")
    private String gongchenganpaiBeizhuContent;


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
	 * 设置：工程安排编号
	 */
    public String getGongchenganpaiUuidNumber() {
        return gongchenganpaiUuidNumber;
    }


    /**
	 * 获取：工程安排编号
	 */

    public void setGongchenganpaiUuidNumber(String gongchenganpaiUuidNumber) {
        this.gongchenganpaiUuidNumber = gongchenganpaiUuidNumber;
    }
    /**
	 * 设置：工程安排名称
	 */
    public String getGongchenganpaiName() {
        return gongchenganpaiName;
    }


    /**
	 * 获取：工程安排名称
	 */

    public void setGongchenganpaiName(String gongchenganpaiName) {
        this.gongchenganpaiName = gongchenganpaiName;
    }
    /**
	 * 设置：工程安排附件
	 */
    public String getGongchenganpaiFile() {
        return gongchenganpaiFile;
    }


    /**
	 * 获取：工程安排附件
	 */

    public void setGongchenganpaiFile(String gongchenganpaiFile) {
        this.gongchenganpaiFile = gongchenganpaiFile;
    }
    /**
	 * 设置：负责人
	 */
    public String getGongchenganpaiFuzeren() {
        return gongchenganpaiFuzeren;
    }


    /**
	 * 获取：负责人
	 */

    public void setGongchenganpaiFuzeren(String gongchenganpaiFuzeren) {
        this.gongchenganpaiFuzeren = gongchenganpaiFuzeren;
    }
    /**
	 * 设置：联系方式
	 */
    public String getGongchenganpaiLianxifangshi() {
        return gongchenganpaiLianxifangshi;
    }


    /**
	 * 获取：联系方式
	 */

    public void setGongchenganpaiLianxifangshi(String gongchenganpaiLianxifangshi) {
        this.gongchenganpaiLianxifangshi = gongchenganpaiLianxifangshi;
    }
    /**
	 * 设置：工程进度
	 */
    public Integer getGongchenganpaiTypes() {
        return gongchenganpaiTypes;
    }


    /**
	 * 获取：工程进度
	 */

    public void setGongchenganpaiTypes(Integer gongchenganpaiTypes) {
        this.gongchenganpaiTypes = gongchenganpaiTypes;
    }
    /**
	 * 设置：工程安排内容
	 */
    public String getGongchenganpaiContent() {
        return gongchenganpaiContent;
    }


    /**
	 * 获取：工程安排内容
	 */

    public void setGongchenganpaiContent(String gongchenganpaiContent) {
        this.gongchenganpaiContent = gongchenganpaiContent;
    }
    /**
	 * 设置：备注
	 */
    public String getGongchenganpaiBeizhuContent() {
        return gongchenganpaiBeizhuContent;
    }


    /**
	 * 获取：备注
	 */

    public void setGongchenganpaiBeizhuContent(String gongchenganpaiBeizhuContent) {
        this.gongchenganpaiBeizhuContent = gongchenganpaiBeizhuContent;
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
