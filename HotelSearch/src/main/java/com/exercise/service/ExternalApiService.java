package com.exercise.service;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.model.HotelFilter;

@Service("externalApiService")
public class ExternalApiService implements IExternalApiService {

	@Autowired
	private IApiConfigService apiConfigService;

	private String charset = java.nio.charset.StandardCharsets.UTF_8.name();

	@Override
	public String getHotelOffers(HotelFilter filter) {

		// Create an instance of SimpleDateFormat used for formatting
		// the string representation of date (year-month-day)
		// to format date as per API requirements
		DateFormat df = new SimpleDateFormat(":yyyy-MM-dd");

		// build the query parameters
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(apiConfigService.getHotelProductType());

		addQueryParameter(stringBuilder, apiConfigService.getDestniationParamName(), filter.getDestination());

		// check filters for null
		if (filter.getStartDate() != null) {
			addQueryParameter(stringBuilder, apiConfigService.getStartDateParam(), df.format(filter.getStartDate()));
		}

		if (filter.getEndDate() != null) {
			// calculate days difference to get length of stay
			long diff = filter.getEndDate().getTime() - filter.getStartDate().getTime();
			long days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
			System.out.println("Days: " + days);
			addQueryParameter(stringBuilder, apiConfigService.getLengthOfStayParam(), Long.toString(days));
		}

		if (filter.getMinStarRating() > 0) {
			addQueryParameter(stringBuilder, apiConfigService.getMinStarRatingParam(),
					Integer.toString(filter.getMinStarRating()));
		}
		if (filter.getMaxStarRating() > 0) {
			addQueryParameter(stringBuilder, apiConfigService.getMaxStarRatingParam(),
					Integer.toString(filter.getMaxStarRating()));
		}
		if (filter.getMinGuestRating() > 0) {
			addQueryParameter(stringBuilder, apiConfigService.getMinGuestRatingParam(),
					Integer.toString(filter.getMinGuestRating()));
		}
		if (filter.getMaxGuestRating() > 0) {
			addQueryParameter(stringBuilder, apiConfigService.getMaxGuestRatingParam(),
					Integer.toString(filter.getMaxGuestRating()));
		}
		String query = stringBuilder.toString();
		String response = callApi(query);
		return response;

	}

	private void addQueryParameter(StringBuilder sb, String paramName, String paramVlaue) {
		sb.append("&");
		sb.append(paramName);
		sb.append("=");
		sb.append(paramVlaue);
	}

	private String callApi(String query) {
		// Build URL
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(apiConfigService.getApiUrl());
		stringBuilder.append("?");
		addQueryParameter(stringBuilder, apiConfigService.getScenarioParamName(),
				apiConfigService.getScenarioParamVlaue());
		addQueryParameter(stringBuilder, apiConfigService.getPageParamName(), apiConfigService.getPageParamVlaue());
		addQueryParameter(stringBuilder, apiConfigService.getUidParamName(), apiConfigService.getUidParamVlaue());
		stringBuilder.append("&");

		stringBuilder.append(apiConfigService.getProductTypeParamName());
		stringBuilder.append("=");
		stringBuilder.append(query);
		System.out.println(stringBuilder.toString());
		try {
			URLConnection connection = new URL(stringBuilder.toString()).openConnection();
			connection.setRequestProperty("Accept-Charset", charset);
			InputStream response = connection.getInputStream();
			try (Scanner scanner = new Scanner(response)) {
				String responseBody = scanner.useDelimiter("\\A").next();
				return responseBody;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
