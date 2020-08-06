package com.thoughtworks.springboot.controller;

import com.thoughtworks.springboot.entity.ToDo;
import com.thoughtworks.springboot.service.ToDoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

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
}