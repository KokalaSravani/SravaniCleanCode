package epam.com.CleanCode;
import java.util.Scanner;

public class Serialization_CleanCode {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
			
		CalculateCost cal = new CalculateCost();
			
		BudgetConstruction Budget = new BudgetConstruction();
			
		System.out.println("Enter 1 to calculate Simple_Interest");
		System.out.println("Enter 2 to calculate Compound_Interest");
		int option = s.nextInt();
		System.out.println("Enter principal, rate and time");
		double principal = s.nextDouble();
		double rate = s.nextDouble();
		double time = s.nextDouble();
		switch(option){
		case 1:
			System.out.println(cal.SimpleInterest(principal, rate, time));
			break;
		case 2:
			System.out.println(cal.computesCompoundInterest(principal, rate, time));
			break;
		default:
			System.out.println("Invalid option");
			}
			
			System.out.println("Enter Standard :");
			System.out.println("Enter 1 for normal ");
			System.out.println("Enter 2 for medium");
			System.out.println("Enter 3 for high");
			int standard = s.nextInt();
			int fullyAutomated;
			if( standard == 3){
				System.out.println("Enter 1 for fully automated house else enter 0");
				fullyAutomated = s.nextInt();
			}else{
				fullyAutomated = 0;
				
			}
			System.out.println("Enter area ");
			double area = s.nextDouble();
			System.out.println(Budget.calculatesConstructionCost(area, standard, fullyAutomated));
	}
}