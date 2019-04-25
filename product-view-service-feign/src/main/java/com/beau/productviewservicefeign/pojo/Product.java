package com.beau.productviewservicefeign.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Beau
 * @Date: 19-4-24 20:40
 * @E-mail: codemeifan@gmail.com
 * @Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int id;
    private String name;
    private int price;
}
