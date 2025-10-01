package com.nirajkshirsagar.product.service.repository;

import com.nirajkshirsagar.product.service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
