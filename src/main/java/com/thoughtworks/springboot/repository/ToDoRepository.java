package com.thoughtworks.springboot.repository;

import com.thoughtworks.springboot.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Integer> {
}
