package com.sam.zookeepersts;


public class TestKeeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal mammal1 = new Mammal(100);
		mammal1.displayEnergy();
		
//		--------------
		Gorilla munkie = new Gorilla(100);
		munkie.displayEnergy();
		munkie.throwBan();
		munkie.eatBan();
		munkie.displayEnergy();
		
//	--------batty boy---
		Bat covid = new Bat();
		covid.displayEnergy().displayEnergy();
		covid.fly();
		covid.eatHumans();
		covid.attackTown();
		covid.fly();
		covid.eatHumans();
		covid.attackTown();
		covid.attackTown();
		covid.displayEnergy();	
	}
	
}
