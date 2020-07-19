package com.bjtu.mall.dao;

import com.bjtu.mall.model.UmsAdmin;
import org.apache.ibatis.annotations.*;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

/**
 * @author yinzhiqiang
 * @date 2020/7/19 16:42
 */
@Mapper
public interface UmsAdminDao {
    /**
     * 根据用户名查询用户
     *
     * @param username 用户名
     * @return UmsAdmin 后台用户
     */
    @Select("select * from ums_admin where username=#{username}")
    UmsAdmin getUmsAdminByUsername(String username);

    /**
     * 新增用户
     *
     * @param admin 用户
     * @return int 0代表失败，1代表成功
     */
    @Insert("insert into ums_admin(id,username,password,icon,email,nick_name,note,create_time,login_time,status)values(#{id},#{username},#{password},#{icon},#{email},#{nickName},#{note},#{createTime},#{loginTime},#{status})")
    int saveAdmin(UmsAdmin admin);
}
