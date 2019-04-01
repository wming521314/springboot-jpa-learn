package com.legend.springbootjpademo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Title DtoUserRole
 * @Description TODO
 * @Version 1.0
 * @Author Robin
 * @Date 2019/1/4 17:59
 */

@Data
@AllArgsConstructor
public class DtoUserRole {

    private Long userId;

    private String userName;

    private Long roleId;

    private String roleName;

}
