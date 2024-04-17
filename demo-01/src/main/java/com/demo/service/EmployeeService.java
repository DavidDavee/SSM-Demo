package com.demo.service;

import com.demo.pojo.Employee;

import java.util.List;

/**
 * @program: SSM-Demo
 * @description:
 * @author: David
 * @create: 2024-04-14 23:12
 **/
public interface EmployeeService {
    List<Employee> queryAll();
}
