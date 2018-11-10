package com.obydul.springmvc.controller;

import com.obydul.springmvc.model.Product;
import com.obydul.springmvc.service.ProductService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;
    
    @RequestMapping("/")
    public String listProduct(Map<String, Object> map){
        map.put("product", new Product());
        map.put("productList", productService.listProduct());
        return "index";
    }
    

    @RequestMapping(value="/product/add", method = RequestMethod.POST)
    public String addBook(@ModelAttribute("product") Product product, BindingResult result) {
        if (product.getId() == null) {
            productService.addProduct(product);
        }

        return "redirect:/";
    }
}
