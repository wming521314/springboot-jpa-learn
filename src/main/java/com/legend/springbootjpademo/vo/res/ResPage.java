package com.legend.springbootjpademo.vo.res;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Title ResPage
 * @Description TODO
 * @Version 1.0
 * @Author Robin
 * @Date 2018/12/26 11:50
 */

@ApiModel(value="ResPage", description="分页数据模型")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResPage<T> {

    @ApiModelProperty(value="页码", name="pageIndex", example="1")
    private int pageIndex;

    @ApiModelProperty(value="每页记录数", name="pageSize", example="10")
    private int pageSize;

    @ApiModelProperty(value="页数", name="totalPage", example="5")
    private int totalPage;

    @ApiModelProperty(value="总记录数", name="totalCount", example="456")
    private Long totalCount;

    @ApiModelProperty(value="是否还有下一页", name="hasMoreData", example="True")
    private Boolean hasMoreData;

    @NotNull
    @Valid
    @ApiModelProperty(value="数据列表", name="dataList")
    private List<T> dataList;

}
