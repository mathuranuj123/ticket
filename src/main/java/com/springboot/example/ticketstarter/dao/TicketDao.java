package com.springboot.example.ticketstarter.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.example.ticketstarter.domain.Ticket;

@Repository
public interface TicketDao extends CrudRepository<Ticket, Long> {

}
