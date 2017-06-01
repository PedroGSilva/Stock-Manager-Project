package io.altar.jseproject.model;

import static java.lang.System.in;

import java.util.Scanner;

public class Utils {
	
	//Validate Long
		public static long validateLong(){
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(in);
			while(!scan.hasNextLong()){
				System.out.println("Inserir input válido");
				scan.next();
			}
			Long consultID = scan.nextLong();
			return consultID;
		}
		
		//Validate Double
		public static double validateDouble(){
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(in);
			while(!scan.hasNextDouble()){
				System.out.println("Inserir input válido");
				scan.next();
			}
			double newDouble = scan.nextDouble();
			return newDouble;
		}
		
		//Validate Int
		public static int validateInt(){
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(in);
			while(!scan.hasNextInt()){
				System.out.println("Inserir input válido");
				scan.next();
			}
			int newInt = scan.nextInt();
			return newInt;
		}
}
