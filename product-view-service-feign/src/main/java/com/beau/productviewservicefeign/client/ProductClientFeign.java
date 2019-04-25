package com.beau.productviewservicefeign.client;

import com.beau.productviewservicefeign.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author: Beau
 * @Date: 19-4-24 20:43
 * @E-mail: codemeifan@gmail.com
 * @Description:
 */
@FeignClient(value = "PRODUCT-DATA-SERVICE")
public interface ProductClientFeign {
    @GetMapping("/products")
    public List<Product> listProducts();
}
