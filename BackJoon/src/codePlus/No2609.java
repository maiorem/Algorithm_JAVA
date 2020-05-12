package codePlus;

import java.util.Scanner;

public class No2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;
		a=sc.nextInt();
		b=sc.nextInt();
		int maxresult=0;
		int minresult=0;

		for(int i=1; i<(a>b?a:b); i++) {
			if (a%i==0 && b%i==0) {
				maxresult=i;
			}
		}
		System.out.println(maxresult);

		for(int n=a*b; n>0; n--) {
			if (n%a==0 && n%b==0) {
				minresult=n;
			}
		}
		System.out.println(minresult);
	}

}

