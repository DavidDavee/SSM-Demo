package com.demo.mapper;

import com.demo.pojo.Schedule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: SSM-Demo
 * @description:
 * @author: David
 * @create: 2024-04-17 23:46
 **/
@Mapper
public interface ScheduleMapper {
    List<Schedule> queryPage();

    int delete(Integer id);

    void insert(Schedule schedule);

    int update(Schedule schedule);
}
