package com.gabr1elluna.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String username; //Caso nada seja definido antes do String, ele será interpretado como public | exemplo: Boolean teste; -> ele é classificado como public
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

    /* 
    // Setter do username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter do username
    public String getUsername() {
        return username;
    }

    // Setter do name
    public void setName(String name) {
        this.name = name;
    }

    // Getter do name
    public String getName() {
        return name;
    }

    // Setter do password
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter do password
    public String getPassword() {
        return password;
    }
    // getters & setters servem para recuperar uma informação que esteja como private
    */
}
