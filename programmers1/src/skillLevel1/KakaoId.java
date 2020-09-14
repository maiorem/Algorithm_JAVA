package skillLevel1;

public class KakaoId {

	public static void main(String[] args) {

		String new_id="...!@BaT#*..y.abcdefghijklm";
		System.out.println(solution(new_id));


	}

	public static String solution(String new_id) {
		String answer = "";
		answer=new_id.toLowerCase();

		for(int i=0; i<answer.length(); i++) {
			if(!(('0'<=answer.charAt(i) && answer.charAt(i)<='9') || ('a'<=answer.charAt(i) && answer.charAt(i)<='z') || 
					(answer.charAt(i)=='-') || (answer.charAt(i)=='_') || (answer.charAt(i)=='.'))) {
				answer=answer.replace(answer.charAt(i), ' ');
			}
			
		}
		
		for(int i=0; i<answer.length(); i++) {
			answer=answer.replace("..", ".");
		}
		
		if(answer.charAt(0)=='.') {
			answer=answer.replace(answer.charAt(0), ' ');
		}
		
		
		
		
		
		return answer;
	}

}
