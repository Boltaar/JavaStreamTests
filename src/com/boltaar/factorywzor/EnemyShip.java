package com.boltaar.factorywzor;

public abstract class EnemyShip {

	private String name;
	private double amtDamage;

	public String getName() {
		return name;
	}

	public double getAmtDamage() {
		return amtDamage;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAmtDamage(double amtDamage) {
		this.amtDamage = amtDamage;
	}

	public void followHeroShip(){
		System.out.println(this.getName() + " is following the Hero");
	}
	
	public void displayEnemyShip(){
		System.out.println(this.getName() + " attacks our hero and does: " + this.getAmtDamage());
	}
}
