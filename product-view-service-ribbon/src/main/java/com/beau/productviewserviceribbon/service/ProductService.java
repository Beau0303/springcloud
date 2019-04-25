package com.beau.productviewserviceribbon.service;

import com.beau.productviewserviceribbon.client.ProductClientRibbon;
import com.beau.productviewserviceribbon.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Beau
 * @Date: 19-4-24 16:51
 * @E-mail: codemeifan@gmail.com
 * @Description:
 */
@Service
public class ProductService {

    @Autowired
    ProductClientRibbon productClientRibbon;

    public List<Product> listProducts() {
        return productClientRibbon.listProducts();
    }

}
