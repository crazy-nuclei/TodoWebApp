package com.crazy_nuclei.TodoApp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    public static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "A", "A description", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(1, "B", "B description", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(1, "C", "C description", LocalDate.now().plusYears(1), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }
}
