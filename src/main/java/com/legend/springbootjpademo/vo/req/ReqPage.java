package com.legend.springbootjpademo.vo.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @Title ReqPage
 * @Description TODO
 * @Version 1.0
 * @Author Robin
 * @Date 2018/12/26 11:47
 */

@ApiModel(value="ReqPage", description="分页查询参数模型")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReqPage {
    @NotNull(message="pageIndex字段缺失")
    @ApiModelProperty(value="页码", name="pageIndex", example="1")
    private int pageIndex;

    @NotNull(message="pageSize字段缺失")
    @ApiModelProperty(value="每页记录条数", name="pageSize", example="10")
    private int pageSize;

}
