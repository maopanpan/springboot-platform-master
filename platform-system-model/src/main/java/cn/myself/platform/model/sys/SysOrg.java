package cn.myself.platform.model.sys;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sys_org")
public class SysOrg implements Serializable {
    @Id
    @Column(name = "org_id")
    private Integer orgId;

    /**
     * 上级组织ID
     */
    @Column(name = "parent_org_id")
    private Integer parentOrgId;

    /**
     * 组织名称
     */
    @Column(name = "org_name")
    private String orgName;

    /**
     * 组织说明
     */
    @Column(name = "org_remark")
    private String orgRemark;

    /**
     * 组织状态（0：可用，1：不可用）
     */
    @Column(name = "org_status")
    private Byte orgStatus;

    /**
     * 删除标识（0：未删除；1已删除）
     */
    @Column(name = "del_flag")
    private Byte delFlag;

    /**
     * 序列号
     */
    private Integer sequence;

    /**
     * 创建时间
     */
    @Column(name = "modify_date")
    private Date modifyDate;

    /**
     * 创建人ID
     */
    @Column(name = "modify_person")
    private Integer modifyPerson;

    /**
     * 更新时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 更新人ID
     */
    @Column(name = "update_person")
    private Integer updatePerson;

    private static final long serialVersionUID = 1L;

    /**
     * @return org_id
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * @param orgId
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取上级组织ID
     *
     * @return parent_org_id - 上级组织ID
     */
    public Integer getParentOrgId() {
        return parentOrgId;
    }

    /**
     * 设置上级组织ID
     *
     * @param parentOrgId 上级组织ID
     */
    public void setParentOrgId(Integer parentOrgId) {
        this.parentOrgId = parentOrgId;
    }

    /**
     * 获取组织名称
     *
     * @return org_name - 组织名称
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置组织名称
     *
     * @param orgName 组织名称
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    /**
     * 获取组织说明
     *
     * @return org_remark - 组织说明
     */
    public String getOrgRemark() {
        return orgRemark;
    }

    /**
     * 设置组织说明
     *
     * @param orgRemark 组织说明
     */
    public void setOrgRemark(String orgRemark) {
        this.orgRemark = orgRemark == null ? null : orgRemark.trim();
    }

    /**
     * 获取组织状态（0：可用，1：不可用）
     *
     * @return org_status - 组织状态（0：可用，1：不可用）
     */
    public Byte getOrgStatus() {
        return orgStatus;
    }

    /**
     * 设置组织状态（0：可用，1：不可用）
     *
     * @param orgStatus 组织状态（0：可用，1：不可用）
     */
    public void setOrgStatus(Byte orgStatus) {
        this.orgStatus = orgStatus;
    }

    /**
     * 获取删除标识（0：未删除；1已删除）
     *
     * @return del_flag - 删除标识（0：未删除；1已删除）
     */
    public Byte getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标识（0：未删除；1已删除）
     *
     * @param delFlag 删除标识（0：未删除；1已删除）
     */
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 获取序列号
     *
     * @return sequence - 序列号
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * 设置序列号
     *
     * @param sequence 序列号
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * 获取创建时间
     *
     * @return modify_date - 创建时间
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * 设置创建时间
     *
     * @param modifyDate 创建时间
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * 获取创建人ID
     *
     * @return modify_person - 创建人ID
     */
    public Integer getModifyPerson() {
        return modifyPerson;
    }

    /**
     * 设置创建人ID
     *
     * @param modifyPerson 创建人ID
     */
    public void setModifyPerson(Integer modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * 获取更新时间
     *
     * @return update_date - 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间
     *
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取更新人ID
     *
     * @return update_person - 更新人ID
     */
    public Integer getUpdatePerson() {
        return updatePerson;
    }

    /**
     * 设置更新人ID
     *
     * @param updatePerson 更新人ID
     */
    public void setUpdatePerson(Integer updatePerson) {
        this.updatePerson = updatePerson;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysOrg other = (SysOrg) that;
        return (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getParentOrgId() == null ? other.getParentOrgId() == null : this.getParentOrgId().equals(other.getParentOrgId()))
            && (this.getOrgName() == null ? other.getOrgName() == null : this.getOrgName().equals(other.getOrgName()))
            && (this.getOrgRemark() == null ? other.getOrgRemark() == null : this.getOrgRemark().equals(other.getOrgRemark()))
            && (this.getOrgStatus() == null ? other.getOrgStatus() == null : this.getOrgStatus().equals(other.getOrgStatus()))
            && (this.getDelFlag() == null ? other.getDelFlag() == null : this.getDelFlag().equals(other.getDelFlag()))
            && (this.getSequence() == null ? other.getSequence() == null : this.getSequence().equals(other.getSequence()))
            && (this.getModifyDate() == null ? other.getModifyDate() == null : this.getModifyDate().equals(other.getModifyDate()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getUpdatePerson() == null ? other.getUpdatePerson() == null : this.getUpdatePerson().equals(other.getUpdatePerson()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getParentOrgId() == null) ? 0 : getParentOrgId().hashCode());
        result = prime * result + ((getOrgName() == null) ? 0 : getOrgName().hashCode());
        result = prime * result + ((getOrgRemark() == null) ? 0 : getOrgRemark().hashCode());
        result = prime * result + ((getOrgStatus() == null) ? 0 : getOrgStatus().hashCode());
        result = prime * result + ((getDelFlag() == null) ? 0 : getDelFlag().hashCode());
        result = prime * result + ((getSequence() == null) ? 0 : getSequence().hashCode());
        result = prime * result + ((getModifyDate() == null) ? 0 : getModifyDate().hashCode());
        result = prime * result + ((getModifyPerson() == null) ? 0 : getModifyPerson().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getUpdatePerson() == null) ? 0 : getUpdatePerson().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orgId=").append(orgId);
        sb.append(", parentOrgId=").append(parentOrgId);
        sb.append(", orgName=").append(orgName);
        sb.append(", orgRemark=").append(orgRemark);
        sb.append(", orgStatus=").append(orgStatus);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", sequence=").append(sequence);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", modifyPerson=").append(modifyPerson);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", updatePerson=").append(updatePerson);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}