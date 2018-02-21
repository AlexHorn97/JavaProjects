package ceasarcypher;

import javax.swing.JOptionPane;

public class CeasarCypherApp {

	public static void main(String[] args) {
		String ptext = JOptionPane.showInputDialog("Enter your text to encrypt.");
		CeasarCypher encrypted = new CeasarCypher(ptext);
		encrypted.encrypt();
		System.out.println(encrypted.getCyText());
	}

}
