package io.altar.jseproject.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Entity {
	
	@Id
	@GeneratedValue
	private Long ID;

	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		this.ID = iD;
	}
	
}
