package skillLevel1;

import java.util.Scanner;

/*
 * 배열 arr[]의 요소에서 최소값을 뺀 배열 answer[]를 반환하는 메서드를 만들어라.
 * 단 arr[]의 요소에 비교할 값이 없다면(요소가 하나 뿐이라면) answer의 요소값에는 -1만 들어간다.
 * 
 */
public class Array1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr = new int[5];
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		if (arr.length<=1) {
			for (int i=0; i<arr.length; i++) {
				System.out.println(solution(arr)[i]);
			}
		} else {
			for (int i=0; i<arr.length-1; i++) {
				System.out.println(solution(arr)[i]);
			}
		}
	
	}	
	
	public static int[] solution(int[] arr) {
		int[] answer = {};		
		if(arr.length<2) {
			answer = new int[arr.length];
			answer[0]=-1;
		} else {
			answer = new int[arr.length-1];
			int min=arr[0];
			for(int i=0; i<arr.length; i++) {
				if(min>arr[i]) {
					min=arr[i];
				} 				
			}
			for(int i=0; i<arr.length;i++) {
				if(arr[i]==min) {
					arr[i]=arr[i+1];
				} 
				answer[i]=arr[i];
			}

		}
						
		return answer;
	}

}
