package dataStructure;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class No9093_2 {

	public static void main(String[] args) throws IOException  {
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<=T; i++) {
			String str=sc.nextLine()+'\n';	
			Stack<Character> stack=new Stack<Character>();
			
			
			for(char ch: str.toCharArray()) {
				if(ch==' ' || ch=='\n') {
					while(!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(ch);
				} else {
					stack.push(ch);
				}
			}			
			
		}
		bw.flush();
	}

}
