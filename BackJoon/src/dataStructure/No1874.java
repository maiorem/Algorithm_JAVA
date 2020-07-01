package dataStructure;

import java.util.Scanner;
import java.util.Stack;

public class No1874 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			Stack<Integer> stack=new Stack<>();
			
			int popInt=sc.nextInt();
			
			
			for(int j=1; j<=popInt; j++) {
				stack.push(j);
				System.out.println("+");
				
			}
			stack.pop();
			System.out.println("-");
			
		}
		
	}

}
