package com.exercise.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exercise.model.HotelFilter;
import com.pluralsight.model.Goal;

@Controller
public class HotelController {

	@RequestMapping(value = "hotel", method = RequestMethod.GET)
	public String serachHotel(Model model) {
		HotelFilter filter = new HotelFilter();
		model.addAttribute("hotelFilter", filter);
		
		return "hotel";
	}
	
	@RequestMapping(value = "hotel", method = RequestMethod.POST)
	public String serachHotel(@Valid @ModelAttribute("hotelFilter") HotelFilter goal, BindingResult result) {		
		
		return "redirect:index.jsp";
	}
}
