package basicPs;

import java.util.Scanner;
import java.util.StringTokenizer;

public class No10953 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T=Integer.parseInt(sc.nextLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder(); 
		
		for (int i=0; i<T; i++) {
						
			st = new StringTokenizer(sc.nextLine(), ",");
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
			sb.append("\n");
					
		}
		
		System.out.println(sb);
		

	}

}
