package com.springboot.example.ticketstarter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.example.ticketstarter.domain.Ticket;
import com.springboot.example.ticketstarter.service.TicketService;

@RestController
@RequestMapping(value = "/ticket/")
public class TicketController {
	@Autowired
	TicketService ticketService;
	
	@PostMapping(value = "createTicket")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketService.createTicket(ticket);
	}
	
	@GetMapping(value = "getTicktes")
	public Iterable<Ticket> getTickets(){
		return ticketService.getAllTickets();
	}
	
	@GetMapping(value = "ticket/{ticketId}")
	public Ticket getTicket(@PathVariable(value = "ticketId") Long ticketId) {
		return ticketService.getTicket(ticketId);
	}
	
	@DeleteMapping(value = "ticket/{ticketId}")
	public void deleteTicket(@PathVariable(value = "ticketId") Long ticketId) {
		 ticketService.deleteTicket(ticketId);
	}
	
	@PutMapping(value = "ticket/{ticketId}/{email}")
	public Ticket updateTicket(@PathVariable Long ticketId,@PathVariable String email) {
		return ticketService.updateTicket(ticketId, email);
	}
}
