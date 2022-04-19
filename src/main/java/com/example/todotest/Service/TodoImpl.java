package com.example.todotest.Service;

import com.example.todotest.Models.TodoModel;
import com.example.todotest.Repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoImpl implements TodoService {

    @Autowired
    public TodoRepo todoRepo;

    @Override
    public TodoModel saveTodoModel(TodoModel todoModel) {
        return todoRepo.save(todoModel);
    }

    @Override
    public List<TodoModel> getAllTasks() {
        return todoRepo.findAll();
    }

    @Override
    public void deleteTask (int id){
        Optional <TodoModel> todoModel = todoRepo.findById(id);
        if (todoModel.isPresent()){
            todoRepo.deleteById(id);
        }
    }
}

