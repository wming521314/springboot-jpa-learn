package com.legend.springbootjpademo.dao;


import com.legend.springbootjpademo.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {

}
