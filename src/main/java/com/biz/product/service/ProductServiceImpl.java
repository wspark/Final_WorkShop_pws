package com.biz.product.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.product.dao.ProductDAO;
import com.biz.product.vo.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired 
	private ProductDAO productDAO;

	@Override
	public void insertProduct(Product product) throws Exception {
		int row = productDAO.insertProduct(product);
		if( row < 0) throw new Exception("등록실패"+product.getCode());
	}

	@Override
	public void updateProduct(Product product) throws Exception {
		int row = productDAO.updateProduct(product);
		if( row < 0) throw new Exception("수정실패"+product.getCode());
	}
	
	@Override
	public void deleteProduct(String code) throws Exception {
		int row = productDAO.deleteProduct(code);
		if( row < 0) throw new Exception("삭제실패" + code);
	}

	@Override
	public Product findProduct(String code) throws Exception {
		Product product = productDAO.findProduct(code);
		if(product ==null) throw new Exception("검색실패:"+code);	
		return product;		
	}

	@Override
	public ArrayList<Product> findProducts() throws Exception {
		ArrayList<Product> productList = productDAO.findProductList();
		return productList;	
	}

}
