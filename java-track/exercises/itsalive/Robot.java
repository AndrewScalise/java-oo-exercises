package itsalive;

public class Robot {
	
	//Fields
	private String name;
	private int x;
	private int y;
	private int speed;
	private String orientation;
	
	//Constructor
	public Robot(String name, int x, int y, int speed, String orientation){
		this.name = name;
		this.speed = speed;
		this.orientation = orientation;
		this.x = x;
		this.y = y;
	}
	
	//Getters
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public String getOrientation(){
		return this.orientation;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
	//Make the robot move
	public void move(){
		if(this.orientation == "North"){
			this.y += this.speed; 
		}
		else if(this.orientation == "South"){
			this.y -= this.speed;
		}
		else if(this.orientation == "East"){
			this.x += this.speed;
		}
		else{
			this.x -= this.speed;
		}
	}
	
	public void rotate(String LR){
		if(this.orientation == "North"){
			if(LR == "left"){
				this.orientation = "West";
			}
			else{
				this.orientation = "East";
			}
		}
		else if(this.orientation == "East"){
			if(LR == "left"){
				this.orientation = "North";
			}
			else{
				this.orientation = "South";
			}
		}
		else if(this.orientation == "South"){
			if(LR == "left"){
				this.orientation = "North";
			}
			else{
				this.orientation = "West";
			}
		}
		else if(this.orientation == "West")
		{
			if(LR == "left"){
				this.orientation = "South";
			}
			else{
				this.orientation = "North";
			}
		}
	}
	
	public double distance(Robot b){
		return Math.sqrt(Math.pow((b.x - this.x),2) + Math.pow((b.y - this.y), 2));
	}
	
	public String toString(){
		return "Name: " + this.name + " Position: " +this.x + "," + this.y + " Speed: " + this.speed + " Orientation: " + this.orientation;
	}
	
	public static void main(String args[]){
		Robot one = new Robot("R2D2", 10, 10, 3, "South");
		Robot two = new Robot("R4", 3, 2, 1, "North");
		
		System.out.println(one.toString());
		System.out.println(two.toString());
		one.move();
		two.move();
		one.rotate("right");
		two.rotate("right");
		System.out.println();
		System.out.println(one.toString());
		System.out.println(two.toString());
		System.out.println();
		System.out.println(one.distance(two));
	}
	
}
