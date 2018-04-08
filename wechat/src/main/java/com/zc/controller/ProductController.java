package com.gs.controller;

import com.gs.bean.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaopeng
 * @date 2018/3/22 16:06
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @GetMapping("all")
    @ResponseBody
    public List<Product> listAll(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1L, "iPhone X1", "最便宜的X1", new BigDecimal(9999.0), new BigDecimal(999.9), "http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg"));
        productList.add(new Product(2L, "iPhone X2", "最便宜的X2", new BigDecimal(9999.0), new BigDecimal(999.9), "http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg"));
        productList.add(new Product(3L, "iPhone X3", "最便宜的X3", new BigDecimal(9999.0), new BigDecimal(999.9), "http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg"));
        productList.add(new Product(4L, "iPhone X4", "最便宜的X4", new BigDecimal(9999.0), new BigDecimal(999.9), "http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg"));
        productList.add(new Product(5L, "iPhone X5", "最便宜的X5", new BigDecimal(9999.0), new BigDecimal(999.9), "http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg"));
        return productList;
    }

    @PostMapping("get/{id}")
    @ResponseBody
    public Product getProduct(@PathVariable("id") String id){
        return new Product(1L, "iPhone X 1", "最便宜的X 1", new BigDecimal(9999.0), new BigDecimal(999.9), "http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg");
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

}
