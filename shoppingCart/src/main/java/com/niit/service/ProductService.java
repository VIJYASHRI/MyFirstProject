package com.niit.service;


import java.util.List;

import com.niit.model.Product;

public interface ProductService {
	public void saveProduct(Product product);
	public List<Product> getProductById();
	public void updateProduct(Product product);
	public void deleteProduct(int id);
}
