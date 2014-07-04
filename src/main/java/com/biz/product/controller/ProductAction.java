package com.biz.product.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.biz.product.service.ProductService;
import com.biz.product.vo.Product;


@Controller
@RequestMapping("/product")
public class ProductAction {

	@Autowired
	ProductService service;	
	
	@RequestMapping(value="/add.do", method = RequestMethod.GET)
	public String addForm() throws Exception {					
		return "product_form";
	}
	
	@RequestMapping(value="/add.do", method = RequestMethod.POST) 
	public String add(@RequestParam("code") String code, @RequestParam("name") String name,
			@RequestParam("price") int price, @RequestParam("amount") int amount,
			@RequestParam("discription") String discription, Model model) throws Exception {
			
		try{			
			service.insertProduct(new Product(code,name,price,amount,discription));
			model.addAttribute("message", "등록성공");		
			
		}catch(Exception e){
			model.addAttribute("message",e.getMessage());		
		}		
		return "product_result";
	}	
	
	@RequestMapping("/delete.do")
	public String delete(@RequestParam("code") String code, Model model) throws Exception {
			
		try{
			System.out.println("delete method, code = " +code);
			service.deleteProduct(code);
			model.addAttribute("message", "삭제성공");			
			
		}catch(Exception e){
			model.addAttribute("message",e.getMessage());		
		}		
		return "product_result";
	}
	
	@RequestMapping("/update.do")
	public String update(@RequestParam("code") String code, @RequestParam("name") String name,
			@RequestParam("price") int price, @RequestParam("amount") int amount,
			@RequestParam("discription") String discription, Model model) throws Exception {
			
		try{	
			System.out.println("update method, code = " +code);
			service.updateProduct(new Product(code,name,price,amount,discription));
			model.addAttribute("message", "수정성공");			
			
		}catch(Exception e){
			model.addAttribute("message",e.getMessage());		
		}		
		return "product_result";
	}
	
	@RequestMapping("/list.do")
	public String list(Model model) throws Exception {
		ArrayList<Product> productList = service.findProducts();
		model.addAttribute("productList", productList);		
		return "product_list";
	}
	
	@RequestMapping("/view.do")
	public String list(@RequestParam("code") String code, Model model) throws Exception {		
		String nextPage=null;
		try{
			Product product = service.findProduct(code);			
			model.addAttribute("product", product);
			nextPage="product_view";
		}catch(Exception e){
			model.addAttribute("message", e.getMessage());
			nextPage="product_result";
		}				
		return nextPage;		
	}	
	
}
