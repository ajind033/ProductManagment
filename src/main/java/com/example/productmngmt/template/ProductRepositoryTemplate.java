package com.example.productmngmt.template;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.productmngmt.entity.Product;

public interface ProductRepositoryTemplate {
		
	Page<Product> findProductByNameIgnoreCase(String regex,Pageable pageable);
	
}
