package com.sda.bobbeautybar.controller;

import com.sda.bobbeautybar.model.Product;
import com.sda.bobbeautybar.repository.ProductRepo;
import com.sda.bobbeautybar.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductRepo productRepo;

    @GetMapping
    public String show(Model model, @RequestParam(defaultValue = "0") int page) {
        model.addAttribute("data", productRepo.findAll(PageRequest.of(page, 10, Sort.by("productName").ascending())));
        model.addAttribute("currentPage",page);
        return "products";
    }

    @PostMapping("/save")
    public String save(Product product) {
        productService.save(product);
        return "redirect:/products";
    }

    @GetMapping("/delete")
    public String delete(Long id) {
        productService.delete(id);
        return "redirect:/products";
    }

    @GetMapping("/findOneProduct")
    @ResponseBody
    public Product findOneProduct(@RequestParam Long id) {
        return productService.getById(id);
    }

}
