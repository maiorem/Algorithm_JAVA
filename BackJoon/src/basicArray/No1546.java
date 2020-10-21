package basicArray;

import java.util.Scanner;
import java.util.StringTokenizer;

public class No1546 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int numOfSubject=Integer.parseInt(sc.nextLine());
		StringTokenizer st=new StringTokenizer(sc.nextLine(), " ");;
		float[] scoresOfSubject=new float[numOfSubject];
		float max=0;
		
		for (int i=0; i<numOfSubject; i++) {
			
			scoresOfSubject[i]=Float.parseFloat(st.nextToken());
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
		
		float newAvOfScore=newSumOfScore/numOfSubject;
		
		System.out.println(newAvOfScore);
		
	}

}
