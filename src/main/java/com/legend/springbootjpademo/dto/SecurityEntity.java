package com.legend.springbootjpademo.dto;

import com.legend.springbootjpademo.domain.User;

public class SecurityEntity {
    private String token;
    private Long exipre;
    private User user;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getExipre() {
        return exipre;
    }

    public void setExipre(Long exipre) {
        this.exipre = exipre;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
