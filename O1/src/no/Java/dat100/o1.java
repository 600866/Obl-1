package no.Java.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class o1 {

	public static void main(String[] args)  {
		int lonn = Integer.parseInt(showInputDialog("Lonn?"));
	
		double [][] sats = {
				{0.0, 0, 164100},
				{0.93, 164101, 230950},
				{0.241, 230951, 580650},
				{0.1152, 580651, 934050},
				{0.1452, 934501, lonn
				}};
		for (int i=0; i < sats.length; i++) {
			if(lonn >= sats [i][1] && lonn <= sats [i][2]) {
				System.out.println((lonn - (1 - sats[i][0]) * lonn) + " i skatt");
				}
		}
// test
	}

}
