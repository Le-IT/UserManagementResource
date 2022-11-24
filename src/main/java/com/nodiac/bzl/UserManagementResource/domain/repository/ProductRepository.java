package com.nodiac.bzl.UserManagementResource.domain.repository;

import com.bzloeffler.intern.bestellformular.interneBestellung.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    Optional<Product> findById(long id);

    Optional<Product> findByArticleNumber(int articleNumber);

    Optional<Product> findByName(String name);

    List<Product> findAll();

    boolean existsByArticleNumber(int articleNumber);
}
