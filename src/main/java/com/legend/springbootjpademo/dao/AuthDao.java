package com.legend.springbootjpademo.dao;


import com.legend.springbootjpademo.domain.Auth;
import com.legend.springbootjpademo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthDao extends JpaRepository<Auth, Long> {

}
