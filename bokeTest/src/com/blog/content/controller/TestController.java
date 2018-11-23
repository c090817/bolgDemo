package com.blog.content.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/test")
public class TestController {

	
	@RequestMapping(value = "/totestPage")
	public ModelAndView totestPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/html/test");
		return modelAndView;
	}
	
	
	@RequestMapping(value = "/postPage.do")
	public ModelAndView postPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/html/test");
		return modelAndView;
	}
}
