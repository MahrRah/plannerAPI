package com.planne.api.plannerapi.controller;


import com.planne.api.plannerapi.entity.Task;
import com.planne.api.plannerapi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/tasks")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TaskContoller {
    @Autowired
    private TaskService taskService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Task> getAllItems() {
        return taskService.getAllTasks();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addTask(@RequestBody Task task){
        taskService.addTask(task);}

}
