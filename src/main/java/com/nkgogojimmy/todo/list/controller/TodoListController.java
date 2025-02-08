package com.nkgogojimmy.todo.list.controller;

import com.nkgogojimmy.todo.list.model.TodoList;
import com.nkgogojimmy.todo.list.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoListController {
    @Autowired
    private TodoListService todoListService;

    @GetMapping("/tasks")
    public ResponseEntity<?> getTasks() {
        try {
            return new ResponseEntity<>(todoListService.getAllTodoLists(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("Failed to fetch data",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/tasks/{id}")
    public ResponseEntity<?> getTaskById(@PathVariable int id) {
        try {
            return new ResponseEntity<>(todoListService.getTask(id),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to get task",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/tasks")
    public ResponseEntity<?> createTask(@RequestBody TodoList todoList) {
        try {
            todoListService.createTask(todoList);
            return new ResponseEntity<>("Successfully created a todo",HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to create new todo",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
