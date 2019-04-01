package com.legend.springbootjpademo.vo.res;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Title ResUserInfo
 * @Description TODO
 * @Version 1.0
 * @Author Robin
 * @Date 2019/3/29 11:26
 */

@ApiModel(value="ResUserInfo", description="用户详细信息模型")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResUserInfo {

    private Long id;

    private String name;

    private Integer age;

    private String comment;

    private Long roleId;

    private String roleName;

    private List<ResAuth> authList;

}
