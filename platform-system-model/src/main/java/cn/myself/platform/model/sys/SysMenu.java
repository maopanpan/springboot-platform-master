package cn.myself.platform.model.sys;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sys_menu")
public class SysMenu implements Serializable {
    /**
     * 菜单ID
     */
    @Id
    @Column(name = "menu_id")
    private Integer menuId;

    /**
     * 菜单编号
     */
    @Column(name = "menu_code")
    private String menuCode;

    /**
     * 父菜单ID
     */
    @Column(name = "parent_menu_id")
    private Integer parentMenuId;

    /**
     * 菜单名称
     */
    @Column(name = "menu_name")
    private String menuName;

    /**
     * 菜单描述
     */
    @Column(name = "menu_remark")
    private String menuRemark;

    /**
     * 菜单状态（0：可用，1：不可用）
     */
    @Column(name = "menu_status")
    private Byte menuStatus;

    /**
     * 菜单地址
     */
    @Column(name = "menu_uri")
    private String menuUri;

    /**
     * 图标样式
     */
    @Column(name = "icon_css")
    private String iconCss;

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
     * 创建人
     */
    @Column(name = "modify_person")
    private Integer modifyPerson;

    /**
     * 更新时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 更新人
     */
    @Column(name = "update_person")
    private Integer updatePerson;

    private static final long serialVersionUID = 1L;

    /**
     * 获取菜单ID
     *
     * @return menu_id - 菜单ID
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 设置菜单ID
     *
     * @param menuId 菜单ID
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取菜单编号
     *
     * @return menu_code - 菜单编号
     */
    public String getMenuCode() {
        return menuCode;
    }

    /**
     * 设置菜单编号
     *
     * @param menuCode 菜单编号
     */
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    /**
     * 获取父菜单ID
     *
     * @return parent_menu_id - 父菜单ID
     */
    public Integer getParentMenuId() {
        return parentMenuId;
    }

    /**
     * 设置父菜单ID
     *
     * @param parentMenuId 父菜单ID
     */
    public void setParentMenuId(Integer parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    /**
     * 获取菜单名称
     *
     * @return menu_name - 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置菜单名称
     *
     * @param menuName 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * 获取菜单描述
     *
     * @return menu_remark - 菜单描述
     */
    public String getMenuRemark() {
        return menuRemark;
    }

    /**
     * 设置菜单描述
     *
     * @param menuRemark 菜单描述
     */
    public void setMenuRemark(String menuRemark) {
        this.menuRemark = menuRemark == null ? null : menuRemark.trim();
    }

    /**
     * 获取菜单状态（0：可用，1：不可用）
     *
     * @return menu_status - 菜单状态（0：可用，1：不可用）
     */
    public Byte getMenuStatus() {
        return menuStatus;
    }

    /**
     * 设置菜单状态（0：可用，1：不可用）
     *
     * @param menuStatus 菜单状态（0：可用，1：不可用）
     */
    public void setMenuStatus(Byte menuStatus) {
        this.menuStatus = menuStatus;
    }

    /**
     * 获取菜单地址
     *
     * @return menu_uri - 菜单地址
     */
    public String getMenuUri() {
        return menuUri;
    }

    /**
     * 设置菜单地址
     *
     * @param menuUri 菜单地址
     */
    public void setMenuUri(String menuUri) {
        this.menuUri = menuUri == null ? null : menuUri.trim();
    }

    /**
     * 获取图标样式
     *
     * @return icon_css - 图标样式
     */
    public String getIconCss() {
        return iconCss;
    }

    /**
     * 设置图标样式
     *
     * @param iconCss 图标样式
     */
    public void setIconCss(String iconCss) {
        this.iconCss = iconCss == null ? null : iconCss.trim();
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
     * 获取创建人
     *
     * @return modify_person - 创建人
     */
    public Integer getModifyPerson() {
        return modifyPerson;
    }

    /**
     * 设置创建人
     *
     * @param modifyPerson 创建人
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
     * 获取更新人
     *
     * @return update_person - 更新人
     */
    public Integer getUpdatePerson() {
        return updatePerson;
    }

    /**
     * 设置更新人
     *
     * @param updatePerson 更新人
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
        SysMenu other = (SysMenu) that;
        return (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getMenuCode() == null ? other.getMenuCode() == null : this.getMenuCode().equals(other.getMenuCode()))
            && (this.getParentMenuId() == null ? other.getParentMenuId() == null : this.getParentMenuId().equals(other.getParentMenuId()))
            && (this.getMenuName() == null ? other.getMenuName() == null : this.getMenuName().equals(other.getMenuName()))
            && (this.getMenuRemark() == null ? other.getMenuRemark() == null : this.getMenuRemark().equals(other.getMenuRemark()))
            && (this.getMenuStatus() == null ? other.getMenuStatus() == null : this.getMenuStatus().equals(other.getMenuStatus()))
            && (this.getMenuUri() == null ? other.getMenuUri() == null : this.getMenuUri().equals(other.getMenuUri()))
            && (this.getIconCss() == null ? other.getIconCss() == null : this.getIconCss().equals(other.getIconCss()))
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
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getMenuCode() == null) ? 0 : getMenuCode().hashCode());
        result = prime * result + ((getParentMenuId() == null) ? 0 : getParentMenuId().hashCode());
        result = prime * result + ((getMenuName() == null) ? 0 : getMenuName().hashCode());
        result = prime * result + ((getMenuRemark() == null) ? 0 : getMenuRemark().hashCode());
        result = prime * result + ((getMenuStatus() == null) ? 0 : getMenuStatus().hashCode());
        result = prime * result + ((getMenuUri() == null) ? 0 : getMenuUri().hashCode());
        result = prime * result + ((getIconCss() == null) ? 0 : getIconCss().hashCode());
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
        sb.append(", menuId=").append(menuId);
        sb.append(", menuCode=").append(menuCode);
        sb.append(", parentMenuId=").append(parentMenuId);
        sb.append(", menuName=").append(menuName);
        sb.append(", menuRemark=").append(menuRemark);
        sb.append(", menuStatus=").append(menuStatus);
        sb.append(", menuUri=").append(menuUri);
        sb.append(", iconCss=").append(iconCss);
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