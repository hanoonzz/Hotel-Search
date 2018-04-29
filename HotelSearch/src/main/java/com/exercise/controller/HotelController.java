package com.exercise.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exercise.model.HotelFilter;

@Controller
public class HotelController {

	@RequestMapping(value = "hotel", method = RequestMethod.GET)
	public String serachHotel(Model model) {
		HotelFilter filter = new HotelFilter();
		model.addAttribute("hotelFilter", filter);
		
		return "hotel";
	}
	
	@RequestMapping(value = "hotel", method = RequestMethod.POST)
	public String serachHotel(@Valid @ModelAttribute("hotelFilter") HotelFilter filter, BindingResult result) {		
		System.out.println(filter.getDestination());
	    System.out.println(filter.getStartDate().toString());
		return "redirect:index.jsp";
	}
	
	
	/**
	 * allows spring to convert string to date format
	 * **/
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        sdf.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
}
