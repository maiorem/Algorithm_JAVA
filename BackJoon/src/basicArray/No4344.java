package basicArray;

import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class No4344 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.nextLine());
		int[] score;
		StringTokenizer st;
		
		for (int i=0; i<num; i++) {
			score=new int[num];
			st=new StringTokenizer(sc.nextLine(), " ");
			score[i]=Integer.parseInt(st.nextToken());
		}
		
	}

}
