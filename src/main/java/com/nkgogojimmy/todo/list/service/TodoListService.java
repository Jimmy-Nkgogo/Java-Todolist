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
        TodoList todoList2 = new TodoList(2,"Buy Groceries","Buy Milk, Chicken breasts and 60 eggs",false);

        todoList.add(todoList1);
        todoList.add(todoList2);
    }

    public List<TodoList> getAllTodoLists() {
        return todoList;
    }

    public TodoList getTask(int id) {
        for(TodoList todo: todoList) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }

    public void createTask(TodoList todo) {
        TodoList todoList1 = new TodoList(todo.getId(),todo.getTask(),todo.getTaskDescription(),todo.isCompleted());
        todoList.add(todoList1);
    }
}
