package com.to_do.todo_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "User_Account")
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "Email", length = 100, nullable = false)
    private String email;

    @Column(name = "Password", length = 200, nullable = false)
    private String password;

    @Column(name = "Name", length = 500, nullable = false)
    private String name;

    @Column(name = "Telephone", length = 15)
    private String telephone;

    @Column(name = "Age")
    private Integer age;


}
