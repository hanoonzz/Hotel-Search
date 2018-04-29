package com.exercise.service;

import com.exercise.model.HotelFilter;

public interface IExternalApiService {

	void getHotelOffers(HotelFilter filter);

}