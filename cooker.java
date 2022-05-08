
package blinmaker;

import java.util.Scanner;

public class cooker {

	public static void main(String[] args) {
		int eggsAmount;
		int eggsMin = 1;
		int milkAmount;
		int milkMin = 200; //milliliter
		int flourAmount;
		int flourMin = 100; // grams
		System.out.println("hello Boris!");
		System.out.println("blinmaker is starting up..");
		System.out.println("How many eggs you have?");
		
		Scanner userInput;
		userInput = new Scanner(System.in);
		eggsAmount = userInput.nextInt();
		//System.out.println("you have " + eggsAmount + " eggs");
		// eggs done
		System.out.println("how much milk you have?");
		userInput = new Scanner(System.in);
		milkAmount = userInput.nextInt();
		//System.out.println("you have " + milkAmount + "ml milk");
		//milk done
		
		System.out.println("how much flour you have?");
		userInput = new Scanner(System.in);
		flourAmount = userInput.nextInt();
		//System.out.println("you have " + flourAmount + "g flour");
		//flour done
		
		//main code here
		if (eggsAmount < eggsMin || milkAmount < milkMin ||flourAmount < flourMin) {
		System.out.println("no blin today :(");
		} else {
			//calculation
			flourAmount = flourAmount / flourMin;
			System.out.println("you have " + flourAmount + " portion of flour");
			
			milkAmount = milkAmount / milkMin;
			System.out.println("you have " + milkAmount + " portion of milk");
			
			eggsAmount = eggsAmount / eggsMin;
			System.out.println("you have " + eggsAmount + "  eggs");
			
			//find smallest of all 3 	
			int smallest;
			if (eggsAmount <= milkAmount && milkAmount <= eggsAmount) {
				smallest = eggsAmount;
			} else if (milkAmount <= flourAmount && milkAmount<= eggsAmount) {
				smallest = milkAmount; 
			} else { 
				smallest = flourAmount;
			}
				
				System.out.println(" "); // every portion is 4 blins
				System.out.println("you can make " + smallest*4 +  " portions of blins");
				System.out.println(" ");
				System.out.println("you will need " + smallest*eggsMin + " eggs");
				System.out.println("you will need " + smallest*milkMin + " ml of milk");
				System.out.println("you will need " + smallest*flourMin + " g of flour");
				System.out.println(" ");
				System.out.println("blinmaker is shutting down");
				
				
						
			}
		}
	}


