package com.springboot.example.ticketstarter.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket_tbl")
public class Ticket {

	@Id
	@Column(name = "ticket_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ticketId;

	@Column(name = "train_no")
	private Long trainNo;

	@Column(name = "start_point")
	private String startPoint;

	@Column(name = "destination")
	private String destination;

	@Column(name = "seat_no")
	private String seatNo;

	@Column(name = "passenger_name")
	private String passengerName;

	@Column(name = "age")
	private int age;

	@Column(name = "travel_date")
	private Date travelDate;
	
	private String email;

	public Ticket() {}
	
	public Ticket(Long ticketId, Long trainNo, String startPoint, String destination, String seatNo,
			String passengerName, int age, Date travelDate, String email) {
		super();
		this.ticketId = ticketId;
		this.trainNo = trainNo;
		this.startPoint = startPoint;
		this.destination = destination;
		this.seatNo = seatNo;
		this.passengerName = passengerName;
		this.age = age;
		this.travelDate = travelDate;
		this.email = email;
	}

	public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}

	public Long getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(Long trainNo) {
		this.trainNo = trainNo;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
