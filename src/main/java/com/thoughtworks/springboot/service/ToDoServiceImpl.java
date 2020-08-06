package com.thoughtworks.springboot.service;

import com.thoughtworks.springboot.entity.ToDo;
import com.thoughtworks.springboot.repository.ToDoRepository;

import java.util.List;
import java.util.Optional;

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
    public Optional<ToDo> getToDoById(Integer id) {
        return toDoRepository.findById(id);
    }

    @Override
    public void deleteToDoById(Integer id) {
        toDoRepository.deleteById(id);
    }

    @Override
    public ToDo saveToDo(ToDo toDo) {
        return null;
    }
}
