package com.legend.springbootjpademo.vo.res;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Title ResUser
 * @Description TODO
 * @Version 1.0
 * @Author Robin
 * @Date 2019/3/29 11:26
 */

@ApiModel(value="ResUser", description="用户模型")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResUser {

    private Long id;

    private Long roleId;

    private String name;

    private Integer sex;

    private Integer age;

    private String comment;

}
