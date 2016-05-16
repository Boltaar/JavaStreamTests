package com.boltaar.factorywzor;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		
		EnemyShiptFactory shipFactory = new EnemyShiptFactory();
		EnemyShip theEnemy = null;
		
		Scanner odczyt = new Scanner(System.in);
		System.out.println("What's the type of ship (U / R / B) ");
		
		if (odczyt.hasNextLine()){
			String typeOfShip = odczyt.nextLine();
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
		}
		
		if (theEnemy != null){
			doStuffEnemy(theEnemy);
		}
		
	} // END OF MAIN
	
	public static void doStuffEnemy(EnemyShip anEnemyShip){
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
	}
}
