package skillLevel1;
import java.util.*;

public class NoSameNumber {

	public static void main(String[] args) {
		int[] arr= {1,1,1,2,2,3,3,4};
		solution(arr);

		for(int e: arr) {
			System.out.println(arr[e]);
		}

	}


	public static int[] solution(int []arr) {
		int[] answer = {};
		int size=arr.length;
		
		for(int i=0; i<arr.length-1; i++) {
			answer= new int[size];
			for(int j=0; j<size; j++) {
				
				if(arr[i]==arr[i+1]) {
					size--;
				} else {

					answer[j]=arr[i];
				}
			}

		}
		if(arr[arr.length-2]!=arr[arr.length-1]) {
			answer[size-1]=arr[arr.length-1];
		}

		return answer;
	}
}


