package com.tegt.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
public class Controller {

    private Random random = new Random();
    private List<Integer> history = new LinkedList<>();


    @GetMapping("random")
    public String getRandom() {
        int i = this.random.nextInt(101);
        this.history.add(i);
        return String.valueOf(i);
    }

    @GetMapping("history")
    public List<String> getHistory() {
        return history.stream().map(i -> String.valueOf(i)).collect(Collectors.toList());
    }

}
