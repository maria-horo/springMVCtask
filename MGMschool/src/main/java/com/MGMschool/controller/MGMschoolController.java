package com.MGMschool.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.MGMschool.bean.MGMschoolStandard;

@Controller
public class MGMschoolController {
	
	private static Logger log = LoggerFactory.getLogger(MGMschoolController.class.getSimpleName());
	
	@RequestMapping(path = "/standard", method = RequestMethod.GET)
	public ModelAndView standard() {
		Map map = new HashMap();
		map.put("headerName", "MGMschool");
		return new ModelAndView("standard", "stand", new MGMschoolStandard()).addAllObjects(map);
	}
	
	@RequestMapping(path = "/school", method = RequestMethod.POST)
	public ModelAndView createStandard(@ModelAttribute MGMschoolStandard mgm) {
		log.info(mgm.toString());
		return new ModelAndView("standard", "stand", mgm);
	}
}
