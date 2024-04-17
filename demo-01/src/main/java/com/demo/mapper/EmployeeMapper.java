package com.demo.mapper;

import com.demo.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: SSM-Demo
 * @description:
 * @author: David
 * @create: 2024-04-14 23:09
 **/
@Mapper
public interface EmployeeMapper {
    List<Employee> queryAll();
}
