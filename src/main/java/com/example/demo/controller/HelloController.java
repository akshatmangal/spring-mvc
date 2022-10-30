package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private BooksRepository repository;

    @GetMapping("/greeting")
    public String hello(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/books")
    public String books( Model model) {
        List<Book> books = repository.findAll();
        model.addAttribute("books", books);
        return "books";
    }

}
