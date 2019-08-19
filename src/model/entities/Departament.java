package model.entities;

import java.io.Serializable;

public class Departament implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer ID;
	private String name;
	
	public Departament() {}
	
	public Departament(Integer id, String name) {
		this.ID = id;
		this.name = name;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
