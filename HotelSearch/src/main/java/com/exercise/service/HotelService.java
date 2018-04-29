package com.exercise.service;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.model.HotelFilter;
import com.exercise.model.HotelOffer;

@Service("hotelSearch")
public class HotelService implements IHotelService {

	@Autowired
	IExternalApiService apiService;

	public List<HotelOffer> findOffers(HotelFilter filter) {
		String results = apiService.getHotelOffers(filter);
		if (results == null)
			return null;
		return parseResponse(results);

	}

	private List<HotelOffer> parseResponse(String response) {
		try {
			JSONObject jsonObject = new JSONObject(response);
			jsonObject = jsonObject.getJSONObject("offers");
			JSONArray jsonarray = jsonObject.getJSONArray("Hotel");
			System.out.println(jsonarray.length());

			List<HotelOffer> hotels = new ArrayList<HotelOffer>();
			for (int i = 0; i < jsonarray.length(); i++) {
				JSONObject hoteJSON = jsonarray.getJSONObject(i);
				HotelOffer offer = parseHotel(hoteJSON);
				if(offer==null)
					continue;
				hotels.add(offer);
			}
			return hotels;
		} catch (Exception e) {
		}
		return null;
	}

	private HotelOffer parseHotel(JSONObject hotelJSON) {
		// create a new hotel

		HotelOffer offer = null;

		try {
			offer = new HotelOffer();
			JSONObject destinationJSON = hotelJSON.getJSONObject("destination");
			JSONObject hotelInfo = hotelJSON.getJSONObject("hotelInfo");
			JSONObject priceInfo = hotelJSON.getJSONObject("hotelPricingInfo");
			offer.setDestiationName(destinationJSON.getString("shortName"));
			offer.setHotelName(hotelInfo.getString("hotelName"));
			offer.setHotelAddress(hotelInfo.getString("hotelLongDestination"));
			offer.setGuestRating(hotelInfo.getString("hotelGuestReviewRating"));
			offer.setStarRating(hotelInfo.getString("hotelStarRating"));
			offer.setImageUrl(hotelInfo.getString("hotelImageUrl"));
			offer.setOfferPrice(priceInfo.getString("currency") + " " + priceInfo.getString("averagePriceValue"));
		} catch (Exception e) {
			offer=null;
		}
		return offer;

	}
}
