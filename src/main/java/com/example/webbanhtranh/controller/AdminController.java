package com.example.webbanhtranh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String getAdminPage() {
        // Return the view name (e.g., an HTML page or a Thymeleaf template)
        return "admin";  // "admin" is the name of the view (could be admin.html or admin.jsp)
    }
}
