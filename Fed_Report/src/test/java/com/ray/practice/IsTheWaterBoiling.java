package com.ray.practice;

import java.util.Scanner;

public class IsTheWaterBoiling {

	public static void main(String[] args) {
		
		System.out.println("Input temperature:");
		
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		
		if (temp>=100) {
			System.out.println("Water is boiling");
		} else {
			System.out.println("Water is not boiling yet");
			
		}
	}
	
}
