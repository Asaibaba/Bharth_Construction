package com.bharat.controller;

import com.bharat.model.Project;
import com.bharat.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping
    public String listProjects(Model model) {
        model.addAttribute("projects", projectRepository.findAll());
        return "projects";
    }
}
