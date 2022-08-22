package com.inti.entities;

import javax.persistence.Entity;

@Entity
public class Avis {
	private Long idAvis;
	private String commentaire;
	
	public Avis() {
	
	}

	public Avis(Long idAvis, String commentaire) {
		this.idAvis = idAvis;
		this.commentaire = commentaire;
	}

	public Long getIdAvis() {
		return idAvis;
	}

	public void setIdAvis(Long idAvis) {
		this.idAvis = idAvis;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	
	
	
	
	

}
