package check;

import constants.Constants;

public class Check {

	private static String firstName = "松井";
	private static String lastName = "愛深";

	private static void printName(String firstName, String lastName) {
		String fullName = firstName + lastName;
		System.out.println("printNameメソッド → " + fullName);

	}

	public static void main(String[] args) {
		printName(firstName, lastName);
		Pet p = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		p.introduce();

		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();

	}

}
