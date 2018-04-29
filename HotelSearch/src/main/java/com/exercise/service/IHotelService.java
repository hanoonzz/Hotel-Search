package com.exercise.service;

import java.util.List;

import com.exercise.model.HotelFilter;
import com.exercise.model.HotelOffer;

public interface IHotelService {

	List<HotelOffer> findOffers(HotelFilter filter);
}