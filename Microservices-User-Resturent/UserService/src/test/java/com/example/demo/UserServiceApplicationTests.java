package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.practice.Entity.Rating;
import com.practice.external.services.RatingService;

@SpringBootTest
class UserServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private RatingService ratingService;

//	@Test
//	void cretaeRating() {
//		Rating rating = Rating.builder().rating(10).userId("").hotelId("").feedBack("This Created using feign Client")
//				.build();
//		ratingService.cretaeRating(rating);
//		System.out.println("new rating created");
//
//	}

}
