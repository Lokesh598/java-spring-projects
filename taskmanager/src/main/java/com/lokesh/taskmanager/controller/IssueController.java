package com.lokesh.taskmanager.controller;

import com.lokesh.taskmanager.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@Document("issues")
public class IssueController {
    @Autowired
    private final IssueRepository repository;
    public IssueController (IssueRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/issues")
    public String getAllIssues(Model model) {
        model.addAttribute("issue", repository.findAll());
        return "list-issues";
    }
}
