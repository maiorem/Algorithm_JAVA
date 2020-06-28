package dataStructure;

import java.util.Scanner;

public class No9012 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();

		
		for(int i=0; i<T; i++) {	
			System.out.println(valid(sc.next()));
		}
	}

	static String valid(String str) {

		int leng=str.length();
		int cnt=0;
		
		for(int i=0; i<leng; i++) {

			if(str.charAt(i)=='(') { //여는 괄호마다 카운트 추가
				cnt++;
			} else { //열어가는 도중 닫는 괄호를 발견하면 카운트 다운
				cnt--;
			}
			if(cnt<0) { //닫는 괄호가 먼저 시작될 수 없음
				return "NO";
			}

			
		}
		if(cnt==0) { // 괄호가 하나도 안남아있으면 YES
			return "YES";
		} else { //하나라도 남아있으면 No
			return "NO";
		}

	}

}
