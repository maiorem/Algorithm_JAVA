package dataStructure;

import java.util.Scanner;
import java.util.Stack;

public class No10828_2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<n; i++) {
			String str=sc.next();
			if(str.equals("push")) {
				int x=Integer.parseInt(sc.next());
				stack.push(x);

			} else if (str.equals("pop")) {
				if (stack.size()!=0) {
					System.out.println(stack.pop());
				} else {
					System.out.println(-1);
				}
			} else if (str.equals("size")) {
				System.out.println(stack.size());
				continue;
			} else if (str.equals("empty")) {
				if(stack.empty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}

			} else if (str.equals("top")) {
				if (stack.size()==0) {
					System.out.println(-1);
				} else {
					System.out.println(stack.peek());
				}
			}
		}

	}

}
