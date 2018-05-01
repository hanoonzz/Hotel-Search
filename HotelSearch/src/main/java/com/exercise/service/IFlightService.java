package com.exercise.service;

import java.util.List;

import com.exercise.model.FlightFilter;
import com.exercise.model.FlightOffer;

public interface IFlightService {

	List<FlightOffer> findOffers(FlightFilter filter);

}