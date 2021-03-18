package exersice_8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MyMain {

	private static DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Weight for first person (Kg): ");
		
		Weight human1 = new Weight();
		human1.setWeight(sc.nextDouble());
		
		System.out.print("Enter The Weight for second person (Kg): ");
		
		Weight human2 = new Weight();
		human2.setWeight(sc.nextDouble());
		
		System.out.println("Person 1");
		
		// Weight in Earth
		System.out.println("Weight in Earth is " + human1.getWeight() + " Kg");
		
		// Weight in Mars
		double weight_mars = (human1.getWeight()/9.81) * 3.711;
		System.out.println("Weight in Mars is " + df.format(weight_mars) + " Kg");
		
		System.out.println("Person 2");
		
		// Weight in Earth
		System.out.println("Weight in Earth is " + human2.getWeight() + " Kg");
		
		// Weight in Mars
		weight_mars = (human2.getWeight()/9.81) * 3.711;
		System.out.println("Weight in Mars is " + df.format(weight_mars) + " Kg");
	}
}
