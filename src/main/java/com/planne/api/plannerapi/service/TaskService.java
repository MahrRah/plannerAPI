package com.planne.api.plannerapi.service;

import com.planne.api.plannerapi.dao.IMySQLRepository;
import com.planne.api.plannerapi.dao.ITaskDao;
import com.planne.api.plannerapi.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TaskService {
    @Autowired
    private IMySQLRepository taskDao;

//    public Task getTaskbyUID(long uid){
//        return taskDao.(uid);
//    }
    public void addTask(Task task){
         taskDao.save(task);
    }
    public Collection<Task> getAllTasks(){
        return taskDao.findAll();
    }


}
