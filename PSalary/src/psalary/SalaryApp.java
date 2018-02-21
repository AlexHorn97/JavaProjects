package psalary;

import javax.swing.JOptionPane;

public class SalaryApp {

	public static void main(String[] args) {
		double gross = Double.valueOf(JOptionPane.showInputDialog("Enter your gross income."));
		Salary sal = new Salary(gross);

	}

}
