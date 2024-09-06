package com.to_do.todo_backend.service;

import com.to_do.todo_backend.model.TodoList;

import java.util.List;


public interface TodoListService {

    List<TodoList> getAllTodos();

    TodoList getTodoById(int id);

    TodoList createTodo(TodoList todoList);

}

