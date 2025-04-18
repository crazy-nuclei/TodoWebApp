package com.crazy_nuclei.TodoApp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {

    @Autowired
    TodoService todoService;

    @RequestMapping(value = "list-todos", method=RequestMethod.GET)
    public String listTodos(Model model) {
        model.addAttribute("todos", todoService.findByUsername("Aayush"));
        return "listTodos";
    }
}
