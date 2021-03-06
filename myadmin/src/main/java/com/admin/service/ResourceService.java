package com.admin.service;

import com.admin.entity.Resource;
import com.admin.entity.Role;
import com.admin.entity.RoleResource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResourceService extends IBaseService {
    /**
     *
     * 添加权限
     * @param resource
     */
    void addResource(Resource resource);


    /**
     * 删除权限
     * @param id
     */
    void delResource(@Param("id") int id);


    /**
     *
     * 获取权限列表
     * @return
     */
    List<Resource> getResourceList(@Param("keyword") String keyword,@Param("offset") int offset, @Param("limit") int limit);


    /**
     *
     * 获取一级权限
     * @param id
     * @return
     */
    List<Resource> getParentResourceList(@Param("id") int id);

    /***
     *
     * 所选中的id,逻辑删除
     * @param checkedId
     */
    void batchDelete(String[] checkedId);


    /**
     *
     * 获取管理员数量
     * @param keyword
     * @return
     */
    int getResourceCount(@Param("keyword") String keyword);


    /**
     *
     * @param id
     * @return
     */
    Resource  getResourceById(@Param("id") int id);


    /**
     *
     *
     * @param resource
     */
    void  updateResource(Resource resource);


    /**
     *
     *
     * @param id
     * @return
     */
    List<Resource>  getResourceInfo(int id);


    /**
     *
     *
     * @param role
     * @return
     */
    int  addRole(Role role);


    /**
     *
     *
     * @param item
     */
    void  addRoleResourseByList(List<RoleResource> item);


    /**
     *
     * 根据id获取记录
     * @param id
     * @return
     */
    Role  getRole(@Param("id") int id);


    /**
     *
     * @param id
     * @return
     */
    List<RoleResource>  getRoleResourceInfo(@Param("id") int id);


    /**
     *
     * 获取用户角色
     * @param keyword
     * @param offset
     * @param limit
     * @return
     */
    List<Role> getRoleList(@Param("keyword") String keyword,@Param("offset") int offset, @Param("limit") int limit);


    /**
     *
     *
     * @param keyword
     * @return
     */
    int getRoleCount(@Param("keyword") String keyword);


    /**
     *
     * 删除角色
     * @param id
     * @return
     */
    int  delRoleById(@Param("id") int id);


    /**
     *
     *
     * @param id
     * @return
     */
    int delRoleResourceByRoleId(@Param("id") int id);



    /***
     *
     * 所选中的id,逻辑删除
     * @param checkedId
     */
    void batchDeleteRole(String[] checkedId);


    /**
     *
     *
     * @param checkedId
     */
    void batchDeleteRoleResource(String[] checkedId);


    /**
     *
     *
     * @param role
     */
    void  updateRole(Role role);


    /**
     *
     *
     * @param keyword
     * @param offset
     * @param limit
     * @return
     */
    List<Role> getRoleListNew(@Param("keyword") String keyword,@Param("offset") int offset, @Param("limit") int limit);


    /**
     *
     *
     * @param keyword
     * @return
     */
    int getRoleCountNew(@Param("keyword") String keyword);


}
