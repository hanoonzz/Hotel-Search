package com.exercise.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("apiConfigService")
public class ApiConfigService implements IApiConfigService {

	@Value("${apiUrl}")
	private String apiUrl;

	@Value("${scenarioParamName}")
	private String scenarioParamName;

	@Value("${scenarioParamVlaue}")
	private String scenarioParamVlaue;

	@Value("${pageParamName}")
	private String pageParamName;

	@Value("${pageParamVlaue}")
	private String pageParamVlaue;

	@Value("${uidParamName}")
	private String uidParamName;

	@Value("${uidParamVlaue}")
	private String uidParamVlaue;

	@Value("${productTypeParamName}")
	private String productTypeParamName;

	@Value("${dateFormat}")
	private String dateFormat;
	
	@Value("${HotelProductType}")
	private String HotelProductType;
	
	@Value("${destniationParamName}")
	private String destniationParamName;

	@Value("${startDateParam}")
	private String startDateParam;

	@Value("${lengthOfStayParam}")
	private String lengthOfStayParam;

	@Value("${maxStarRatingParam}")
	private String maxStarRatingParam;

	@Value("${minStarRatingParam}")
	private String minStarRatingParam;

	@Value("${minGuestRatingParam}")
	private String minGuestRatingParam;
	
	@Value("${maxGuestRatingParam}")
	private String maxGuestRatingParam;
	
	@Value("${originCity}")
	private String originCityParam;
	
	@Value("${flightProductType}")
	private String FlightProductType;
	

	public String getApiUrl() {
		return apiUrl;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.exercise.service.IApiConfigService#getDateFormat()
	 */
	public String getDateFormat() {
		return dateFormat;
	}

	public String getDestniationParamName() {
		return destniationParamName;
	}

	public String getFlightProductType() {
		return FlightProductType;
	}

	public String getHotelProductType() {
		return HotelProductType;
	}

	public String getLengthOfStayParam() {
		return lengthOfStayParam;
	}

	public String getMaxGuestRatingParam() {
		return maxGuestRatingParam;
	}

	public String getMaxStarRatingParam() {
		return maxStarRatingParam;
	}

	public String getMinGuestRatingParam() {
		return minGuestRatingParam;
	}

	public String getMinStarRatingParam() {
		return minStarRatingParam;
	}


	public String getOriginCityParam() {
		return originCityParam;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.exercise.service.IApiConfigService#getPageParamName()
	 */
	public String getPageParamName() {
		return pageParamName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.exercise.service.IApiConfigService#getPageParamVlaue()
	 */
	public String getPageParamVlaue() {
		return pageParamVlaue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.exercise.service.IApiConfigService#getProductTypeParamName()
	 */
	public String getProductTypeParamName() {
		return productTypeParamName;
	}

	public String getScenarioParamName() {
		return scenarioParamName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.exercise.service.IApiConfigService#getScenarioParamVlaue()
	 */
	public String getScenarioParamVlaue() {
		return scenarioParamVlaue;
	}

	public String getStartDateParam() {
		return startDateParam;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.exercise.service.IApiConfigService#getUidParamName()
	 */
	public String getUidParamName() {
		return uidParamName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.exercise.service.IApiConfigService#getUidParamVlaue()
	 */
	public String getUidParamVlaue() {
		return uidParamVlaue;
	}

}
