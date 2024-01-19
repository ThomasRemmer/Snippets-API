package com.example.demo.Service;

import com.example.demo.model.Snippets;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class SnippetService {
    List<Snippets> snippetsList = new ArrayList<>();
    public SnippetService() {
        this.snippetsList = generateSnippetList();
    }
    public List<Snippets> generateSnippetList() {


        // Create snippets and add them to the list
        Snippets snippet1 = new Snippets(1L, "Java", "System.out.println(\"Hello, World!\");");
        Snippets snippet2 = new Snippets(2L, "Python", "print('Hello, World!');");
        Snippets snippet3 = new Snippets(3L, "JavaScript", "console.log('Hello, World!');");

        // Add snippets to the list
        snippetsList.add(snippet1);
        snippetsList.add(snippet2);
        snippetsList.add(snippet3);

        return snippetsList;
    }




    public List<Snippets> getAll() {

        return snippetsList;
    }

    public List<Snippets> createSnippet(@RequestBody Snippets body) {
        snippetsList.add(body);
        return snippetsList;

    }
}
