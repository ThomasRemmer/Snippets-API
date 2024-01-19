package com.example.demo.controller;

import com.example.demo.Service.SnippetService;
import com.example.demo.model.Snippets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SnippetController {

    @Autowired

     SnippetService snippetService;



    public SnippetController(SnippetService snippetService) {
        this.snippetService = snippetService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/Snippets")
    public ResponseEntity<List<Snippets>> returnSnippets() {
        List<Snippets> snippets = snippetService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(snippets);
    }

    @PostMapping("/Snippets")
    public ResponseEntity createSnippet(@RequestBody Snippets body) {
        snippetService.createSnippet(body);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
