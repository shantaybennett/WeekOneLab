//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package weekone;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight	
		
		int seatsLeftOnThePlane = 6;

		
		// 2. Create a variable to hold the cost of groceries at checkout

		double costOfGroceries = 35.00;
		
		// 3. Create a variable to hold a person's middle initial

	
		char middleInitial = 'S';
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside

		boolean isHot = true;
		
		// 5. Create a variable to hold a customer's first name

		String customersFirstName = "Shantay";
		
		// 6. Create a variable to hold a street address
		
		String streetAddress = "2829 Martin Luther King Drive";
		

		// 7. Print all variables to the console
		
		System.out.println("Avaliable seats on plane:" + " "+ seatsLeftOnThePlane);
		System.out.println("The total cost of my groceries is " + " " + costOfGroceries);
		System.out.println(" The custiomer's middle initial is" + " " + middleInitial);
		System.out.println(" Is it hout outside ?" + " " + isHot);
		System.out.println(" The customer's first name is " +  " " + customersFirstName);
		System.out.println("The street address is " + " " + streetAddress);

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
	

		int seatsLeftOnThePlane = seatsLeftOnThePlane - 2;
		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;

		double costOfGroceries = costOfGroceries + 2.15;

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		
		 char middleInitial = 'L'

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
				 
				 boolean isHot = false;


		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		 
		 String customersFullName = customersFirstName + " " + middleInitial + " Barrett";
	

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		 
		 System.out.println( " Hello this is " + " " + customersFullName + " " + "she lives at " + " " + streetAddress);

		
		
	}
}