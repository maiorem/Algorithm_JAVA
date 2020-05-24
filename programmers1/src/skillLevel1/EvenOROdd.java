package skillLevel1;
//통과
public class EvenOROdd {
	public String solution(int num) {
		String answer = "";
		if(num%2==0) {
			answer="Even";
		} else {
			answer="Odd";
		}
		return answer;
	}
}
