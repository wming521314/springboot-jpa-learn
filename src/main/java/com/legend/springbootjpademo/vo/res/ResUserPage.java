package com.legend.springbootjpademo.vo.res;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Title ResUserPage
 * @Description TODO
 * @Version 1.0
 * @Author Robin
 * @Date 2019/3/29 11:26
 */

@ApiModel(value="ResUserPage", description="用户详细信息模型")
@Data
@AllArgsConstructor
//@NoArgsConstructor
public class ResUserPage extends ResPage <ResUser> {

}
