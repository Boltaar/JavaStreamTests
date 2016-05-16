package com.boltaar.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomStreamApp2 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Integer[] tablicaLiczb = new Integer[10];
		int suma1 = 0;
		int suma2 = 0;
		
		for (int i=0; i<10; i++){
			tablicaLiczb[i] = rand.nextInt(20);
			System.out.println(tablicaLiczb[i]);
			suma1 = suma1 + tablicaLiczb[i];
		}
		
		System.out.println("Suma liczona recznie to: " + suma1);
		
		List<Integer> listaLiczb = Arrays.asList(tablicaLiczb);
		
		for (Integer element:listaLiczb){
			System.out.println(element);
		}
		
		System.out.println("Suma przez Stream: " + listaLiczb.stream().mapToInt(p -> p).sum());
		
		
	}
}
