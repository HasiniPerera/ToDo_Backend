package com.to_do.todo_backend.service;

import com.to_do.todo_backend.model.TodoList;

import java.util.List;


public interface TodoListService {

    //List<TodoList> getAllTodos();

    List<TodoList> getAllActiveTodosByUserAccountEmail(String userAccountEmail);

    List<TodoList> getAllTodosByUserAccountEmail(String userAccountEmail);

    TodoList getTodoById(int id);

    TodoList createTodo(TodoList todoList);

    TodoList updateTodo(int id, TodoList todoListDetails);

    void deleteTodoById(int id);

    TodoList archiveTodo(int id);

}

