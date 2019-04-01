package com.legend.springbootjpademo.vo.res;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Title ResAuth
 * @Description TODO
 * @Version 1.0
 * @Author Robin
 * @Date 2019/3/29 11:26
 */

@ApiModel(value="ResAuth", description="权限模型")
@Data
@AllArgsConstructor
public class ResAuth {

    @ApiModelProperty(value="ID", name="id", example="1")
    private Long id;

    private String description;

}
