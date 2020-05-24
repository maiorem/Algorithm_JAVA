package skillLevel1;
//통과
public class Array3 {

	public static long[] solution(int x, int n) {
		long[] answer = {};
		answer=new long[n];
		long result=0;
		for(int i=0; i<n; i++) {
			result=result+x;
			answer[i]=result;
		}
		return answer;
	}


}
