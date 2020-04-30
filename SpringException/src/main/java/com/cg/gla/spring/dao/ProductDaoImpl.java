package com.cg.gla.spring.dao;



import java.util.List;

import com.cg.gla.spring.entity.Product;


public interface ProductDaoImpl {

	public boolean create(Product product);
	public List<Product> retrieve();


}
