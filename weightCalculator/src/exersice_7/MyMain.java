package exersice_7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MyMain {
	
	private static DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter The Weight (Kg): ");
				
		double weight = sc.nextDouble();
				
		// Weight in Mars
		double weight_mars = (weight/9.81) * 3.711;
		System.out.println("Weight in Mars is " + df.format(weight_mars) + " Kg");
	}

}
