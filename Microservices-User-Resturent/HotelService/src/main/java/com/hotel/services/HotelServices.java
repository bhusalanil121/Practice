package com.hotel.services;

import java.util.List;

import com.hotel.Entity.Hotel;

public interface HotelServices {
	
	//create
	Hotel create(Hotel hotel); 
	
	//getall
	List<Hotel> getAllHotel();
	
	//getsingle
	Hotel get(String id);

}
