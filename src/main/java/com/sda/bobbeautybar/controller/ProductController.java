package com.sda.bobbeautybar.controller;

import com.sda.bobbeautybar.model.Product;
import com.sda.bobbeautybar.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String show(Model model){
        model.addAttribute("data",productService.getAll());
        return "products";
    }

    @PostMapping("/save")
    public String save(Product product){
        productService.save(product);
        return "redirect:/products";
    }
    @GetMapping("/delete")
    public String delete(Long id){
        productService.delete(id);
        return "redirect:/products";
    }

    @GetMapping("/findOneProduct")
    @ResponseBody
    public Product findOneProduct(Long id){
        return productService.getById(id);
    }

}
