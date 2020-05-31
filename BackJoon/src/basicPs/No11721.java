package basicPs;

import java.util.Scanner;

public class No11721 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		int len = a.length();
		
		for(int i=0; i<len; i++) {
			
			if (i%10==0 && i!=0) {
				System.out.println();
			} 
			System.out.print(a.charAt(i));
			
			
		}
		
		
	}

}
