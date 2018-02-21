package pnameinstars;

import javax.swing.JOptionPane;

public class NameInStarsApp {

	public static void main(String[] args) {
		//Get users name through dialog box
		String userName = JOptionPane.showInputDialog("Enter your name.");
		NameInStars you = new NameInStars(userName);
		you.SurroundNameInStars();
		JOptionPane.showMessageDialog(null, you.getName());
		

	}

}
