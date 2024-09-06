package com.to_do.todo_backend.repository;

import com.to_do.todo_backend.model.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoListRepository  extends JpaRepository<TodoList, Integer> {

    @Query(value = " select tl from TodoList tl " +
            " INNER JOIN tl.userAccount ua " +
            " where " +
            " ((tl.archived <> 'y' and tl.archived <> 'Y') or (archived is null)) " +
            " and ua.email = :userAccountEmail ")
    List<TodoList> findAllActiveTodosByUserAccountEmail(
            @Param("userAccountEmail") String userEmail);

    // finding all todos for the user without filtering on the archived status
    @Query(value = " select tl from TodoList tl " +
            " INNER JOIN tl.userAccount ua " +
            " where ua.email = :userAccountEmail ")
    List<TodoList> findAllTodosByUserAccountEmail(
            @Param("userAccountEmail") String userEmail);

}
