package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Product;
import com.jsp.dto.Review;

public class ProductDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kajal");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void create(Product p, Review review, Review review2, Review review3) {
		entityTransaction.begin();
		entityManager.persist(review3);
		entityManager.persist(review2);
		entityManager.persist(review);
		entityManager.persist(p);
		entityTransaction.commit();
	}

	public void deleteById(Product product) {
		Product p1 = entityManager.find(Product.class, product.getId());
		if (p1 != null) {
			entityTransaction.begin();
			entityManager.remove(p1);
			entityTransaction.commit();
			System.out.println("object deleted");
		} else {
			System.out.println("entity not found");
		}
	}

	public void updateById(Product product) {
		Product p2 = entityManager.find(Product.class, product.getId());
		if (p2 != null) {
			p2.setName(product.getName());
			entityTransaction.begin();
			entityManager.merge(p2);
			entityTransaction.commit();
		}
	}

	public void getById(Product product) {
		Product p3 = entityManager.find(Product.class, product.getId());
		if (p3 != null) {
			System.out.println(p3.getId());
			System.out.println(p3.getName());
		}}
	
	public void getAll(Product product) {
		String sql="select p from Product p";
		Query query=entityManager.createQuery(sql);
		List<Product>products=query.getResultList();
		for (Product product2 : products) {
			System.out.println("================================================");
			System.out.println(product2.getId());
			System.out.println(product2.getName());
		}
}
}