package com.inti.entities;

import javax.persistence.Entity;

@Entity
public class Destination {
	private Long idDestination;
	private Long longitude;
	private Long latitude;
	
	public Destination() {
		
	}

	public Destination(Long idDestination, Long longitude, Long latitude) {
		super();
		this.idDestination = idDestination;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public Long getIdDestination() {
		return idDestination;
	}

	public void setIdDestination(Long idDestination) {
		this.idDestination = idDestination;
	}

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public Long getLatitude() {
		return latitude;
	}

	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}
	
	

}
