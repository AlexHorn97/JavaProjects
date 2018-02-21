package psalary;

public class Salary {
	private double gross;
	public double getGross() 
	{
		return gross;
	}
	public double getTax() 
	{
		double tax = 0;
		if(gross > 70000) 
		{
			tax = 	(gross -70000) * .33 +
					22000 * .30 +
					34000 * .175 +
					14000 * .105;		
		}
		else if (gross > 48000 && gross < 70000) 
		{
			tax = 	(gross - 48000) * .30 +
					34000 * .175 +
					14000 * .105;
		}
		else if (gross > 14000 && gross < 48000) 
		{
			tax = 	(gross - 34000) * .175 +
					14000 * .105;
		}
		
		return tax;
	}
	public double getNet() 
	{
		double net = 0;
		
		
		return net;
	}
	
	public Salary(double gross) 
	{
		
	}
	public void setGross(double gross) 
	{
		
	}
}
