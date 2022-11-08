package com.projectsjava.course.resources;

import com.projectsjava.course.entities.Product;
import com.projectsjava.course.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> p =productService.findAll();
       return ResponseEntity.status(HttpStatus.OK).body(p);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable("id") Long id){
        Product p = productService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(p);
    }
}
