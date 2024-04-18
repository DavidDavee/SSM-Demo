package com.demo.controller;

import com.alibaba.druid.util.StringUtils;
import com.demo.pojo.Schedule;
import com.demo.service.ScheduleService;
import com.demo.utils.Constant;
import com.demo.utils.PageBean;
import com.demo.utils.ResultDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @program: SSM-Demo
 * @description:
 * @author: David
 * @create: 2024-04-17 23:41
 **/
@CrossOrigin
@RequestMapping("schedule")
@RestController
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    /**
     * 分页查询
     * @param pageSize
     * @param currentPage
     * @return
     */
    @GetMapping("/{pageSize}/{currentPage}")
    public ResultDomain showList(@PathVariable(name = "pageSize") int pageSize, @PathVariable(name = "currentPage") int currentPage){
        PageBean<Schedule> pageBean = scheduleService.findByPage(pageSize,currentPage);
        return  ResultDomain.ok(pageBean);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @Transactional(rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED)
    public ResultDomain removeSchedule(@PathVariable Integer id){
        return scheduleService.removeById(id);
    }

    /**
     * 新增
     * @param schedule
     * @return
     */
    @PostMapping
    @Transactional(rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED)
    public ResultDomain saveSchedule(@Validated @RequestBody Schedule schedule, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return ResultDomain.fail(Constant.PARAM_ERROR_MESSAGE);
        }
        scheduleService.saveSchedule(schedule);
        return ResultDomain.ok(schedule);
    }

    @PutMapping
    @Transactional(rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED)
    public ResultDomain changeSchedule(@Validated @RequestBody Schedule schedule, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return ResultDomain.fail(Constant.PARAM_ERROR_MESSAGE);
        }
        if (schedule.getId() == null){
            return ResultDomain.fail(Constant.PARAM_ERROR_MESSAGE);
        }
        scheduleService.updateSchedule(schedule);
        return ResultDomain.ok();
    }
}
