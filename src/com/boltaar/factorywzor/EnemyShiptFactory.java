package com.boltaar.factorywzor;

public class EnemyShiptFactory {

	/*
	 * Mamy tutaj po prostu 1 metoda, ktora bedzie tworzyc nam EnemyShip i jej podklasy - w zaleznosci od potrzeba
	 * Dizeki temu uzyskujemy dodatkowa Enkapsulacje (ze nie widac tych obiektow wszedzie dookoloa).
	 * Dodatkowo latwiej jest wprowadzac potencjalne zmiany w przyszlosci
	 */
	public EnemyShip makeEnemyShip(String newShipType){
		EnemyShip newShip = null;
		
		if (newShipType.equals("U")){
			return new UFOEnemyShip();
		} else if (newShipType.equals("R")){
			return new RocketEnemyShip();
		} else if (newShipType.equals("B")){
			return new BigUFOEnemyShip();
		} else return null;
	}
}
