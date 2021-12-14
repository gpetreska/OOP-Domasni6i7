package Zadaca10;

import java.util.ArrayList;
import java.util.List;

public class Glavna10 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Crvena");
		l1.add("Sina");
		l1.add("Zolta");
		List<String> l2 = new ArrayList<String>();
		l2.add("Kafeava");
		l2.add("Zelena");
		l2.add("Crna");

		l1.addAll(l2);

		System.out.println(l1);
	}

}
