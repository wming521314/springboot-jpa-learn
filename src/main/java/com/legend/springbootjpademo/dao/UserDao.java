package com.legend.springbootjpademo.dao;


import com.legend.springbootjpademo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long> {
    User findByAccount(String account);

    List<User> findByIdGreaterThan(Long id);

    @Query("SELECT U FROM User U ,RoleUser RU WHERE U.id = RU.userId AND RU.roleId = :roleId")
    List<User> findUsersByRole(@Param("roleId") Long roleId);
}
