package basicIO;

import java.util.Scanner;
import java.util.StringTokenizer;

public class No10818 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N=Integer.parseInt(sc.nextLine());
		
		int[] arr=new int[N];
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		
		for(int i=0; i<N; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if (min > arr[i]) {
				min=arr[i];
			}
		}
		int max=arr[0];
		for(int j=0; j<arr.length; j++) {
			if(max < arr[j]) {
				max=arr[j];
			}
		}
		
		System.out.println(min+" "+max);

	}

}
