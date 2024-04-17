package com.demo.pojo;

import lombok.Data;

/**
 * @program: SSM-Demo
 * @description:
 * @author: David
 * @create: 2024-04-14 18:32
 **/
@Data
public class Employee {
    private Integer empId;
    private String empName;
    private Double empSalary;
}