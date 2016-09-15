/**
 * This class will handle generating random wheels, with 5 random points on that wheel.
 * NOTE: probably gonna end up swapping the random strings to enum at some point in the future
 * 
 */

/**
 * @author mikey
 *
 */
import java.util.Random;

public class RandomiseWheels {

	
	Random random = new Random();
	String[] wheel = new String[5];
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//used for testing this class alone
		//RandomiseWheels randomisedWheel = new RandomiseWheels();
		//randomisedWheel.generateWheel();
	}
	
	/**
	 * this method creates a wheel with 5 points
	 * and returns it to be checked inside another class
	 * @return	array of strings
	 */
	
	public String[] generateWheel(){
		for(int i = 0; i < wheel.length; i++){
			wheel[i] = generateSinglePoint();
		}			
		return wheel;
	}
	/**
	 * This method generates a single point on a wheel
	 * 0-6(inclusive 0, exclusive 6)
	 * @return a string of the case point type (Ace,King,etc).
	 */
	public String generateSinglePoint(){
		String Character="";
		switch(random.nextInt(5))
		{
		case 0:
			Character = "A";
			break;
		case 1:
			Character = "K";
			break;
		case 2:
			Character = "Q";
			break;
		case 3:
			Character = "J";
			break;
		case 4:
			Character = "T";
			break;
		case 5:
			Character = "N";
			break;
		}		
		return Character;
	}
	
	
	
	
}


