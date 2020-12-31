package io.hopcraft.halo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSONObject;

import io.hopcraft.halo.service.ProductService;
import io.hopcraft.halo.returnJson.ReturnObject;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public String products(HttpSession session) {
        ReturnObject returnObject = new ReturnObject(productService.getAllProducts());
        return JSONObject.toJSONString(returnObject);
    }
}
