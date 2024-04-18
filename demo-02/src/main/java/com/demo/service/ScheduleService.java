package com.demo.service;

import com.demo.pojo.Schedule;
import com.demo.utils.PageBean;
import com.demo.utils.ResultDomain;

/**
 * @program: SSM-Demo
 * @description:
 * @author: David
 * @create: 2024-04-17 23:43
 **/
public interface ScheduleService {
    PageBean<Schedule> findByPage(int pageSize, int currentPage);

    ResultDomain removeById(Integer id);

    void saveSchedule(Schedule schedule);

    ResultDomain updateSchedule(Schedule schedule);
}
