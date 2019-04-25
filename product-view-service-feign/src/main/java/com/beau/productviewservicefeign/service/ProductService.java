package com.beau.productviewservicefeign.service;

import com.beau.productviewservicefeign.client.ProductClientFeign;
import com.beau.productviewservicefeign.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Beau
 * @Date: 19-4-24 20:52
 * @E-mail: codemeifan@gmail.com
 * @Description:
 */
@Service
public class ProductService {
    @Autowired
    ProductClientFeign productClientFeign;

    public List<Product> listProducts() {
        return productClientFeign.listProducts();
    }
}
