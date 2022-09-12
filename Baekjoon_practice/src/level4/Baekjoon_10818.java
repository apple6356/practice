package level4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 최솟값 최댓값 구하기
public class Baekjoon_10818 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N, max = 0, min = 0;
		while(true) {
			N = Integer.parseInt(br.readLine());
			if(N >= 1 && N <= 1000000) break;
		}
		
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(i==0) {
				max = arr[0];
				min = arr[0];
				continue;
			}
			if(max < arr[i]) max = arr[i];
			if(min > arr[i]) min = arr[i];
		}
		
		bw.write(max + " " + min);
		bw.flush();
		bw.close();
	}
}
