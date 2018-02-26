package com.ray.practice;

import java.util.Scanner;

public class CelciusToFarenheit {

	public static void main(String[] args) {
		
		System.out.println("Type in celcius value below and hit enter:");
		Scanner sc = new Scanner(System.in);
		double celcius = sc.nextDouble();
		double farenheit = 9.0 / 5.0 * celcius + 32.0;
		System.out.println("Farenheit: " + farenheit);
		
		
		// Scanner utility resides inside java.util package, 
		// thats why we imported it so that we don't have to write java.util.Scanner
		// now that we have imported the class above, every time we mention 'Scanner'
		// java will know which scanner we are talking about
		
		
	}

}
