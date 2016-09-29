package studio1;

public class Fraction {
	
	//Fields
	private int numerator;
	private int denominator;
	
	//Constructor
	public Fraction(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	//Behavior
	public String toString(){
		return "The Fraction is: " + this.numerator + "/" + this.denominator;
	}
	
	//find greatest common denominator
	public int gcd(int a, int b){
		if(b == 0)
			return a;
		return gcd(a, a%b);
	}
	
	//add fractions
	public Fraction add(Fraction b){
		int commonDenominator = b.denominator * denominator;
		return new Fraction(((denominator * b.numerator) + (b.denominator * numerator)), commonDenominator);
	}
	
	public Fraction multiply(Fraction b){
		return new Fraction((numerator*b.numerator), (b.denominator*denominator));
	}
	
	public Fraction reciprocal(){
		return new Fraction(denominator, numerator);
	}
	
	public Fraction simplify(){
		int greatest = gcd(numerator, denominator);
		return new Fraction(numerator/greatest, denominator/greatest);
	}
	
	public static void main(String args[]){
		
		Fraction one = new Fraction(5, 10);
		Fraction two = new Fraction(22, 33);
		System.out.println(one.simplify());
		System.out.println(one.reciprocal());
		System.out.println(one.add(two));
		System.out.println(two.toString());
		
	}

}
