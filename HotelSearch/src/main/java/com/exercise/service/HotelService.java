package com.exercise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.model.HotelFilter;

@Service("hotelSearch")
public class HotelService implements IHotelService {

	@Autowired
	IExternalApiService apiService;
	
	public void findOffers(HotelFilter filter)
	{
		apiService.getHotelOffers(filter);
	}
	
}
