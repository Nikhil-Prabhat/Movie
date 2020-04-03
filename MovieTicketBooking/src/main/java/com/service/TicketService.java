package com.service;

import org.springframework.stereotype.Component;

import com.model.Ticket;

@Component
public class TicketService {

	public double calculateTotalCost(Ticket ticket) {
		String circle = ticket.getCircleType();
		int number = ticket.getNoOfTickets();
		double cost = 0.0;
		if (circle.equals("King")) {
			cost = (number * 150);
		} else {
			cost = (number * 250);
		}

		return cost;
	}

}
