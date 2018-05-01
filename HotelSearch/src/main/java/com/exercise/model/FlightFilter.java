package com.exercise.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class FlightFilter {
	private String origin;

	private String destination;

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date startDate;

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date endDate;

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
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
