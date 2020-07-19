package com.bjtu.mall.dao;

import com.bjtu.mall.model.UmsPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 后台用户与角色管理自定义Dao
 *
 * @author yinzhiqiang
 * @date 2020/7/19 16:43
 */
@Mapper
public interface UmsAdminRoleRelationDao {
    /**
     * 获取用户所有权限(包括+-权限)
     *
     * @param adminId 用户ID
     * @return List  用户所有权限
     */
    @Select("select * from ums_admin_permission_relation where admin_id=#{adminId}")
    List<UmsPermission> getPermissionList(Long adminId);
}
