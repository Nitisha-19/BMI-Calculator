package day3;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {

		int a = 703;

		System.out.println("Enter your height in feet");
		Scanner scanner = new Scanner(System.in);// using scanner class to capture input from user
		int height1 = scanner.nextInt();

		System.out.println("Enter your height in inches");
		int height2 = scanner.nextInt();

		System.out.println("Enter your weight in lb");
		double weight = scanner.nextDouble();

		int height = (12 * height1) + height2;// converting feet to inches

		double BMI = (a * weight) / (height * height);// BMI formula

		System.out.println("Your BMI is " + BMI);
		
		if(BMI < 18.5)
		{
			System.out.println("You are underweight");
		}
		else if(BMI>=18.5 && BMI< 24.9)
		{
			System.out.println("You are healthy weight");
		
		}
		else if(BMI>=25 && BMI<29.9)
		{
			System.out.println("You are overweight");
		}
		else if(BMI>29.9)
		{
			System.out.println("You are obese");
		}
	}

}
