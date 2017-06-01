package io.altar.jseproject.model;

@javax.persistence.Entity
public class Shelf extends Entity {
	
		//Shelf location
	private int local;
		//Shelf capacity
	private int capac;
		//Stored product 
	private Product prodId;
		//Rent price
	private double rent;
	
	// Empty Shelf constructor
	public Shelf (){
	}
	

	
	public int getLocal() {
		return local;
	}
	public void setLocal(int local) {
		this.local = local;
	}
	public int getCapac() {
		return capac;
	}
	public void setCapac(int capac) {
		this.capac = capac;
	}
	public Product getProdId() {
		return prodId;
	}
	public void setProdId(Product prodId) {
		this.prodId = prodId;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	
}
