package com.example.todotest.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TodoModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public Integer id;
    public String description;
    public String date;

}
