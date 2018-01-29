package cn.myself.platform.model.sys;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sys_user_to_menu")
public class SysUserToMenu implements Serializable {
    /**
     * 用户菜单关键ID
     */
    @Id
    @Column(name = "user_to_menu_id")
    private Integer userToMenuId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 菜单ID
     */
    @Column(name = "menu_id")
    private Integer menuId;

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
     * 获取用户菜单关键ID
     *
     * @return user_to_menu_id - 用户菜单关键ID
     */
    public Integer getUserToMenuId() {
        return userToMenuId;
    }

    /**
     * 设置用户菜单关键ID
     *
     * @param userToMenuId 用户菜单关键ID
     */
    public void setUserToMenuId(Integer userToMenuId) {
        this.userToMenuId = userToMenuId;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

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
        SysUserToMenu other = (SysUserToMenu) that;
        return (this.getUserToMenuId() == null ? other.getUserToMenuId() == null : this.getUserToMenuId().equals(other.getUserToMenuId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getModifyDate() == null ? other.getModifyDate() == null : this.getModifyDate().equals(other.getModifyDate()))
            && (this.getModifyPerson() == null ? other.getModifyPerson() == null : this.getModifyPerson().equals(other.getModifyPerson()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getUpdatePerson() == null ? other.getUpdatePerson() == null : this.getUpdatePerson().equals(other.getUpdatePerson()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserToMenuId() == null) ? 0 : getUserToMenuId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
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
        sb.append(", userToMenuId=").append(userToMenuId);
        sb.append(", userId=").append(userId);
        sb.append(", menuId=").append(menuId);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", modifyPerson=").append(modifyPerson);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", updatePerson=").append(updatePerson);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}