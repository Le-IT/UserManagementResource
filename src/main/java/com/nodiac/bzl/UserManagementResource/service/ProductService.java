package com.nodiac.bzl.UserManagementResource.service;

import com.bzloeffler.intern.bestellformular.interneBestellung.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {


    Optional<Product> getById(long id);

    Optional<Product> getByName(String name);

    List<Product> findAll();

    void update(Product product);

    boolean existsById(long id);

    void addProduct(Product product);

    Optional<Product> getByArticleNumber(int articleNumber);


    void deleteProduct(Product product);

    Optional<Product> getByArticleNumber(Integer articleNum);

    boolean existsByArticleNumber(int articleNumber);
}

