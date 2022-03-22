package sn.esmt.domaine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
public class Employee {

	@Id
	@Column(length = 50)
	private String mat;
	private String nom;
	private String prenom;
	@ManyToOne
	@JoinColumn(name="iddep")
	private Departement departement;
	
	public Employee() {
		
	}


	public String getMat() {
		return mat;
	}


	public void setMat(String mat) {
		this.mat = mat;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public Departement getDepartement() {
		return departement;
	}


	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	
	
}
