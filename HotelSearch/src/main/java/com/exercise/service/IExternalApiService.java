package com.exercise.service;

import com.exercise.model.FlightFilter;
import com.exercise.model.HotelFilter;

public interface IExternalApiService {

	String getHotelOffers(HotelFilter filter);
	String getFlightOffers(FlightFilter filter);

}