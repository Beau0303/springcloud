package com.beau.productdataservice.controller;

import com.beau.productdataservice.pojo.Product;
import com.beau.productdataservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Beau
 * @Date: 19-4-24 21:27
 * @E-mail: codemeifan@gmail.com
 * @Description:
 */
@RestController
public class ProductController {

    @Autowired
    ProductService productService;
    @RequestMapping("/products")
    public List<Product> products() {
        List<Product> ps = productService.listProducts();
        return ps;
    }
}
