package com.example.todotest.Repositories;

import com.example.todotest.Models.TodoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends JpaRepository<TodoModel, Integer> {

}
