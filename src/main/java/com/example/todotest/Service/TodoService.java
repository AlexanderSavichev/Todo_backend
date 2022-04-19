package com.example.todotest.Service;

import com.example.todotest.Models.TodoModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoService {
    public TodoModel saveTodoModel (TodoModel todoModel);
    public List<TodoModel> getAllTasks();
    void deleteTask(int id);
}
