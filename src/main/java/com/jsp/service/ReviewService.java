package com.jsp.service;

import com.jsp.dao.ReviewDao;
import com.jsp.dto.Review;

public class ReviewService {
	ReviewDao reviewDao = new ReviewDao();

	public void deleteById(Review review) {
		reviewDao.deleteById(review);
	}

	public void getById(Review review) {
		reviewDao.getById(review);
	}

	public void updateById(Review review) {
		reviewDao.updateById(review);
	}
	public void getAll(Review review) {
		reviewDao.getAll(review);
	}
}
