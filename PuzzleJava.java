import java.util.ArrayList;
import java.util.Random;

class PuzzleJava {

    public ArrayList<Integer> getTenRolls() {
        Integer min = 1; 
        Integer max= 20 ;
        Random randMachine = new Random();
        ArrayList<Integer> array= new ArrayList<Integer>();
        
        for( int i=0 ; i<10; i++){
            array.add(randMachine.nextInt(max-min)+min);
        }
        return array;
    }

    public char getRandomLetter() {
        Random randMachine = new Random();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int index= randMachine.nextInt(25);
        return alphabet[index];
    }

    public String generatePassword() {
        String password= new String();
		for (int i=0; i<8;i++){
			char randLetter = getRandomLetter();
			password= password+randLetter;
		}
		return password;
    }

    public String[] getNewPasswordSet(int length) {
        System.out.println("length: "+ length);
        String[] password= new String[length];
		for (int i=0; i<length;i++){
            String passwordele= generatePassword();
			password[i]=passwordele; 
		}
		return password;
    }


}