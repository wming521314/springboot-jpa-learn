package com.legend.springbootjpademo.dao;


import com.legend.springbootjpademo.domain.RoleUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleUserDao extends JpaRepository<RoleUser, Long> {
    void deleteByRoleId(Long roleId);

    void deleteByUserId(Long userId);
}
