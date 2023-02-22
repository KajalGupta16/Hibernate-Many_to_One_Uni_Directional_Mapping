package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.dto.Review;
import com.jsp.service.ProductService;

public class ProductController {
	public static void main(String[] args) {
		ProductService productService = new ProductService();
		Product product = new Product();
		product.setName("fridge");

		Review review = new Review();
		review.setReview("nice");
		review.setProduct(product);

		Review review2 = new Review();
		review2.setReview("very nice product");
		review2.setProduct(product);

		Review review3 = new Review();
		review3.setReview("not that good");
		review3.setProduct(product);

		//to save
//		productService.create(product, review, review2, review3);

		//to delete by id
//		product.setId(2);
//		productService.deleteById(product);

		//to get by id
//		product.setId(1);
//		productService.getById(product);
//
//		//to update by id
//		product.setId(3);
//		product.setName("AC");
//		productService.updateById(product);
		
		productService.getAll(product);
}
}