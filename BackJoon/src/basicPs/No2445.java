package basicPs;

import java.util.Scanner;

public class No2445 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N=sc.nextInt();
		int t=1;

		for(int i=1; i<=2*N-1; i++) {
			if(i<N) {
				for(int j=1; j<=2*N-1; j++) {
					if(j>=t+1 && j<=2*N-1-t) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}

				}System.out.println();
				t++;
				
			}  else {
				for(int j=1; j<=2*N-1; j++) {
					if(j>=t+1 && j<=2*N-1-t) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}

				}
				System.out.println();
				t--;
			}

		}
	}

}
