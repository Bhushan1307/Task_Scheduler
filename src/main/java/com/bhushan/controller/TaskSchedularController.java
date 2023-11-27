package com.bhushan.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bhushan.model.TaskScheduler;
import com.bhushan.service.TaskSchedularService;

@RestController
public class TaskSchedularController {

	@Autowired
	TaskSchedularService ts;
	
	@PostMapping("/task")   
	public String addTask(@RequestBody TaskScheduler taskschedular) {
		return ts.addTask(taskschedular);
	}
	
	@PutMapping("/task")
	public TaskScheduler updateTask(@RequestBody TaskScheduler taskScheduler) {
		return ts.updateTask(taskScheduler);
	} 
	
	@GetMapping("/getalltask")      // change the name of Rest api here
	public List <TaskScheduler> getAllTask() {
		return ts.getAllTask();
	}
	
	
	@GetMapping("/task")
	public Optional<TaskScheduler> getTask(@RequestParam("userid")Long userid) {
		return ts.getTask(userid);
	}
	
	
	@DeleteMapping("/task")
	public String DeleteTask(@RequestParam("userid") Long userid){
		return ts.deleteTask(userid);
	}
	
	
	
}
















