package com.thoughtworks.springboot.controller;

import com.thoughtworks.springboot.entity.ToDo;
import com.thoughtworks.springboot.service.ToDoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ToDoController {

    private final ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping(value = "/todos")
    public List<ToDo> findAllToDos() {
        return toDoService.getAllToDos();
    }

    @GetMapping(value = "/todos/{id}")
    public Optional<ToDo> findToDoById(@PathVariable("id")Integer id) {
        return toDoService.getToDoById(id);
    }

    @PutMapping(value = "/todos/{id}")
    public ToDo updateToDoById(@PathVariable("id")Integer id, @RequestBody ToDo toDo) {
        if(toDoService.getToDoById(id).isPresent())
            return toDoService.saveToDo(toDo);
        return null;
    }

    @PostMapping(value = "/todos")
    public ToDo addToDoBy(@RequestBody ToDo toDo) {
        return toDoService.saveToDo(toDo);
    }

    @DeleteMapping(value = "/todos/{id}")
    public void deleteToDoById(@PathVariable("id")Integer id) {
        if(toDoService.getToDoById(id).isPresent())
            toDoService.deleteToDoById(id);
    }
}