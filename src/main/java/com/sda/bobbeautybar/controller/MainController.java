package com.sda.bobbeautybar.controller;

import com.sda.bobbeautybar.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    ServiceService serviceService;

    @GetMapping
    public String showMainPage(Model model) {
        model.addAttribute("serviceList", serviceService.getAll());
        return "index";
    }
}
