package com.nodiac.bzl.UserManagementResource.service;

import com.bzloeffler.intern.bestellformular.interneBestellung.domain.Product;
import com.bzloeffler.intern.bestellformular.interneBestellung.domain.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Optional<Product> getById(long id) {

        return productRepository.findById(id);
    }

    @Override
    public Optional<Product> getByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void update(Product product) {

        if(productRepository.findById(product.getId()).isPresent()){
            productRepository.save(product);
        }
    }

    @Override
    public boolean existsById(long id) {
        return productRepository.findById(id).isPresent();
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Optional<Product> getByArticleNumber(int articleNumber) {
        return productRepository.findByArticleNumber(articleNumber);
    }

    @Override
    public void deleteProduct(Product product) {
        if(productRepository.findById(product.getId()).isPresent()){
            productRepository.delete(product);
        }
    }

    @Override
    public Optional<Product> getByArticleNumber(Integer articleNum) {
        return productRepository.findByArticleNumber(articleNum);
    }

    @Override
    public boolean existsByArticleNumber(int articleNumber) {
        return productRepository.existsByArticleNumber(articleNumber);
    }
}
