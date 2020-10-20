package basicArray;

import java.util.Scanner;

public class No3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[10];
		int count=0;

		
		for (int i=0; i<10; i++) {
			arr[i]=Integer.parseInt(sc.nextLine())%42;
		}
		
		
		for (int i=0; i<10; i++) {
			int duple=0;
			for (int j=i+1; j<10; j++) {
				if (arr[i]==arr[j]) {
					duple++;
				}
			}
			if (duple==0) {
				count++;
			}
		}
		
		System.out.println(count);
		

	}

}
