package basicArray;

import java.util.Scanner;

public class No1546 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int numOfSubject=Integer.parseInt(sc.nextLine());
		float[] scoresOfSubject=new float[numOfSubject];
		float max=0;
		
		for (int i=0; i<numOfSubject; i++) {
			scoresOfSubject[i]=Float.parseFloat(sc.nextLine());
			if (max<scoresOfSubject[i]) {
				max=scoresOfSubject[i];
			}
		}
		
		
		float[] newScoreOfSubject=new float[numOfSubject];
		float newSumOfScore=0;
		
		for (int i=0; i<numOfSubject; i++) {
			newScoreOfSubject[i]=scoresOfSubject[i]/max*100;
			if (newScoreOfSubject[i]>100) {
				newScoreOfSubject[i]=100;
			}
			newSumOfScore=newSumOfScore+newScoreOfSubject[i];	
		}
		
		float newAvOfScore=newSumOfScore/3;
		
		System.out.println(newAvOfScore);
		
	}

}
