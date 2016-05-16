package com.boltaar.inner;


public class OuterInnerTest {

	public static void main(String[] args) {
		
		System.out.println("Test nasz!");
		Outer outer1 = new Outer();
		outer1.displayInnerMethod();
		
		/*
		 * TAK JAK PONIZEJ TO MOZNA ZROBIC JEZELI INNER CLASA NIE JEST PRIVATE
		Outer.Inner inner1 = outer1.new Inner();
		inner1.printThatShiet();
		*/
		
	}// end of MAIN
} // end of OuterInnerTest


/*
 * Tutaj dla przykladu mamy dodatkowo klase outer z klasa inner w srodku
 * Inner jest jako Private zrobiona, wiec mozna sie do niej dostac tylko z klasy Outer
 */
class Outer{
	
	int num;
	
	private class Inner{
		public void printThatShiet(){
			System.out.println("This is from within an inner class");
		}
	} // END OF INNER
	
	public void displayInnerMethod(){
		Inner inner1 = new Inner();
		inner1.printThatShiet();
	}
	
} // END OF OUTER
