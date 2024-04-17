package com.demo.controller;

import com.demo.pojo.Schedule;
import com.demo.service.ScheduleService;
import com.demo.utils.PageBean;
import com.demo.utils.ResultDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SSM-Demo
 * @description:
 * @author: David
 * @create: 2024-04-17 23:41
 **/
@RequestMapping("schedule")
@RestController
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/{pageSize}/{currentPage}")
    public ResultDomain showList(@PathVariable(name = "pageSize") int pageSize, @PathVariable(name = "currentPage") int currentPage){
        PageBean<Schedule> pageBean = scheduleService.findByPage(pageSize,currentPage);
        if(true) {
            throw new RuntimeException();
        }
        return  ResultDomain.ok(pageBean);
    }
}
