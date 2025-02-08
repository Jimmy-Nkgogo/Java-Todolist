package com.nkgogojimmy.todo.list.service;

import com.nkgogojimmy.todo.list.model.TodoList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoListService {
    private List<TodoList> todoList;

    public TodoListService() {
        todoList = new ArrayList<>();

        TodoList todoList1 = new TodoList(1,"Learn Spring boot","Learn how to create APIs with Java",false);
        todoList.add(todoList1);
    }
}
