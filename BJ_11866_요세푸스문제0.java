package bj_test_BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_11866_요세푸스문제0 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(token.nextToken());
		int K = Integer.parseInt(token.nextToken());
		
		Queue<Integer> que = new LinkedList<>();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("<");
		
		for(int i = 1; i<=N; i++) {
			que.add(i);
		}
		while(que.size()>0) { // 한번돌때마다 맨앞 두자리 뒤로 보내고 3번째 요소 poll 추출한뒤 삭제
	
			for(int i=0; i<K-1; i++) { // 0~1 반복 [1,2,3,4,5,6,7]  
				que.offer(que.poll()); // 맨앞 두자리 추출하고 다시 추가 맨뒤로 보냄 [3,4,5,6,7,1,2] // 두번쨰 [6,7,1,2,4,5]
			}
			
			sb.append(que.poll()); // 맨앞요소 추출 3 추출후 삭제 남은요소 [4,5,6,7,1,2]  // 두번째 6 추출후 삭제 [7,1,2,4,5]
			
			if(que.size() !=0) { // que 사이즈가 0이 아닐시 ", " 저장 
				
				sb.append(", ");
			}
		}
		
		sb.append(">");
		
		System.out.println(sb);
	}

}
