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
		ticket.setAge(30);
		ticket.setPassengerName("Anuj");
		ticket.setSeatNo("A2-32");
		ticket.setStartPoint("Amritsar");
		ticket.setDestination("Chandighar");
		ticket.setTrainNo(4325l);
		ticket.setTravelDate(new Date());
		ticket.setEmail("anuj@gmail.com");
		ticketService.createTicket(ticket);
	}
}
