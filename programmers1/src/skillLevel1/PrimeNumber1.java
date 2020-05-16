package skillLevel1;
/*
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)
 */
public class PrimeNumber1 {

	public static void main(String[] args) {
		System.out.println(solution(10));

	}


	public static int solution(int n) {
		int answer = 0;

		for (int i=2; i<=n; i++) {
			for (int j=2; j<=i; j++) {
				if(i!=j&&i%j==0) {
					continue;
				} 
				answer++;
			}
			
			
		}
		return answer;
	}

}
