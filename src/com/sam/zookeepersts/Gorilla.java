package com.sam.zookeepersts;

public class Gorilla extends Mammal{
//		member VAr--------
		
		
//		constructor----------------
	public Gorilla(int energy) {
		super(energy);
	}

	
	
//	method
	public void eatBan() {
		System.out.println("Nom nom NOM nommy");
		this.setEnergyLevel(this.getEnergyLevel() - 5);
	}
	public void throwBan() {
		System.out.println("ya yeet");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
	}
	
	
//	getter setter
//	public int getThrowBan() {
//		return throwBan;
//	}
//
//	public void setThrowBan(int throwBan) {
//		this.throwBan = throwBan;
//	}
//
//	public int getEatBan() {
//		return eatBan;
//	}
//
//	public void setEatBan(int eatBan) {
//		this.eatBan = eatBan;
//	}
//	
	

	
}
