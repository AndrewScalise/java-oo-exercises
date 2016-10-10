package StudentsandCourses;

public class Student {
	
	//Fields
	private String firstName;
	private String lastName;
	private int id;
	private int credits;
	private double gpa;
	private double gpaTotal;
	
	//Constructor1
	public Student(String firstName, String lastName, int id){
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	//constructor2
	public Student(String firstName, String lastName, int id, int credits, double gpa){
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.credits = credits;
		this.gpa = gpa;
	}
	
	//getters
	public String getName(){
		return this.firstName + " " + this.lastName;
	}
	
	public int getStudentID(){
		return this.id;
	}
	
	public double getGPA(){
		return (double)(Math.round(this.gpa * 1000))/1000.0;
	}
	
	public int getCredits(){
		return this.credits;
	}
	
	//Behaviors
	public String getClassStanding(){
		if(this.credits < 30){
			return "Freshman";
		}
		else if(this.credits >= 30 && this.credits < 60){
			return "Sophomore";
		}
		else if(this.credits >= 60 && this.credits <90){
			return "Junior";
		}
		else{
			return "Senior";
		}
		
	}
	
	//Get grade from user
	public void submitGrade(double grade, int credits){
		this.credits += credits;
		gpaTotal += (grade * credits);
		this.gpa = this.gpaTotal/ this.credits;
		
	}
	
	//Compute tuition
	public double computeTuition(){
		double tuition;
		if(this.credits < 15){
			tuition = 1333.33 * this.credits;
			return tuition;
		}
		else{
			tuition = 20000 + ((this.credits-15) * 1333.33);
			return tuition;
		}
	}
	
	//Legacy
	public Student createLegacy(Student a, Student b){
		//give name
		String firstName = a.firstName + " " + a.lastName;
		String lastName = b.firstName + " " + b.lastName;
		
		//assign id
		int ID = (b.id + a.id);
		
		//estimated gpa
		double gpa = (a.gpa+b.gpa)/2;
		
		//estimated credits
		int credits = a.maximumCredits(b);
		
		return new Student(firstName, lastName, ID, credits, gpa);
	}
	
	//maximum credits comparison
	public int maximumCredits(Student x){
		if(this.credits > x.credits){
			return this.credits;
		}
		else{
			return x.credits;
		}
	}
	
	public String toString(){
		return "Student Name: " + this.firstName + " " +this.lastName + " Student ID: " + this.id;
	}
	
}
