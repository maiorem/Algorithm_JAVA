package basicIO;
/*
 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
별은 가운데를 기준으로 대칭이어야 한다.
 */
import java.util.Scanner;

public class No2442 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		
		for(int i=N; i>0; i--) {
			for(int j=0; j<i-1; j++) {
				System.out.print(" ");
			}

			for(int k=2*i-1; k<2*N; k++) {
				System.out.print("*");
			}
 
			System.out.println();
			
		}
		
	}

}
