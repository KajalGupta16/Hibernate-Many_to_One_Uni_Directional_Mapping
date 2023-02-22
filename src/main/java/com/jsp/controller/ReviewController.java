package com.jsp.controller;

import com.jsp.dto.Review;
import com.jsp.service.ReviewService;

public class ReviewController {
public static void main(String[] args) {
	ReviewService reviewService = new ReviewService();
	Review review=new Review();
	
	//to delete review by id
//	review.setId(4);
//	reviewService.deleteById(review);

	//to get by id
//	review.setId(5);
//	reviewService.getById(review);


	//to update by id
//	review.setId(5);
//	review.setReview("ookokkk");
//	reviewService.updateById(review);
	
	//to get all
	reviewService.getAll(review);
	
}
}
