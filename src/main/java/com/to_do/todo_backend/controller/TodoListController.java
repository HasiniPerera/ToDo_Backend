package com.to_do.todo_backend.controller;

import com.to_do.todo_backend.model.TodoList;
import com.to_do.todo_backend.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoListController {

    @Autowired
    private TodoListService todoListService;

    @GetMapping
    public List<TodoList> getAllTodos() {
        return todoListService.getAllTodos();
    }

    @PostMapping
    public TodoList createTodo(@RequestBody TodoList todoList) {
        return todoListService.createTodo(todoList);
    }

    @GetMapping("/{id}")
    public TodoList getTodoById(@PathVariable int id) {
        return todoListService.getTodoById(id);
    }

}
