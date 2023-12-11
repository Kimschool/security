package com.example.jaego.controller;

import com.example.jaego.entity.Fruit;
import com.example.jaego.repository.FruitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FruitController {

    @Autowired
    FruitMapper repo;

    @GetMapping("/")
    private String test() {


       Fruit fruit =  repo.selectById(1);
       System.out.println(fruit);

       return "test";
    }

    @GetMapping("loginproc")
    private String loginproc(String id, String password) {

        return "test";
    }

    @GetMapping("login")
    private String login(String id, String password) {

        return "test";
    }
}
