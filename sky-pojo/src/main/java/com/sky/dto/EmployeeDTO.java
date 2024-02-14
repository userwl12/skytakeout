package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "添加员工")
public class EmployeeDTO implements Serializable {

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("账号")
    private String username;

    @ApiModelProperty("员工姓名")
    private String name;

    @ApiModelProperty("电话号码")
    private String phone;

    @ApiModelProperty("性别")
    private String sex;

    @ApiModelProperty("身份证号")
    private String idNumber;

}
