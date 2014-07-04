package com.biz.product.dao;

import java.util.ArrayList;

import com.biz.product.vo.Product;

public interface ProductDAO {
	public abstract int insertProduct(Product product);
	public abstract int updateProduct(Product product);
	public abstract int deleteProduct(String code);
	public abstract Product findProduct(String code);	
	public abstract ArrayList<Product> findProductList();
}
