package com.to_do.todo_backend.repository;

import com.to_do.todo_backend.model.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListRepository  extends JpaRepository<TodoList, Integer> {

}
