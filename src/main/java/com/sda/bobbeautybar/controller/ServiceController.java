package com.sda.bobbeautybar.controller;

import com.sda.bobbeautybar.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/services")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @GetMapping
    public String show(Model model){
        model.addAttribute("data",serviceService.getAll());
        return "services";
    }

}
