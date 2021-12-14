package Zadaca5B;

import java.util.Set;
import java.util.TreeSet;

public class Glavna5B {

	public static void main(String[] args) {
		Set<String> mnozestvo1 = new TreeSet<String> ();
		mnozestvo1.add("plava");
		mnozestvo1.add("zelena");
		mnozestvo1.add("crvena");

		Set<String> mnozestvo2 = new TreeSet<String> ();
		mnozestvo2.add("plava");
		mnozestvo2.add("zelena");
		mnozestvo2.add("zolta");

		System.out.println("Unija od dvete mnozhestva");
		mnozestvo1.addAll(mnozestvo2);
		System.out.println(mnozestvo1);
	}
}
