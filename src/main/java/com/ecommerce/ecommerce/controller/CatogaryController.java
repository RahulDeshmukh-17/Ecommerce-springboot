package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.model.Catogary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CatogaryController {
    private List<Catogary>categories=new ArrayList<>();

@GetMapping("/api/public/categories")
    public List<Catogary> getAllCategories(){
        return categories;
    }
    @PostMapping("/api/public/categories")
public String CreateCatogery(@RequestBody Catogary cate){
    if(categories.add(cate)){
        return "Categories added successfully";
    }
    return "Categories not added";
    }
}
