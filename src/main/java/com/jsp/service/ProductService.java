package com.jsp.service;

import com.jsp.dao.ProductDao;
import com.jsp.dto.Product;
import com.jsp.dto.Review;

public class ProductService {
	ProductDao dao = new ProductDao();
	public void create(Product p, Review review, Review review2, Review review3) {
		dao.create(p, review, review2, review3);
	}

	public void deleteById(Product product) {
		dao.deleteById(product);
	}

	public void updateById(Product product) {
		dao.updateById(product);
	}

	public void getById(Product product) {
		dao.getById(product);
	}
	public void getAll(Product product) {
		dao.getAll(product);
	}
}