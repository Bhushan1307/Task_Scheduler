package com.bhushan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.dao.TaskSchedulerRepository;
import com.bhushan.model.TaskScheduler;

@Service
public class TaskSchedularService {

	@Autowired
	TaskSchedulerRepository tsr;

	
	
	public String addTask(TaskScheduler taskSchedular) {

		if (taskSchedular.getTitle().isEmpty())
			return "Please enter task Title";
		else if(taskSchedular.getDescription().isEmpty())
			return "Please enter task description";
		else
			tsr.save(taskSchedular);
		return "Task details saved successfully";
	}

	public TaskScheduler updateTask(TaskScheduler taskScheduler) {
		if (taskScheduler.getTitle().isEmpty()){
			System.out.println("Please enter Task Title");
			return taskScheduler;
		}
		else if(taskScheduler.getDescription().isEmpty()) {
				System.out.println("Please enter Task Description");
				return taskScheduler;
		} else {
			tsr.save(taskScheduler);
			System.out.println("Task saved successfully");
			return taskScheduler;
		}
	}

	
	public List<TaskScheduler> getAllTask() {
		return (List<TaskScheduler>) tsr.findAll();
	}
	

	public Optional<TaskScheduler> getTask(Long userid) {
		if(tsr.findById(userid).isPresent())
			return tsr.findById(userid);
		else
			System.out.println("Task is not available");
			return null;
	}

	public String deleteTask(Long userid) {
		Optional<TaskScheduler> ts = tsr.findById(userid);
		
		if(ts.isPresent()) {
			tsr.deleteById(userid);
			return "Task Deleted successfully";
		}
		else {
			return "Task is not available";
		}
	}

}
















