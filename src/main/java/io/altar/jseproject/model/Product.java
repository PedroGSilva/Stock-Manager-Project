package io.altar.jseproject.model;

import java.io.Serializable;

@javax.persistence.Entity
public class Product extends Entity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int exposedIn [];
	private double disc;
	private int  vat;
	private double sPrice;
	
	// Empty Product constructor
	public Product (){
	}
		
				
	public int[] getExp() {
		return exposedIn;
	}
	public void setExp(int[] exp) {
		this.exposedIn = exp;
	}
	public int getVat() {
		return vat;
	}
	public void setVat(int vat) {
		this.vat = vat;
	}
	public double getsPrice() {
		return sPrice;
	}
	public void setsPrice(double sPrice) {
		this.sPrice = sPrice;
	}
	public double getDisc() {
		return disc;
	}
	public void setDisc(double disc) {
		this.disc = disc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return this.getID() + " - " + name;
	}
	

}
