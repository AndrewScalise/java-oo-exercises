package studio1;

public class Rectangle {

	//Fields
	private int width;
	private int length;
	
	//constructor
	public Rectangle(int width, int length){
		this.width = width;
		this.length = length;
	}
	
	//behaviors
	//find area
	public int area(){
		return this.width*this.length;
	}
	
	//find perimeter
	public int perimeter(){
		return (this.width*2) + (this.length*2);
	}
	
	//indicate smaller rectangle
	public String smaller(Rectangle a, Rectangle b){
		if(a.area() > b.area()){
			return "The first one is larger than the second.";
		}
		else if(b.area() > a.area()){
			return "The first one is smaller than the second.";
		}
		else{
			return "They are the same.";
		}
	}
	
	//say if it is a square
	public String square(){
		if(this.length == this.width){
			return "It's a square!";
		}
		else{
			return "It's not a square.";
		}
	}
	
	//print information about rectangle
	public String toString(){
		return "Width: " + this.width + " Length: " + this.length;
	}
	
	public static void main(String args[]){
		Rectangle one = new Rectangle(4,5);
		Rectangle two = new Rectangle(5,5);
		
		System.out.println(one.toString());
		System.out.println(one.area());
		System.out.println(two.perimeter());
		System.out.println(one.smaller(one, two));
		System.out.println(two.square());
	}
}
