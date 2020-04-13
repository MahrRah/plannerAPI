package com.planne.api.plannerapi.dao;

import com.planne.api.plannerapi.entity.Task;

import java.util.Collection;

public interface ITaskDao {
    Collection<Task> getAllTasks();

    Task getTaskByID(Long uid);

    void deleteTaskByID(Long uid);

    void updateTask(Task task);

    void addTask(Task task);
}
