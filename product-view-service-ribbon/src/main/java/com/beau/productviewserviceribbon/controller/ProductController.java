package com.beau.productviewserviceribbon.controller;

import com.beau.productviewserviceribbon.pojo.Product;
import com.beau.productviewserviceribbon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: Beau
 * @Date: 19-4-24 16:57
 * @E-mail: codemeifan@gmail.com
 * @Description:
 */
@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/products")
    public String products(Model model) {
        List<Product> products = productService.listProducts();
        model.addAttribute("products", products);
        return "products";
    }
}
