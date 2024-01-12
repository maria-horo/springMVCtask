package com.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.bean.OrderingFood;

import com.springmvc.service.OrderingFoodService;
@Controller
public class FoodController {
	
	@Autowired
	private OrderingFoodService foodService;
	
	@RequestMapping( path = "/orderingfood" , method = RequestMethod.GET )
	public ModelAndView ordering() {
		
		return new ModelAndView("food","orderingfood", new OrderingFood());
	}

	@RequestMapping( path = "/orderingfood" , method = RequestMethod.POST)
	public ModelAndView ordering1(@ModelAttribute(name="orderingfood") OrderingFood food,BindingResult bindingResult, ModelMap map) {
		foodService.save(food);
		System.out.println("inserted");
		return new ModelAndView("foodupdate");
	}
	
	@RequestMapping( path = "/update" , method = RequestMethod.GET )
	public ModelAndView update() {
		
		return new ModelAndView("foodupdate","orderingfood", new OrderingFood());
	}
	
	
	
	@RequestMapping(path = "/updatefood" , method = RequestMethod.PUT)
	public ModelAndView roomUpdate(@Valid @ModelAttribute(name="orderingfood") OrderingFood ordering  , BindingResult bindingResult, ModelMap map) {
//		System.out.println(bindingResult.hasErrors());
		
		
		if(bindingResult.hasErrors()) {
			return new ModelAndView("foodupdate","orderingfood", ordering);
		}
		else {
			foodService.update(ordering);
			return new ModelAndView("thankyou");
		}
	}
	
}
