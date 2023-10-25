package com.jewels.assignment;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Jewellery {
	
	@Id
	private String id;
	
	private String jewelName;
	private String type;
	
	public Jewellery() {
		super();
	}
	public Jewellery(String id, String jewelName, String type) {
		super();
		this.id = id;
		this.jewelName = jewelName;
		this.type = type;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getJewelName() {
		return jewelName;
	}
	public void setJewelName(String jewelName) {
		this.jewelName = jewelName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
