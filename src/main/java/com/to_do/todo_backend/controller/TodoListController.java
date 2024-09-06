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

//    @GetMapping
//    public List<TodoList> getAllTodos() {
//        return todoListService.getAllTodos();
//    }
    @GetMapping("/getAllActiveTodosByUserAccountEmail/{userAccountEmail}")
    public List<TodoList> getAllActiveTodosByUserAccountEmail(@PathVariable String userAccountEmail) {
        return todoListService.getAllActiveTodosByUserAccountEmail(userAccountEmail);
}

    @GetMapping("/getAllTodosByUserAccountEmail/{userAccountEmail}")
    public List<TodoList> getAllTodosByUserAccountEmail(@PathVariable String userAccountEmail) {
        return todoListService.getAllTodosByUserAccountEmail(userAccountEmail);
    }

    @PostMapping
    public TodoList createTodo(@RequestBody TodoList todoList) {
        return todoListService.createTodo(todoList);
    }

    @GetMapping("/{id}")
    public TodoList getTodoById(@PathVariable int id) {
        return todoListService.getTodoById(id);
    }

    @PutMapping("/{id}")
    public TodoList updateTodo(@PathVariable int id, @RequestBody TodoList todoList){
        return todoListService.updateTodo(id, todoList);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable int id) {
        todoListService.deleteTodoById(id);
    }

    @PutMapping("/archiveTodo/{id}")
    public TodoList updateTodo(@PathVariable int id) {
        return todoListService.archiveTodo(id);
    }
}
