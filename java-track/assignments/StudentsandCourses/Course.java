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
		if(this.remainingSeats == 0){
			return false;
		}
		for (int i = 0; i < studentRoster.length; i++){
			if(studentRoster[i] == null){
				studentRoster[i] = x;
				this.remainingSeats -= 1;
				return true;
			}
			else if(studentRoster[i].getName().equals(x.getName())){
				return false;
			}
		}
		return false;
	}
	
	
	//average gpa of entire class
	public double averageGPA(){
		int roster = this.seats - this.remainingSeats;
		double gpaTotal = 0.0;
		for(int i = 0; i < studentRoster.length; i++){
			if(studentRoster[i] != null){
				gpaTotal += this.studentRoster[i].getGPA();
			}
			else{
				return (gpaTotal/roster);
			}
		}
		
		return (gpaTotal/roster);
	}
	
	//generate roster
	public String generateRoster(){
		for(int i = 0; i < studentRoster.length - 1; i++){
			if(studentRoster[i] != null){
				return studentRoster[i].toString();
			}
		}
		return "";
	}
	
	//to string
	public String toString(){
		return "Course #: " + this.name + " Credits: " + this.credits;
	}
}
