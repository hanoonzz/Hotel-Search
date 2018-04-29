package com.exercise.model;

public class HotelOffer {
	private String hotelName;
	private String guestRating;
	private String starRating;
	private String imageUrl;
	private String offerPrice;
	private String destiationName;
	private String hotelAddress;

	public String getDestiationName() {
		return destiationName;
	}

	public String getGuestRating() {
		return guestRating;
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public String getHotelName() {
		return hotelName;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getOfferPrice() {
		return offerPrice;
	}

	public String getStarRating() {
		return starRating;
	}

	public void setDestiationName(String destiationName) {
		this.destiationName = destiationName;
	}

	public void setGuestRating(String guestRating) {
		this.guestRating = guestRating;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setOfferPrice(String offerPrice) {
		this.offerPrice = offerPrice;
	}

	public void setStarRating(String starRating) {
		this.starRating = starRating;
	}

}
