package com.springboot.example.ticketstarter;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.example.ticketstarter.domain.Ticket;
import com.springboot.example.ticketstarter.service.TicketService;

@SpringBootApplication
public class TicketBookingAppApplication implements CommandLineRunner {

	@Autowired
	TicketService ticketService;

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Ticket ticket = new Ticket();
		ticket.setAge(21);
		ticket.setPassengerName("Rohan");
		ticket.setSeatNo("A1-23");
		ticket.setStartPoint("Ajmer");
		ticket.setDestination("Delhi");
		ticket.setTrainNo(1232l);
		ticket.setTravelDate(new Date());
		ticket.setEmail("rohan@gmail.com");
		ticketService.createTicket(ticket);
	}
}
