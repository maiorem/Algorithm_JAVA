package basicPs;

import java.util.Scanner;

public class No11720 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		String b = sc.nextLine();
		int answer = 0;
		for(int i=0; i<a; i++) {
			answer=answer+((int)(b.charAt(i))-48); 
		}
		
		System.out.println(answer);
		
	}

}
