package basicIO;

import java.util.Scanner;

public class No2445 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N=sc.nextInt();
		for(int i=0; i<N; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=2*N-2; j>2*i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=N-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			for(int j=2*i-1; j<2*N-1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
