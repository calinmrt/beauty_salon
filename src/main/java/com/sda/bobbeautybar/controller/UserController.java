package com.sda.bobbeautybar.controller;

import com.sda.bobbeautybar.model.Role;
import com.sda.bobbeautybar.model.User;
import com.sda.bobbeautybar.service.RoleService;
import com.sda.bobbeautybar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/users")
public class UserController {
    String template;

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @GetMapping
    public String show(Model model, @RequestParam int idRole){
        Role role=roleService.getById(idRole);
        template=role.getName().equalsIgnoreCase("client")?"clients":"workers";
        model.addAttribute("data",userService.getAll(role));
        return template;
    }

    @PostMapping("/save")
    public String save(User user) {
        userService.save(user);
        return "redirect:/"+template;
    }


}
