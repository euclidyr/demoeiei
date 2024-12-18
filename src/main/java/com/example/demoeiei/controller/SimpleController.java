package com.example.demoeiei.controller;

import com.example.demoeiei.domain.SimpleRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class SimpleController {

    private List<String> list = new ArrayList<>();
    @GetMapping("/")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("This is me OKOKOK", HttpStatus.OK);
    }

    @PostMapping("/addToList")
    public ResponseEntity<String> addToList(@RequestBody SimpleRequest simpleRequest) {
        list.add(simpleRequest.getName());
        return new ResponseEntity<>("Successfully added to list", HttpStatus.OK);
    }

    @GetMapping("/getList")
    public ResponseEntity<List<String>> getList() {
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
