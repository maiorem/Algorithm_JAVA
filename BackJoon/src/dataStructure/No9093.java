package dataStructure;


import java.io.*;
import java.util.Stack;

public class No9093 {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out)); //pop하여 꺼낸 문자를 저장하여 출력
		
		while(n>0) {
			String str=br.readLine()+"\n";
			Stack<Character> stack=new Stack<Character>();
			
			for(char ch: str.toCharArray()) {
				if(ch=='\n' || ch==' ') {
					while(!stack.isEmpty()) {
						bw.write(stack.pop()); //단어나 문장이 끝나면 스택에서 문자를 하나씩 꺼내 저장
					}
					bw.write(ch);
				} else {
					stack.push(ch); //문자열의 문자들을 스택에 하나씩 저장
				}
			}
			
			
			n--;
		}
		bw.flush(); //저장된 문자들을 출력
	}

}
