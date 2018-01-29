package cn.myself.platform.model.sys;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sys_operate")
public class SysOperate implements Serializable {
    /**
     * 操作ID
     */
    @Id
    @Column(name = "operate_id")
    private Integer operateId;

    /**
     * 所属菜单ID
     */
    @Column(name = "menu_id")
    private Integer menuId;

    /**
     * 操作名称
     */
    @Column(name = "operate_name")
    private String operateName;

    /**
     * 操作地址
     */
    @Column(name = "operate_uri")
    private String operateUri;

    /**
     * 操作状态（0：可用，1：不可用）
     */
    @Column(name = "operate_status")
    private Byte operateStatus;

    /**
     * 序列
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
     * 获取操作ID
     *
     * @return operate_id - 操作ID
     */
    public Integer getOperateId() {
        return operateId;
    }

    /**
     * 设置操作ID
     *
     * @param operateId 操作ID
     */
    public void setOperateId(Integer operateId) {
        this.operateId = operateId;
    }

    /**
     * 获取所属菜单ID
     *
     * @return menu_id - 所属菜单ID
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 设置所属菜单ID
     *
     * @param menuId 所属菜单ID
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取操作名称
     *
     * @return operate_name - 操作名称
     */
    public String getOperateName() {
        return operateName;
    }

    /**
     * 设置操作名称
     *
     * @param operateName 操作名称
     */
    public void setOperateName(String operateName) {
        this.operateName = operateName == null ? null : operateName.trim();
    }

    /**
     * 获取操作地址
     *
     * @return operate_uri - 操作地址
     */
    public String getOperateUri() {
        return operateUri;
    }

    /**
     * 设置操作地址
     *
     * @param operateUri 操作地址
     */
    public void setOperateUri(String operateUri) {
        this.operateUri = operateUri == null ? null : operateUri.trim();
    }

    /**
     * 获取操作状态（0：可用，1：不可用）
     *
     * @return operate_status - 操作状态（0：可用，1：不可用）
     */
    public Byte getOperateStatus() {
        return operateStatus;
    }

    /**
     * 设置操作状态（0：可用，1：不可用）
     *
     * @param operateStatus 操作状态（0：可用，1：不可用）
     */
    public void setOperateStatus(Byte operateStatus) {
        this.operateStatus = operateStatus;
    }

    /**
     * 获取序列
     *
     * @return sequence - 序列
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * 设置序列
     *
     * @param sequence 序列
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
        SysOperate other = (SysOperate) that;
        return (this.getOperateId() == null ? other.getOperateId() == null : this.getOperateId().equals(other.getOperateId()))
            && (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getOperateName() == null ? other.getOperateName() == null : this.getOperateName().equals(other.getOperateName()))
            && (this.getOperateUri() == null ? other.getOperateUri() == null : this.getOperateUri().equals(other.getOperateUri()))
            && (this.getOperateStatus() == null ? other.getOperateStatus() == null : this.getOperateStatus().equals(other.getOperateStatus()))
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
        result = prime * result + ((getOperateId() == null) ? 0 : getOperateId().hashCode());
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getOperateName() == null) ? 0 : getOperateName().hashCode());
        result = prime * result + ((getOperateUri() == null) ? 0 : getOperateUri().hashCode());
        result = prime * result + ((getOperateStatus() == null) ? 0 : getOperateStatus().hashCode());
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
        sb.append(", operateId=").append(operateId);
        sb.append(", menuId=").append(menuId);
        sb.append(", operateName=").append(operateName);
        sb.append(", operateUri=").append(operateUri);
        sb.append(", operateStatus=").append(operateStatus);
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