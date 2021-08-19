import java.util.Random;

public class SnakeAndLadderCode {
	
	public static final int No_Play = 1;
	public static final int Snake = 2;
	public static final int Ladder = 3;

	public static void main(String[] args) {
		//intialize position and player
		int Player_No = 1;
		int position = 0;
		int MinDie=1; // to implement random function
		int MaxDie=6;
		Random rand = new Random();
		
		System.out.println("Welcome to Snake & Ladder");
		System.out.println(" No. of players: " + Player_No);
		System.out.println(" Initial Position: " + position);
		
		while(position!=100) {
			int die = (int) Math.floor(Math.random()*(MaxDie-MinDie+1)+MinDie);
			System.out.println(" The value of the die: " + die);
			
			//Select random option from 1-3
					int option = rand.nextInt(3) + 1;
					
					switch(option) {
					case No_Play: {
						System.out.println("NO PLAY"); 
						break; }
					case Snake: {
						position=position-die;
						if(position<0) {
							position = 0;
						}
						System.out.println("SNAKE - Move back by "+die+" steps.");
						System.out.println("Final position :" +position);
						break; }
					case Ladder: {
							position=position+die;
							if(position<0) {
								position = 0;
							}
							System.out.println("LADDER! Move ahead by "+die+" steps.");
							System.out.println("Final position :" +position );
							break;
					}
					}// end of switch
				if(position>100) {
					position -= die;
					System.out.println("The Dice number is greater than 100. Go back to previous position. Final position :" +position);
				}//end of if
			
		}
		
	}
}
