package itsalive;

import java.util.ArrayList;
import java.util.Scanner;

public class RobotMenu {

	private ArrayList<Robot> robots;
	private Scanner in;
	
	public static void main(String[] args){
		int x = 0;
		RobotMenu rm = new RobotMenu();
		do{
			x = rm.startMenu();
			rm.processInput(x);
		} while(x!=6);
	}
	
	public RobotMenu()
	{
		in = new Scanner(System.in);
		robots = new ArrayList<Robot>();
	}
	
	public int startMenu(){
		System.out.println("Welcome to the Robot menu!");
		System.out.println("1. Create a robot");
		System.out.println("2. Display all the available robots");
		System.out.println("3. Move a robot");
		System.out.println("4. Rotate a robot");
		System.out.println("5. Compute the distance between two robots");
		System.out.println("6. Exit");
		System.out.println("Please select an option: ");
		int selection = in.nextInt();
		while(selection < 0 || selection > 6){
			System.out.println("Invalid selection, please try again: ");
			selection = in.nextInt();
		}
		return selection;
	}
	
	public void processInput(int selection){
		if(selection == 1){
			createRobot();
		}
		else if(selection == 2){
			displayRobots();
		}
		else if(selection == 3){
			displayRobots();
			Robot r = selectRobot();
			System.out.println("Please enter a speed for the robot: ");
			int rSpeed = in.nextInt();
			while(rSpeed < 1){
				System.out.println("Invalid value. Please enter a positive integer: ");
				rSpeed = in.nextInt();
			}
			r.setSpeed(rSpeed);
			r.move();
			System.out.println("Here is the robot's status after it moves: ");
			System.out.println(r);
		}
		else if(selection == 4){
			displayRobots();
			Robot r = selectRobot();
			System.out.println("Move robot left or right?: ");
			String rotate = in.next();
			while(!rotate.equals("left") || !rotate.equals("right")){
				System.out.println("Invalid input. please enter left or right: ");
				rotate = in.next();
			}
			r.rotate(rotate);
			System.out.println("Here is what the robot looks like after rotating");
			System.out.println(r);
		}
		else if(selection == 5){
			displayRobots();
			Robot r = selectRobot();
			System.out.println("Select another robot to compare");
			displayRobots();
			Robot r2 = selectRobot();
			r.distance(r2);
			System.out.println("Here is the distance between the two robots: " + r.distance(r2));
		}
	}
	
	private void displayRobots(){
		for(int i = 0; i < robots.size(); i++){
			System.out.println((i+1) + ".)" + robots.get(i));
		}
	}
	
	private Robot selectRobot(){
		System.out.println("Please select a robot: ");
		int selection = in.nextInt();
		while(selection < 1 || selection > robots.size()){
			System.out.println("Invalid selection, please try again: ");
			selection = in.nextInt();
		}
		return robots.get(selection-1);
	}
	
	private void createRobot(){
		System.out.println("Please enter the name that the robot has");
		String name = in.next();
		
		System.out.println("Please enter the x position: ");
		int x = in.nextInt();
		
		System.out.println("Please enter the y position: ");
		int y = in.nextInt();
		
		System.out.println("Please enter the speed of the robot: ");
		int speed = in.nextInt();
		while(speed < 0){
			System.out.println("Please enter a speed greater than 0: ");
			speed = in.nextInt();
		}
		
		System.out.println("Please enter the orientation of the robot: (North, East, South, West) ");
		String orientation = in.next();
		
		robots.add(new Robot(name, x, y, speed, orientation));
	}
}
