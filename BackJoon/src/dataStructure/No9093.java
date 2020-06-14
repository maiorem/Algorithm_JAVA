package dataStructure;


import java.io.*;
import java.util.Stack;

public class No9093 {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(n>0) {
			String str=br.readLine()+"\n";
			Stack<Character> stack=new Stack<Character>();
			
			for(char ch: str.toCharArray()) {
				if(ch=='\n' || ch==' ') {
					while(!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(ch);
				} else {
					stack.push(ch);
				}
			}
			
			
			n--;
		}
		bw.flush();
	}

}
