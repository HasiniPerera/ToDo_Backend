package com.to_do.todo_backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "todo_list")
public class TodoList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserAccount userAccount;

    @Column(name = "todos", length = 4000, nullable = false)
    private String todos;

    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;

    @Column(name = "updated_date")
    private Timestamp updatedDate;

    @Column(name = "archived", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String archived;

    // Automatically setting default value of 'N' before persisting if archived is null
    @PrePersist
    public void setDefaultArchived() {
        if (this.archived == null) {
            this.archived = "N";
        }
    }
}
