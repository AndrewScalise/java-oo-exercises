package studio1;

public class baseball {
	
	//fields
	private String name;
	private String stance;
	private int jersey;
	private int hits;
	private int rbi;
	private int games;
	
	
	//constructor
	public baseball(String name, String stance, int jersey){
		this.name = name;
		this.stance = stance;
		this.jersey = jersey;
		this.hits = 0;
		this.rbi = 0;
		this.games = 0;
	}
	
	public void gameover(int hits, int rbi, int games){
		this.games += games;
		this.hits += hits;
		this.rbi += rbi;
	}
	
	public String toString(){
		return "Name: " +this.name+ " Jersey: " +this.jersey+ " Stance: " +this.stance+ "\n"
				+"Hits: " +this.hits+ " RBI's: " +this.rbi+ " Games played: " +this.games;
	}
	
	public static void main(String args[]){
		baseball player = new baseball("Diaz", "Right", 99);
		player.gameover(3, 4, 2);
		System.out.println(player.toString())
	}
}
