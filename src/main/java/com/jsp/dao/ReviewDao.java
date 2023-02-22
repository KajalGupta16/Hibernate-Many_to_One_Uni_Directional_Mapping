package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Review;

public class ReviewDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kajal");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void deleteById(Review review) {
		Review r = entityManager.find(Review.class,review.getId());
		if (r != null) {
			entityTransaction.begin();
			entityManager.remove(r);
			entityTransaction.commit();
			System.out.println("deleted");
		} else {
			System.out.println("entity not found");
		}
	}

	public void getById(Review  review) {
		Review r1 = entityManager.find(Review.class, review.getId());
		if (r1 != null) {
			System.out.println(r1.getReview());
			System.out.println(r1.getId());
		}
	}

	public void updateById(Review review) {
		Review r2 = entityManager.find(Review.class,review.getId());
		if (r2 != null) {
			r2.setReview(review.getReview());
			entityTransaction.begin();
			entityManager.merge(r2);
			entityTransaction.commit();

		}

	}
	public void getAll(Review review) {
		String sql="select r from Review r";
		Query query=entityManager.createQuery(sql);
		List<Review>reviews=query.getResultList();
		for (Review review2 : reviews) {
			System.out.println("================================================");
			System.out.println(review2.getId());
			System.out.println(review2.getReview());
			
		}
	}

}
