package com.projectsjava.course.services;

import com.projectsjava.course.entities.Product;
import com.projectsjava.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> p = productRepository.findById(id);
        return p.get();
    }
}
