package com.thoughtworks.springboot.service;

import com.thoughtworks.springboot.entity.ToDo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ToDoService {
    List<ToDo> getAllToDos();
    Optional<ToDo> getToDoById(Integer id);
    void deleteToDoById(Integer id);
    ToDo saveToDo(ToDo toDo);
}
