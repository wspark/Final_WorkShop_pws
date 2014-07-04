package com.biz.product.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.biz.product.vo.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	SqlSession session;	

	@Override
	public int insertProduct(Product product) {	
		return session.insert("insertProduct",product);	
	}

	@Override
	public int updateProduct(Product product) {
		return session.update("updateProduct",product);	
	}

	@Override
	public int deleteProduct(String code) {
		return session.delete("deleteProduct",code);	
	}

	@Override
	public Product findProduct(String code) {
		return (Product)session.selectOne("findProduct",code);	
	}

	@Override
	public ArrayList<Product> findProductList() {
		ArrayList<Product> productList = new ArrayList<Product>();			
		List<Product> result = session.selectList("findProductList");
		for(Product product : result){
			productList.add(product);
		}		 	
		return productList;
	}

}
