package com.legend.springbootjpademo.vo.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @Title ReqGetUserInfo
 * @Description TODO
 * @Version 1.0
 * @Author Robin
 * @Date 2019/3/29 11:26
 */

@ApiModel(value="ReqPage", description="分页查询参数模型")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReqGetUserInfo {

    @NotNull(message="userId字段缺失")
    @ApiModelProperty(value="用户ID", name="userId", example="1")
    private Long userId;

}
