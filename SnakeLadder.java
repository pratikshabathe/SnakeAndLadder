package com.bridgelabz;

public class SnakeLadder {

	public static void main(String[] args) {
		
		System.out.println("Starting of snake and ladder game");
		
		int position = 0;
		System.out.println("The starting position of the player is : " +position);
		
		int dieRollNum = (int)((Math.random() *10) % 6 + 1);
		System.out.println("the die rolled: " +dieRollNum);
	}
}
