package com.to_do.todo_backend.service;

import com.to_do.todo_backend.model.TodoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.to_do.todo_backend.repository.TodoListRepository;


import java.util.List;

@Service
public class TodoListServiceImp implements TodoListService{

    @Autowired
    private TodoListRepository todoListRepository;

    @Override
    public List<TodoList> getAllTodos() {
        return todoListRepository.findAll();
    }

    @Override
    public TodoList getTodoById(int id) {
        return null;
    }

    @Override
    public TodoList createTodo(TodoList todoList) {
        return todoListRepository.save(todoList);
    }

}
