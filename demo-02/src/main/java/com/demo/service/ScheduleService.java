package com.demo.service;

import com.demo.pojo.Schedule;
import com.demo.utils.PageBean;

/**
 * @program: SSM-Demo
 * @description:
 * @author: David
 * @create: 2024-04-17 23:43
 **/
public interface ScheduleService {
    PageBean<Schedule> findByPage(int pageSize, int currentPage);
}
