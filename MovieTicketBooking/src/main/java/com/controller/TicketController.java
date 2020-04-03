package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Ticket;
import com.service.TicketService;

@Controller
public class TicketController {

	@Autowired
	private TicketService ticketservice;

	public TicketService getTicket() {
		return ticketservice;
	}

	public void setTicket(TicketService ticket) {
		this.ticketservice = ticket;
	}

	@RequestMapping(value="showpage" ,method=RequestMethod.GET)
	public String showPage(@ModelAttribute("ticket") Ticket ticket)
	{
		System.out.println("yo");
		return "showpage";
	}
	
	@RequestMapping(value="calculateCost",method=RequestMethod.POST)
	public String calculateTotalCost(@ModelAttribute("ticket") Ticket ticket, ModelMap model, BindingResult result) {
		double cost = ticketservice.calculateTotalCost(ticket);
		model.put("cost", cost);
		return "result";
	}
	
	@ModelAttribute("circleList")
	public List<String> buildState()
	{
		List<String> list = new ArrayList<>();
		list.add("King");
		list.add("Queen");
		
		return list;
	}
	

}
