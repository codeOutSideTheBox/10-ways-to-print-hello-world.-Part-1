package helloWorld4;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class helloWorld4 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner (System.in);
		String answer = "";
		int keepTrack = 0;// is used to keep track of the number of times the user says no
		
		System.out.println("Do you want to see me print 'Hello World'");
		System.out.println("type in (yes or no)");
		answer = sc.nextLine();
		
		while (!(answer.equalsIgnoreCase("yes"))) {
			
			if(!(answer.equalsIgnoreCase("yes"))&& keepTrack == 0) {
				
				System.out.println("OK let me ask you one more time \n"
						+ "Because i don't want you to miss out on this amazing opportunit.");
				System.out.println("type in (yes or no)");
				answer = sc.nextLine();
				keepTrack = 1;
				
			}else if (!(answer.equalsIgnoreCase("yes"))&& keepTrack == 1) {
				
				System.out.println("But why not, you need to see this it will be amazing");
				System.out.println("type in (yes or no)");
				answer = sc.nextLine();
				keepTrack = 2;
				
			}else if (!(answer.equalsIgnoreCase("yes"))&& keepTrack == 2) {
				
				System.out.println("just say yes so we can both get on with are lives.");
				System.out.println("type (yes or no) ");
			    answer = sc.nextLine();
			}else {
				
				answer = "yes";
			}
			
		}// end of loop
		System.out.println("Hello World");
		
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("See I told you it would be cool!");
		
	}

}
