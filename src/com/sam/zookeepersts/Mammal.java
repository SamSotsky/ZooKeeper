package com.sam.zookeepersts;

public class Mammal {
	
//	member VAR-------------
	private int energyLevel;
	
//	Constructor=-----------------
	public Mammal() {
		this.energyLevel = 100;
	}
	
//	OVERLORD
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	
	
//	method
	public Mammal displayEnergy() {
		System.out.println("This animal's energy level is " + (this.energyLevel));
		return this;
	}
	
//GETTEY
	public int getEnergyLevel() {
		return energyLevel;
	}
//SETTEY
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}
