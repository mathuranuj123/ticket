package com.springboot.example.ticketstarter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.example.ticketstarter.dao.TicketDao;
import com.springboot.example.ticketstarter.domain.Ticket;

@Service
public class TicketService {
	@Autowired
	TicketDao ticketDao;
	
	//Create new Ticket
	public Ticket createTicket(Ticket ticket) {
		return ticketDao.save(ticket);
	}
	
	//Get all tickets
	public Iterable<Ticket> getAllTickets(){
		return ticketDao.findAll();
	}
	
	//Get one ticket
	public Ticket getTicket(Long ticketId) {
		return ticketDao.findById(ticketId).orElse(new Ticket());
	}
	
	public Ticket updateTicket(Long ticketId, String email) {
		Ticket ticket = ticketDao.findById(ticketId).orElse(new Ticket());
		ticket.setEmail(email);
		return ticketDao.save(ticket);
	}
	
	public void deleteTicket(Long ticketId) {
		ticketDao.deleteById(ticketId);
	}
}
