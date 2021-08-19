
public class SnakeAndLadderCode {

	public static void main(String[] args) {
		//intialize position and player
		int Player_No = 1;
		int position = 0;
		int MinDie=1; // to implement random function
		int MaxDie=6;
		
		int die = (int) Math.floor(Math.random()*(MaxDie-MinDie+1)+MinDie);
		
		System.out.println("Welcome to Snake & Ladder");
		System.out.println(" No. of players: " + Player_No);
		System.out.println(" Initial Position: " + position);
		System.out.println(" The value of the die: " + die);
		
	}
}
