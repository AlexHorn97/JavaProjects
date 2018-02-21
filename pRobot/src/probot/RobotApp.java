package probot;

public class RobotApp {

	public static void main(String[] args) {
		System.out.println("Making the robots...");
		Robot machine1 = new Robot("R2D2","solar");
		Robot machine2 = new Robot("C3P0","solar");
		
		System.out.println(machine1.getName() + " runs on " + machine1.getFuel() + " fuel.");
		System.out.println(machine2.getName() + " runs on " + machine2.getFuel() + " fuel.");
		
		
	
	
	}

}
