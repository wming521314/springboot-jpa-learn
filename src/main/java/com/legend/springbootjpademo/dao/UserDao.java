package com.legend.springbootjpademo.dao;


import com.legend.springbootjpademo.domain.User;
import com.legend.springbootjpademo.dto.DtoUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long> {
    User findByName(String name);

    List<User> findByRoleIdAndRecordStatus(Long roleId, Integer recordStatus);

    @Query("SELECT new com.legend.springbootjpademo.dto.DtoUserRole(U.id, U.name, R.id, R.name) from User U, Role R where U.id=:userId and U.roleId=R.id")
    DtoUserRole getUserRole (Long userId);

    @Query(nativeQuery = true, value="select from user u left join role r on u.role_id=r.id where u.id=:#{userId}")
    Object getUserRoleNative (Long userId);

}
