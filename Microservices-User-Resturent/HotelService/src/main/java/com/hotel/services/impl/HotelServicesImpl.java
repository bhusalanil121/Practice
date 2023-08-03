package com.hotel.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.Entity.Hotel;
import com.hotel.exception.ResourceNotFoundException;
import com.hotel.repository.HotelRepository;
import com.hotel.services.HotelServices;


@Service
public class HotelServicesImpl implements HotelServices {
	
	@Autowired
	private HotelRepository hotelRepo;
	

	@Override
	public Hotel create(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
	
		return hotelRepo.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		return hotelRepo.findAll();
	}

	@Override
	public Hotel get(String id) {
		// TODO Auto-generated method stub
		return hotelRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id not found !!"));
	}

}
