package helloWorld2;

import java.util.concurrent.TimeUnit;

public class helloWorld2 {
	
public static void main(String[] args) {
	
		
		String H = "Hello World";
		
		char[] charArray = H.toCharArray();
		
		// just a simple for loop used to print out each letter
		for(int i = 0; i < H.length(); i++) {
			
			
			System.out.print(H.charAt(i));
			
			
			try {//  this is just used to control the speed of the for loop
				TimeUnit.MILLISECONDS.sleep(250);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
		
	}

}
