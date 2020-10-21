package basicArray;

import java.util.Scanner;

public class No1546 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int numOfSubject=Integer.parseInt(sc.nextLine());
		int sumOfScore=0;
		int[] scoresOfSubject=new int[numOfSubject];
		
		for (int i=0; i<numOfSubject; i++) {
			scoresOfSubject[i]=Integer.parseInt(sc.nextLine());
			sumOfScore=sumOfScore+scoresOfSubject[i];
		}
		
		int avOfScore=sumOfScore/3;
		int[] newScoreOfSubject=new int[numOfSubject];
		int newSumOfScore=0;
		
		for (int i=0; i<numOfSubject; i++) {
			newScoreOfSubject[i]=scoresOfSubject[i]/avOfScore*100;
			newSumOfScore=newSumOfScore+newScoreOfSubject[i];	
		}
		
		int newAvOfScore=newSumOfScore/3;
		
		System.out.println(newAvOfScore);
		
	}

}
