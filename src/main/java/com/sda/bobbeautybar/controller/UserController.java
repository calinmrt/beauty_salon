package com.sda.bobbeautybar.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sda.bobbeautybar.model.Role;
import com.sda.bobbeautybar.model.User;
import com.sda.bobbeautybar.service.RoleService;
import com.sda.bobbeautybar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;

    @GetMapping
    public String show(Model model, @RequestParam(defaultValue = "0") int page, @RequestParam int idRole) {
        model.addAttribute("data", userService.getAll(PageRequest.of(page, 10, Sort.by("userName").ascending()), idRole));
        model.addAttribute("currentPage", page);
        model.addAttribute("currentRole",idRole);
        model.addAttribute("allRoles",roleService.getAll());
        return "users";
    }

    @PostMapping("/save")
    public String save(User user,@RequestParam int role) {
        userService.save(user, role);
        return "redirect:/users?idRole="+role;
    }

    @GetMapping("/findUserById")
    @ResponseBody
    public User findOneUser(@RequestParam Long id) {
        return userService.getById(id);
    }

    @GetMapping("/search")
    public String searchByName(Model model, @RequestParam(defaultValue = "0") int page, @RequestParam int idRole, @RequestParam String userName) {
        model.addAttribute("data", userService.findByName(PageRequest.of(page, 10, Sort.by("userName").ascending()), userName,idRole));
        model.addAttribute("currentPage", page);
        model.addAttribute("currentRole",idRole);
        model.addAttribute("allRoles",roleService.getAll());
        return "users";
    }
}
