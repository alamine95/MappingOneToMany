package sn.esmt.domaine;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="departements")
public class Departement {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer iddep;
	private String nomdep;
	@OneToMany(mappedBy="departement", cascade=CascadeType.ALL)
	private Employee employee;
	
	
	public Departement() {

	}


	public Integer getIddep() {
		return iddep;
	}


	public void setIddep(Integer iddep) {
		this.iddep = iddep;
	}


	public String getNomdep() {
		return nomdep;
	}


	public void setNomdep(String nomdep) {
		this.nomdep = nomdep;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	
	
	
}
