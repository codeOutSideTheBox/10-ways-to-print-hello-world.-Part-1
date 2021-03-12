package helloWorld3;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class helloWorld3 {
	
	public static void main(String[] args){
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz ";
		String H = "hello world";
		String newWord = "";
		char letter;
		Random r = new Random();
		
		
		
		for(int i =0; i < H.length();) {
			// the line below is used to randomly generate a letter . 
			letter = (alphabet.charAt(r.nextInt(alphabet.length()))); 
			
			System.out.println(letter);
			
			if(letter == H.charAt(i)) {// if letter is equal to a letter in the word "hello word"
				
				i++;
				System.out.println("found " + letter);
				newWord = newWord + letter; //  then it will store that letter in to newWord 
				
			}
			
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}// end of loop
		
		System.out.println(newWord);// then it prints the newWord wants all the letter have been found
		System.out.println("you have successfuly printed hello world");
		
		
	}

}
