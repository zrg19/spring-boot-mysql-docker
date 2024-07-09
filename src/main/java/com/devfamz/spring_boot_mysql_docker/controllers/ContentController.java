package com.devfamz.spring_boot_mysql_docker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {

    @GetMapping("/home")
    public String handleWelcome() {
        return "home";
    }

    @GetMapping("/admin/home")
    public String handleAdmin() {
        return "home_admin";
    }

    @GetMapping("/user/home")
    public String handleUser() {
        return "home_user";
    }
}
