package com.example.productmngmt.repo;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.productmngmt.entity.Product;
import com.example.productmngmt.template.ProductRepositoryTemplate;

@Repository
public interface ProductRepo extends MongoRepository<Product,String>, ProductRepositoryTemplate {

	Optional<Product> findByName(String name);
	
	Page<Product> findProductByNameIgnoreCase(String productName,Pageable pageable);

	Page<Product> findByNameRegex(String name,Pageable pageable);

	Optional<Product> findByProdId(Long pid);
	
}
