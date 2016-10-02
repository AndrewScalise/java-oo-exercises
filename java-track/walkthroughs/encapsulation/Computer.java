package encapsulation;

public class Computer {
	
	//Fields
	
	private int memory;
	private double size;
	private double processor;
	private String brand;
	
	//Behaviors
	
	//Create a computer
	public Computer(int memory, double size, double processor, String brand)
	{
		this.memory = memory;
		this.size = size;
		this.processor = processor;
		this.brand = brand;
	}

	public String getBrand()
	{
		return this.brand;
	}
	
	public double getSize(){
		return this.size;
	}
	
	public double getProcessor(){
		return this.processor;
	}
	
	public int getMemory(){
		return this.memory;
	}
	
	public void addMemory(int newMemory){
		if(this.memory + newMemory > 32)
		{
			return;
		}
		else
		{
			this.memory += newMemory;
		}
	}
	
	public void setProcessor(double newProcessor)
	{
		this.processor = newProcessor;
	}
	
	public String toString()
	{
		return "Memory: " + this.memory + " Processor: " + this.processor + " Size: " + this.size + " Brand: " + this.brand;
	}
	
	public static void main(String args[]){
		Computer myComputer = new Computer(8, 2.4, 15.5, "CyberPower");
		
		System.out.println(myComputer.getBrand());
		Computer yourComputer = new Computer(16, 3.8, 20, "PC");
		System.out.println(yourComputer.getBrand());
		yourComputer.addMemory(3);
		System.out.println(yourComputer.getMemory());
		System.out.println(myComputer);
	}
}
