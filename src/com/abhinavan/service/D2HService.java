package com.abhinavan.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D2HService {

	/*
	 * 1. View current balance in the account 2. Recharge Account 3. View available
	 * packs, channels and services 4. Subscribe to base packs 5. Add channels to an
	 * existing subscription 6. Subscribe to special services 7. View current
	 * subscription details 8. Update email and phone number for notifications 9.
	 * Exit
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		System.out.println(" ****************This is D2H Portal ***********************");
		System.out.println("1. View current balance in the account \n 2. Recharge Account "
				+ "\n 3. View available packs, channels and services"
				+ "\n 4. Subscribe to base packs \n 5. Add channels to an existing subscription"
				+ "\n 6. Subscribe to special services \n 7. View current subscription details"
				+ "\n 8. Update email and phone number for notifications \n 9. Exit");
		System.out.println(" ******************* Choose your option *********************");
		try {
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int choice=reader.read();
			
			switch(choice) {
			case 1:
				System.out.println("First");
				break;
			case 2:
				System.out.println("Second");
				break;
			case 3:
				System.out.println("Third");
				break;
			case 4:
				System.out.println("Fourth");
				break;
			case 5:
				System.out.println("Fifth");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seventh");
				break;
			case 8:
				System.out.println("Eighth");
				break;
			case 9:
				System.exit(0);
			default:
				System.out.println("No action");
			}
		} catch (Exception e) {
		} finally {
		}
	}
}
