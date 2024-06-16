package bj_test_BufferReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class BJ_2675_문자열반복 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine()); // 반복횟수 결정
		
		
		for(int i=0; i<T; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			
			int R = Integer.parseInt(st.nextToken());  // 정수값 띄어쓰기 위해 Tokenizer 적용
			String str = st.nextToken(); // 문자열 띄어쓰기 위해 Tokenizer 적용
			
			for(int j =0; j<str.length(); j++) {   // 문자열의 길이만큼 반복
				for(int k=0; k<R; k++) { // 정수값 입력받은 수 만큼 반복 
					System.out.print(str.charAt(j)); // 1번째 반복 3입력 str입력값의 charAt(0)번째값 A를 세번출력 // 두번째 반복 j는 1 charAt(1) 012의 두번째 인자값 B를 세번출력 계속해서 반복
				}
			}
			System.out.println(""); // 띄워쓰기 위해 사용
		}
		
	}

}
