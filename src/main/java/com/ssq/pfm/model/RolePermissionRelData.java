package com.ssq.pfm.model;

public class RolePermissionRelData {
    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 权限ID
     */
    private Long perId;

    /**
     * 角色ID
     * @return ROLE_ID 角色ID
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 角色ID
     * @param roleId 角色ID
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 权限ID
     * @return PER_ID 权限ID
     */
    public Long getPerId() {
        return perId;
    }

    /**
     * 权限ID
     * @param perId 权限ID
     */
    public void setPerId(Long perId) {
        this.perId = perId;
    }
}