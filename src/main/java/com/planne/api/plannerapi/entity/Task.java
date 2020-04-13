package com.planne.api.plannerapi.entity;


import javax.persistence.*;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "label")
    private String label;
    @Column(name = "duration")
    private int duration;
    @Column(name = "task_state")
    private boolean task_state;
    @Column(name = "UID")
    private String uid;
    @Column(name = "task_type")
    private String taskType;

    public Task() {
    }


    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", duration=" + duration +
                ", task_state=" + task_state +
                ", uid=" + uid +
                ", taskType='" + taskType + '\'' +
                '}';
    }


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isTask_state() {
        return task_state;
    }

    public void setTask_state(boolean task_state) {
        this.task_state = task_state;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }


}
