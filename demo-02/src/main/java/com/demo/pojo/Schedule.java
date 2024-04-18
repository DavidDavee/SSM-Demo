package com.demo.pojo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @program: SSM-Demo
 * @description:
 * @author: David
 * @create: 2024-04-17 23:35
 **/
@Data
public class Schedule {

    private Integer id;

    @NotBlank
    private String title;

    @NotNull
    private Boolean completed;

}
