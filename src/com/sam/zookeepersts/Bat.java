package com.sam.zookeepersts;

public class Bat extends Mammal {
	
	public Bat() {
		super(300);
	}
	public Bat(int energy) {
		super(energy);
	}
	
	
// methods
	public void fly() {
		System.out.println("yeeeeeeeeeeeeeeeeeeee");
		this.setEnergyLevel(this.getEnergyLevel() - 50);
	}
	public void eatHumans() {
		System.out.println("Chompy mc chompertins");
		this.setEnergyLevel(this.getEnergyLevel() + 25);
	}
	public void attackTown() {
		System.out.println("I am bat. I am attack town");
		this.setEnergyLevel(this.getEnergyLevel() - 100);
	}

}
