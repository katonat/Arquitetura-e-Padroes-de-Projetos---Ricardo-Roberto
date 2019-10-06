
public class Main {
	
	public static void main(String[] args) {
		
		
		RobotBuilder oldStyleRobotBuilder = new OldRobotBuilder();
		RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobotBuilder);
		
		robotEngineer.makeRobot();
		
		Robot firstRobot = robotEngineer.getRobot();
		
		System.out.println("Robot Built");
		
	}

}
