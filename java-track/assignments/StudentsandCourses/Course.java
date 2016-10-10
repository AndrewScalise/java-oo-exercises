package StudentsandCourses;

public class Course {

	//Fields
	private String name;
	private int credits;
	private int seats;
	private int remainingSeats;
	private Student[] studentRoster;
	
	//Constructor
	public Course(String name, int credits, int seats){
		this.name = name;
		this.credits = credits;
		this.seats = seats;
		this.remainingSeats = seats;
		this.studentRoster = new Student[seats];
	}
	
	//Behaviors
	
	public String getName(){
		return this.name;
	}
	
	public int getCredits(){
		return this.credits;
	}
	
	public int getRemainingSeats(){
		return this.remainingSeats;
	}
	
	
	//add student to roster
	public boolean addStudent(Student x){
		int roster = this.seats - this.remainingSeats;
		if(roster == 0){
			this.remainingSeats -= 1;
			return true;
		}
		else{
			for(int i = 0; i < roster; i++){
				Student a = this.studentRoster[i];
				if(a.getName().equals(x.getName())){
					return false;
				}
			}
		}
	}
	
	//generate roster
	public String generateRoster(){
		int roster = this.seats - this.remainingSeats;
		for(int i = 0; i < roster; i++){
			String student = this.studentRoster[i].toString();
			return student;
		}
		return "";
	}
	
	public double averageGPA(){
		int roster = this.seats - this.remainingSeats;
		double gpaTotal = 0.0;
		for(int i = 0; i < roster; i++){
			gpaTotal += this.studentRoster[i].getGPA();
		}
		
		return (gpaTotal/roster);
	}
	
	//to string
	public String toString(){
		return "Course #: " + this.name + " Credits: " + this.credits;
	}
}
