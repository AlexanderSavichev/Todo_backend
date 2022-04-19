package com.example.todotest.Controllers;

import com.example.todotest.Models.TodoModel;
import com.example.todotest.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todoModel")
@CrossOrigin
public class TodoController {
    
    @Autowired
    private TodoService todoService;

    @PostMapping("/add")
    public String add(@RequestBody TodoModel todoModel) {
        todoService.saveTodoModel(todoModel);
        return "New task has been created";
    }

    @GetMapping("/findTasks")
    public List<TodoModel> getAllTasks(){
        return todoService.getAllTasks();
    }
    @DeleteMapping("/deleteTask/{id}")
    public String deleteTask(@PathVariable("id") int id){
       todoService.deleteTask(id);
       return "Task has been deleted";
    }

}
