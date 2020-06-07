package basicIO;

import java.util.Scanner;

public class No2446 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0; i<N; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=2*N-1; j>2*i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=N-1; i>0; i--) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=2*i-1; j<2*N; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
