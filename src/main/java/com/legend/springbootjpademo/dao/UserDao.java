package com.legend.springbootjpademo.dao;


import com.legend.springbootjpademo.domain.User;
import com.legend.springbootjpademo.dto.DtoUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long> {
    User findByName(String name);

    List<User> findByRoleIdAndRecordStatus(Long roleId, Integer recordStatus);

    @Query(nativeQuery = true, value="select id,role_id,name,sex,age,comment from user where role_id=:roleId and record_status=:recordStatus")
    List<Object> findByRoleIdAndRecordStatusNative(@Param("roleId") Long roleId, @Param("recordStatus") Integer recordStatus);

    @Query("select new com.legend.springbootjpademo.dto.DtoUserRole(U.id, U.name, R.id, R.roleName) from User U, Role R where U.id=:userId and U.roleId=R.id")
    DtoUserRole getUserRole (@Param("userId") Long userId);

    @Query(nativeQuery = true, value="select u.id,u.name,r.id,r.role_name from user u left join role r on u.role_id=r.id where u.id=:userId limit 1")
    Object getUserRoleNative (@Param("userId") Long userId);

}
