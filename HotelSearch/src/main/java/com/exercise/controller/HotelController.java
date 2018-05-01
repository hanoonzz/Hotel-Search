package com.exercise.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

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

import com.exercise.model.HotelFilter;
import com.exercise.model.HotelOffer;
import com.exercise.service.IHotelService;

@Controller
@RequestMapping("/Hotel")
public class HotelController {

	@Autowired
	private IHotelService hotelService;
	
	@RequestMapping(value = "hotel", method = RequestMethod.GET)
	public String serachHotel(Model model) {
		HotelFilter filter = new HotelFilter();
		model.addAttribute("hotelFilter", filter);
		
		return "Hotel/hotel";
	}
	
	@RequestMapping(value = "hotel", method = RequestMethod.POST)
	public String serachHotel(@Valid @ModelAttribute("hotelFilter") HotelFilter filter, BindingResult result,RedirectAttributes redir) {		

	    List<HotelOffer> offers= hotelService.findOffers(filter);
	    System.out.println(offers.size());
	    redir.addFlashAttribute("offers" , offers);
		return "redirect:result.html";
	}
	
	@RequestMapping(value= "result")
	public ModelAndView result(Model model)
	{
		ModelAndView modelAndView = new ModelAndView("Hotel/result");
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
