package basicIO;

import java.util.Scanner;

public class No10992 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();

		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N-i; ++j) {
				System.out.print(" ");
			}
			if(i==1 || i==N) {
				for(int j=1; j<=(i-1)*2+1; j++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				for(int j=1; j<=(i-1)*2-1; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
