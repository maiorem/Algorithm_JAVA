package dataStructure;

import java.util.Scanner;

public class No10828 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int[] stack=new int[n];
		int size=0;

		while(n-->0) {

			String str=sc.next();

			if(str.equals("push")) {
				int x=Integer.parseInt(sc.next());
				stack[size++]=x;

			} else if (str.equals("pop")) {
				if (size!=0) {
					System.out.println(stack[size-1]);
					size-=1;
				} else {
					System.out.println(-1);
				}
			} else if (str.equals("size")) {
				System.out.println(size);
				continue;
			} else if (str.equals("empty")) {
				if(size==0) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}

			} else if (str.equals("top")) {
				if (size==0) {
					System.out.println(-1);
				} else {
					System.out.println(stack[size-1]);
				}
			}

		}

	}

}
