package com.thoughtworks.springboot.controller;

import com.thoughtworks.springboot.entity.ToDo;
import com.thoughtworks.springboot.service.ToDoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
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
}