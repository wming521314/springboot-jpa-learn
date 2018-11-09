package com.legend.springbootjpademo.dao;


import com.legend.springbootjpademo.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoleDao extends JpaRepository<Role, Long> {
    @Query("SELECT R FROM Role R ,RoleUser RU WHERE R.id = RU.roleId AND RU.userId = :userId")
    List<Role> findRolesByUser(@Param("userId") Long userId);
}
