package com.thoughtworks.springboot.service;

import com.thoughtworks.springboot.entity.ToDo;
import com.thoughtworks.springboot.repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ToDoService {
    List<ToDo> getAllToDos();
    ToDo getToDoById(Integer id);
    void deleteToDoById(Integer id);
    ToDo saveToDo(ToDo toDo);
}
