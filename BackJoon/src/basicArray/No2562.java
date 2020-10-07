package basicArray;

import java.util.Scanner;

public class No2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=1;
		int[] arr= new int[9];
		
		for (int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		
		int max=arr[0];
		for(int j=0; j<arr.length; j++) {
			
			
			if(max < arr[j]) {
				max=arr[j];
				count=j+1;
			}
		}
		
		System.out.println(max);
		System.out.println(count);

	}
}


