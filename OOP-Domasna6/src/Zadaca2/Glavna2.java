package Zadaca2;

import java.util.ArrayList;
import java.util.List;

public class Glavna2 {
   public static void main(String[]args) {
	   List<String> lista=new ArrayList<String>();
	   lista.add("Makedonija");
	   lista.add("Bugarija");
	   lista.add("Estonija");
	   lista.add("Germanija");
	   lista.add("Francija");
	   
	   System.out.println("Listata sodrzhi "+lista.size()+ " elementi. ");
	   
	   if(lista.size() == 3) {
		   lista.add("Srbija");
		   lista.add("Hrvatska");
		   
		   System.out.println(lista);
	   }
	   else {
		   System.out.println(lista);
	   }
   }
}