package com.exercise.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.exercise.model.FlightFilter;
import com.exercise.model.FlightOffer;
import com.exercise.model.HotelOffer;
import com.exercise.service.IFlightService;

@Controller
@RequestMapping("/Flight")
public class FlightController {
	
	@Autowired
	private IFlightService flightService;
	
	@RequestMapping(value = "flight", method = RequestMethod.GET)
	public String serachFlights(Model model) {
		FlightFilter filter = new FlightFilter();
		model.addAttribute("flightFilter", filter);
		
		return "Flight/flight";
	}
	
	@RequestMapping(value = "flight", method = RequestMethod.POST)
	public String serachFlights(@Valid @ModelAttribute("flightFilter") FlightFilter filter, BindingResult result,RedirectAttributes redir) {		

	    List<FlightOffer> offers= flightService.findOffers(filter);
	    redir.addFlashAttribute("offers" , offers);
		return "redirect:result.html";
	}
	
	@RequestMapping(value= "result")
	public ModelAndView result(Model model)
	{
		ModelAndView modelAndView = new ModelAndView("Flight/result");
		return modelAndView;
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
