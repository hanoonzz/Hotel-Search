package com.exercise.service;

import com.exercise.model.HotelFilter;

public interface IExternalApiService {

	String getHotelOffers(HotelFilter filter);

}