package com.exercise.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class HotelFilter {

	private String destination;

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date startDate;

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date endDate;
	
	private int minStarRating;
	private int maxStarRating;
	private int minGuestRating;
	private int maxGuestRating;

/*	public HotelFilter() {
		startDate = new Date();
		System.out.println(startDate.toString());
	}
*/
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getMinStarRating() {
		return minStarRating;
	}

	public void setMinStarRating(int minStarRating) {
		this.minStarRating = minStarRating;
	}

	public int getMaxStarRating() {
		return maxStarRating;
	}

	public void setMaxStarRating(int maxStarRating) {
		this.maxStarRating = maxStarRating;
	}

	public int getMinGuestRating() {
		return minGuestRating;
	}

	public void setMinGuestRating(int minGuestRating) {
		this.minGuestRating = minGuestRating;
	}

	public int getMaxGuestRating() {
		return maxGuestRating;
	}

	public void setMaxGuestRating(int maxGuestRating) {
		this.maxGuestRating = maxGuestRating;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
