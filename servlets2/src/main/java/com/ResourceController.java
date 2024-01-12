package com;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import corenuts.service.ResourceService;
import corenuts.service.ResourceServiceImpl;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ResourceController extends HttpServlet {
	private static final long serialVersionUID = 0;
	private ResourceService resourceservice;
	private ObjectMapper objectMapper = null;
	
	@Override
	public void init() throws ServletException{
		ObjectMapper objectMapper = new ObjectMapper();
		ResourceService resourceservice = new ResourceServiceImpl();
		System.out.println("initialized");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Enumeration<String> headerNames = req.getHeaderNames();
	}

}
