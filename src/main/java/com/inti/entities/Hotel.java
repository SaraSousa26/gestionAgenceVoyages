package com.inti.entities;

import javax.persistence.Entity;

@Entity
public class Hotel {
	
	private Long idHotel;
	private String nom;
	private int nbEtoile;
	
	public Hotel() {
		
	}

	public Long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbEtoile() {
		return nbEtoile;
	}

	public void setNbEtoile(int nbEtoile) {
		this.nbEtoile = nbEtoile;
	}
	
	
	

}
