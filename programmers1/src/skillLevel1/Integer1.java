package skillLevel1;

/*
두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
 */

public class Integer1 {

	public static void main(String[] args) {
		Solutione sol = new Solutione();


		System.out.println(sol.solution(3, 5));

	}

}


class Solutione {
	public long solution(int a, int b) {
		long answer = 0;

		if (a<b) {
			for(int i=0;a+i<=b;i++) {
				answer=answer+(a+i);
			}

		} else if (b<a) {
			for(int i=0;b+i<=a;i++) {
				answer=answer+(b+i);
			}
		} else {
			answer=a;

		}
		return answer;
	}
}