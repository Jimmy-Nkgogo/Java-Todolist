package com.nkgogojimmy.todo.list.model;

public class TodoList {
    private int id;
    private String task;
    private String taskDescription;
    private boolean isCompleted;

    public TodoList(int id, String task, String taskDescription, boolean isCompleted) {
        this.id = id;
        this.task = task;
        this.taskDescription = taskDescription;
        this.isCompleted = isCompleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
