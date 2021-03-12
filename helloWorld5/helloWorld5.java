package helloWorld5;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class helloWorld5 {
	
	public static void main(String[] args) {
		
		String H = "Hello World";
		String encryptedH = "";
		int key = 0;
		
		
		Random r = new Random();// used so that ever time you run the program the encryption will be different
		                       
		key = r.nextInt(11);// used to randomly generate a number in between 0 and 10. and that number will be the key
		
		System.out.println("Hello world is being encrypted" + key);
		
		char [] charA = H.toCharArray();
		
		for(char c : charA) { // for loop used to encrypted the word hello world using the ASCII table
			                  // so for ex if the key was set to 5 and the first letter is H which is 72 on the ASCII table then that 
			                  // letter will be changed to M which is 77 on the ASCII table. because it adds 5 
			c += key;
			System.out.print(c);
			encryptedH = encryptedH + c;
			
			try {
				TimeUnit.MILLISECONDS.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}// end of for loop
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Hello world is now being decrypted");
		
		char [] charA2 = encryptedH.toCharArray();
		
		for (char c : charA2) { // This second for loop is used to decrypt the word in reverse 
			
			c -= key;
			System.out.print(c);
			
			try {
				TimeUnit.MILLISECONDS.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}// end of for loop
		
		
	}

}
