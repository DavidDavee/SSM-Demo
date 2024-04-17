package com.demo.controller;

import com.demo.pojo.Employee;
import com.demo.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: SSM-Demo
 * @description:
 * @author: David
 * @create: 2024-04-14 23:15
 **/
@Slf4j
@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("list")
    public List<Employee> list(){
        List<Employee> employees = employeeService.queryAll();
        log.info("员工数据:{}",employees);
        return employees;
    }
}
