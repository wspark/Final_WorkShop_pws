package com.biz.product.service;

import java.util.ArrayList;

import com.biz.product.vo.Product;

public interface ProductService {
	public abstract void insertProduct(Product product) throws Exception;
	public abstract void updateProduct(Product product) throws Exception;
	public abstract void deleteProduct(String code) throws Exception;
	public abstract Product findProduct(String code) throws Exception;
	public abstract ArrayList<Product> findProducts() throws Exception;
}
