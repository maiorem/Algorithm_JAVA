package basicArray;

import java.util.Scanner;

public class No2577 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        
		int A=Integer.parseInt(sc.nextLine());
		int B=Integer.parseInt(sc.nextLine());
		int C=Integer.parseInt(sc.nextLine());
		
		int result=A*B*C;
		int[] count=new int[10];
		
		while (result>0) {
			count[result%10]=count[result%10]+1;
			result=result/10;
		}

		
		for (int i=0; i<count.length; i++) {
			System.out.println(count[i]);
		}

	}

}
