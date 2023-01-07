package com.bridgelabz;

public class SnakeLadder {

	final static int OPTION_NO_PLAY = 0;
	final static int OPTION_SNAKE = 1;
	final static int OPTION_LADDER = 2;

	public static void main(String[] args) {
		
		int position = 0;
		System.out.println("The starting position of the player is :" +position);
		
		int dieRollNum = (int)((Math.random() *10) % 6 + 1);
		System.out.println("the die show " +dieRollNum);
		
		int dice_roll = (int) (Math.random() * 6 + 1);
        System.out.println("Dice Rolled: " +dice_roll);
        System.out.println("Dice Rolled: " +dice_roll);
        int Step_Count = 0;
        int options = (int) (Math.random() * 3 + 1);
        System.out.println("option is " +options);

        if (options == 1) {
            System.out.println("No Play");
            Step_Count = Step_Count;
        } else if (options == 2) {
            System.out.println("There is Ladder");
            Step_Count += dice_roll;
        } else if (options == 3) {
            System.out.println("There is Snake");
            Step_Count -= dice_roll;
        } else {
            System.out.println("Roll dice again");
        }
    }
}