package skillLevel1;
//통과
/*
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 */
public class Integer2 {
	public int solution(int n) {
		int answer = 0;

		for(int i=1; i<=n; i*=10) {
			answer=answer+((n%(i*10))/i);
		}

		return answer;
	}
}
