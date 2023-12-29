import java.util.ArrayList;
import java.util.Random;

class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
		char randomLetter = generator.getRandomLetter();
		System.out.println(randomLetter);

		String password= generator.generatePassword();;
		System.out.println("password: "+password);

		String[] password2= generator.getNewPasswordSet(7);;
		for(int i=0; i<password2.length; i++){
			System.out.println("password2["+i+"]: "+ password2[i]);
		}
		
    	        //..
		// Write your other test cases here.
		//..
	}
}
