package no.Java.dat100;

import static javax.swing.JOptionPane.*;

public class o2 {

	public static void main(String[] args) throws Exception {
		
		for (int i = 0; i < 10; i++) {
			int poeng = Integer.parseInt(showInputDialog("hvor mange poeng fikk du?"));
			
			if (poeng <= 100 && poeng >=90) {
				System.out.println("Karakteren A");
			}
			if (poeng < 90 && poeng >=80) {
				System.out.println("Karakteren B");
			} 
			if (poeng < 80 && poeng >= 60) {
				System.out.println("Karakteren C");
			}
			if (poeng < 60 && poeng >= 50) {
				System.out.println("Karakter D");
			}
			if (poeng < 50 && poeng >= 40) {
				System.out.println("Karakter E");
			}
			if (poeng < 40 && poeng >= 0) {
				System.out.println("Karakter F");
			}
			else {
				System.out.println("Ugyldig verdi, maks er 100, og min er 0");
				i--;
			}	
		}
	}
}
