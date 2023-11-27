package com.bhushan.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bhushan.model.TaskScheduler;

@Repository
public interface TaskSchedulerRepository extends CrudRepository<TaskScheduler, Long>{

}
