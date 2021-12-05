package com.hadil.films.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/*
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;
*/
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFilm;
	private String nomFilm;
	private Double prixTicket;
	private Date dateSortie;
	
	@ManyToOne
	private Genre genre;
	
	public Film() {
		super();
	}

	
	public Film(String nomFilm, Double prixTicket, Date dateSortie) {
		super();
		this.nomFilm = nomFilm;
		this.prixTicket = prixTicket;
		this.dateSortie = dateSortie;
	}
	



	public Long getIdFilm() {
		return idFilm;
	}
	public void setIdFilm(Long idFilm) {
		this.idFilm = idFilm;
	}
	public String getNomFilm() {
		return nomFilm;
	}
	public void setNomFilm(String nomFilm) {
		this.nomFilm = nomFilm;
	}
	public Double getPrixTicket() {
		return prixTicket;
	}
	public void setPrixTicket(Double prixTicket) {
		this.prixTicket = prixTicket;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	@Override
	public String toString() {
		return "Film [idFilm=" + idFilm + ", nomFilm=" + nomFilm + ", prixTicket=" + prixTicket + ", dateSortie="
				+ dateSortie + "]";
	}


	public Genre getGenre() {
		return genre;
	}


	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	
}
