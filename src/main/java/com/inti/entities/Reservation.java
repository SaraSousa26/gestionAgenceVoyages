package com.inti.entities;

import java.sql.Date;

public class Reservation {
	private Long idVoyageur;
	private Date dateReservation;
	private int nbJours;
	
	public Reservation() {
		
	}

	public Long getIdVoyageur() {
		return idVoyageur;
	}

	public void setIdVoyageur(Long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public int getNbJours() {
		return nbJours;
	}

	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}
	
	
	
	
}
