package com.jeffryProject.entity;

public class Role {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_role.role_id
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_role.role_name
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private String roleName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_role.role_des
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private String roleDes;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_role.role_id
     *
     * @return the value of jeff_role.role_id
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_role.role_id
     *
     * @param roleId the value for jeff_role.role_id
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_role.role_name
     *
     * @return the value of jeff_role.role_name
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_role.role_name
     *
     * @param roleName the value for jeff_role.role_name
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_role.role_des
     *
     * @return the value of jeff_role.role_des
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public String getRoleDes() {
        return roleDes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_role.role_des
     *
     * @param roleDes the value for jeff_role.role_des
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setRoleDes(String roleDes) {
        this.roleDes = roleDes == null ? null : roleDes.trim();
    }
}