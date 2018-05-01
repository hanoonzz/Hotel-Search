package com.exercise.service;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.model.FlightFilter;
import com.exercise.model.FlightOffer;

@Service("flightService")
public class FlightService implements IFlightService {

	@Autowired
	IExternalApiService apiService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.exercise.service.IFlightService#findOffers(com.exercise.model.
	 * FlightFilter)
	 */
	@Override
	public List<FlightOffer> findOffers(FlightFilter filter) {
		String results = apiService.getFlightOffers(filter);
		if (results == null)
			return null;
		return parseResponse(results);
	}

	private List<FlightOffer> parseResponse(String response) {
		try {
			JSONObject jsonObject = new JSONObject(response);
			jsonObject = jsonObject.getJSONObject("offers");
			JSONArray jsonarray = jsonObject.getJSONArray("Flight");
			System.out.println(jsonarray.length());

			List<FlightOffer> flights = new ArrayList<FlightOffer>();
			for (int i = 0; i < jsonarray.length(); i++) {
				JSONObject flightJSON = jsonarray.getJSONObject(i);
				FlightOffer offer = parseFlight(flightJSON);
				if (offer == null)
					continue;
				flights.add(offer);
			}
			return flights;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private FlightOffer parseFlight(JSONObject flightJSON) {
		// create a new hotel

		FlightOffer offer = null;

		try {
			offer = new FlightOffer();
			JSONObject destinationJSON = flightJSON.getJSONObject("destination");
			JSONObject flightInfo = flightJSON.getJSONObject("flightInfo");
			JSONObject priceInfo = flightJSON.getJSONObject("flightPricingInfo");
			JSONObject flightDates = flightJSON.getJSONObject("offerDateRange");
			JSONObject originJSON = flightJSON.getJSONObject("origin");

			offer.setDestiationCity(destinationJSON.getString("city"));
			offer.setDestiationAirport(destinationJSON.getString("longName"));

			offer.setOriginCity(originJSON.getString("city"));

			offer.setCarrierName(flightInfo.getString("flightDealCarrierName"));

			/* offer.setImageUrl(flightJSON.getString("hotelImageUrl")); */
			offer.setOfferPrice(
					priceInfo.getString("currencyCode") + " " + priceInfo.getDouble("flightPerPsgrBaseFare"));

			offer.setDepartureDate(parseDate(flightDates.getJSONArray("travelStartDate")));
			offer.setReturnDate(parseDate(flightDates.getJSONArray("travelEndDate")));

		} catch (Exception e) {
			e.printStackTrace();

			offer = null;
		}
		return offer;

	}

	private String parseDate(JSONArray array) {
		try {
			String dateResult = MessageFormat.format("{0}-{1}-{2}", Integer.toString(array.getInt(0)), array.getInt(1), array.getInt(2));
			return dateResult;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;

	}
}
