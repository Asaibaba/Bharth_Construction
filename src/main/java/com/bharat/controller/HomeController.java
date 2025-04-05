package com.bharat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Constructing Facilities");
        return "index";
    }

    @GetMapping("/sectors")
    public String sectors() {
        return "sectors";
    }

    @GetMapping("/services")
    public String services() {
        return "services";
    }

    @GetMapping("/locations")
    public String locations() {
        return "locations";
    }

    @GetMapping("/careers")
    public String careers() {
        return "careers";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}
