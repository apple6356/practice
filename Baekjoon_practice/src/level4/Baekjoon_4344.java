package level4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 평균 이상 비율
public class Baekjoon_4344 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int C;
		float sum, avg, num;
		
		C = Integer.parseInt(br.readLine());
		
		int[] N = new int[C];
		ArrayList<Integer> grade = new ArrayList<>();
		
		for(int i = 0; i < C; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N[i] = Integer.parseInt(st.nextToken());
			sum = 0;
			for(int j = 0; j < N[i]; j++) {
				grade.add(j, Integer.parseInt(st.nextToken()));
				sum = sum + grade.get(j);
			}
			avg = sum / N[i];
			
			num = 0;
			for(int j = 0; j < N[i]; j++) {
				if(avg < grade.get(j)) num++;
			}
			
			bw.write(String.format("%.3f", (num/N[i])*100) + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
