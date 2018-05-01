package com.exercise.model;

public class FlightOffer {
	private String carrierName;
	private String imageUrl;
	private String offerPrice;
	private String destiationCity;
	private String destiationAirport;
	private String departureDate;
	private String returnDate;
	private String originCity;

	public String getOriginCity() {
		return originCity;
	}

	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public String getDestiationAirport() {
		return destiationAirport;
	}

	public String getDestiationCity() {
		return destiationCity;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getOfferPrice() {
		return offerPrice;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public void setDestiationAirport(String destiationAirport) {
		this.destiationAirport = destiationAirport;
	}

	public void setDestiationCity(String destiationCity) {
		this.destiationCity = destiationCity;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setOfferPrice(String offerPrice) {
		this.offerPrice = offerPrice;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

}
