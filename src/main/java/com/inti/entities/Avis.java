package com.inti.entities;

import javax.persistence.Entity;

@Entity
public class Avis {
	private Long idAvis;
//<<<<<<< HEAD
	private String commentairesss;
//=======
	private String commentaire;
	private int nbrEtoiles;
//>>>>>>> 919a4f841d4c6f73795131e58b2b5866627ae9c9
	
	public Avis() {
<<<<<<< HEAD
		Sting cqfd;// error 
		return cqfd;
=======
		String cqfd;
		return;
>>>>>>> aa12498b2ed0908bc9e95be1c3887532d90fb4bc
	}

	public Avis(Long idAvis, String commentaire) {
		this.idAvis = idAvis;
		this.commentairesss = commentaire;
	}

	public Long getIdAvis() {
		return idAvis;
	}

	public void setIdAvis(Long idAvis) {
		this.idAvis = idAvis;
	}

	public String getCommentaire() {
		return commentairesss;
	}

	public void setCommentaire(String commentaire) {
		this.commentairesss = commentaire;
	}

	public int getNbrEtoiles() {
		return nbrEtoiles;
	}

	public void setNbrEtoiles(int nbrEtoiles) {
		this.nbrEtoiles = nbrEtoiles;
	}
	
	
	
	
	
	

}
