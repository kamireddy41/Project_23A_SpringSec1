package com.telusko.SpringSec1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class ResourceController 
{
	@GetMapping("/telusko")
	public String getInfo(HttpServletRequest request)
	{
		
		return "Telusko has launched fasttrack spring boot course : "+ request.getSession().getId();
	}
	
	@GetMapping("/moreinfo")
	public String getMoreInfo(HttpServletRequest request)
	{
		return " full day course 7 hour a day : "+ request.getSession().getId();
	}

}
