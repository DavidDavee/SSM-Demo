package com.demo.service.serviceImpl;

import com.demo.mapper.EmployeeMapper;
import com.demo.pojo.Employee;
import com.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: SSM-Demo
 * @description:
 * @author: David
 * @create: 2024-04-14 23:13
 **/
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> queryAll() {
        return employeeMapper.queryAll();
    }
}
