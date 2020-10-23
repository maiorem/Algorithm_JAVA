package basicArray;

import java.util.Scanner;

public class No8958 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int num=Integer.parseInt(sc.nextLine());
		int[] scoreSum=new int[num];
		
		for (int i=0; i<num; i++) {
			int score=0;
			String testCase=sc.nextLine();
			for (int j=0; j<testCase.length(); j++) {
				
				if (testCase.charAt(j) == 'O') {
					score++;
					scoreSum[i]+=score;
				} else {
					score=0;
				}
			}
			
		}
		
		for (int i=0; i<num; i++) {
			System.out.println(scoreSum[i]);
		}
		
	}

}
