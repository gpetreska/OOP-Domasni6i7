package Zadaca4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Glavna4 {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(523);
		lista.add(234);
		lista.add(798);
		lista.add(248);
		lista.add(167);
				
		Collections.sort(lista);
		
		System.out.println(lista);
	}
}
