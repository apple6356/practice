package level4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 평균 조작
public class Baekjoon_1546 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N;
		float M = -1, sum = 0;
		ArrayList<Float> grade = new ArrayList<>();
		
		while(true) {
			N = Integer.parseInt(br.readLine());
			if(N<=1000) break;
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(true) {
			grade.add(Float.parseFloat(st.nextToken()));
			if(st.countTokens() == 0) break;
		}
		
		for(int i = 0; i < N; i++) {
			if(M < grade.get(i)) M = grade.get(i);
		}
		
		for(int i = 0; i < N; i++) {
			grade.set(i,  (grade.get(i) / M) * 100);
			sum = sum + grade.get(i);
		}
		
		bw.write(String.valueOf(sum/N));
		
		bw.flush();
		bw.close();
	}
}
