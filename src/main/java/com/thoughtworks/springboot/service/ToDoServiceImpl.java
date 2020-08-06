package com.thoughtworks.springboot.service;

import com.thoughtworks.springboot.entity.ToDo;
import com.thoughtworks.springboot.repository.ToDoRepository;

import java.util.List;

public class ToDoServiceImpl implements ToDoService {

    private final ToDoRepository toDoRepository;

    public ToDoServiceImpl(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @Override
    public List<ToDo> getAllToDos() {
        return toDoRepository.findAll();
    }

    @Override
    public ToDo getToDoById(Integer id) {
        return null;
    }

    @Override
    public void deleteToDoById(Integer id) {

    }

    @Override
    public ToDo saveToDo(ToDo toDo) {
        return null;
    }
}
