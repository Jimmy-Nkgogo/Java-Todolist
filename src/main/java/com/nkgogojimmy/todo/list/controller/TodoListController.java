package com.nkgogojimmy.todo.list.controller;

import com.nkgogojimmy.todo.list.model.TodoList;
import com.nkgogojimmy.todo.list.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
