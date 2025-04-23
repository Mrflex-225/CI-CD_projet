package com.example.todo_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    private TodoRepository repo;

    @GetMapping
    public List<Todo> getAll(){
        return repo.findAll();
    }

    @PostMapping
    public Todo create(@RequestBody Todo todo){
        return repo.save(todo);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id){
        repo.deleteById(id);
    }
}
