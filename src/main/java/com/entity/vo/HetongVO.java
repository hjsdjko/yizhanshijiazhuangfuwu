package com.entity.vo;

import com.entity.HetongEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 合同
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("hetong")
public class HetongVO implements Serializable {
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
     * 合同编号
     */

    @TableField(value = "hetong_uuid_number")
    private String hetongUuidNumber;


    /**
     * 合同名称
     */

    @TableField(value = "hetong_name")
    private String hetongName;


    /**
     * 合同文件
     */

    @TableField(value = "hetong_file")
    private String hetongFile;


    /**
     * 合同状态
     */

    @TableField(value = "hetong_types")
    private Integer hetongTypes;


    /**
     * 合同金额
     */

    @TableField(value = "hetong_huafei")
    private Double hetongHuafei;


    /**
     * 违约金
     */

    @TableField(value = "hetong_weiyuejin")
    private Double hetongWeiyuejin;


    /**
     * 合同内容
     */

    @TableField(value = "hetong_content")
    private String hetongContent;


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
	 * 设置：合同编号
	 */
    public String getHetongUuidNumber() {
        return hetongUuidNumber;
    }


    /**
	 * 获取：合同编号
	 */

    public void setHetongUuidNumber(String hetongUuidNumber) {
        this.hetongUuidNumber = hetongUuidNumber;
    }
    /**
	 * 设置：合同名称
	 */
    public String getHetongName() {
        return hetongName;
    }


    /**
	 * 获取：合同名称
	 */

    public void setHetongName(String hetongName) {
        this.hetongName = hetongName;
    }
    /**
	 * 设置：合同文件
	 */
    public String getHetongFile() {
        return hetongFile;
    }


    /**
	 * 获取：合同文件
	 */

    public void setHetongFile(String hetongFile) {
        this.hetongFile = hetongFile;
    }
    /**
	 * 设置：合同状态
	 */
    public Integer getHetongTypes() {
        return hetongTypes;
    }


    /**
	 * 获取：合同状态
	 */

    public void setHetongTypes(Integer hetongTypes) {
        this.hetongTypes = hetongTypes;
    }
    /**
	 * 设置：合同金额
	 */
    public Double getHetongHuafei() {
        return hetongHuafei;
    }


    /**
	 * 获取：合同金额
	 */

    public void setHetongHuafei(Double hetongHuafei) {
        this.hetongHuafei = hetongHuafei;
    }
    /**
	 * 设置：违约金
	 */
    public Double getHetongWeiyuejin() {
        return hetongWeiyuejin;
    }


    /**
	 * 获取：违约金
	 */

    public void setHetongWeiyuejin(Double hetongWeiyuejin) {
        this.hetongWeiyuejin = hetongWeiyuejin;
    }
    /**
	 * 设置：合同内容
	 */
    public String getHetongContent() {
        return hetongContent;
    }


    /**
	 * 获取：合同内容
	 */

    public void setHetongContent(String hetongContent) {
        this.hetongContent = hetongContent;
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
