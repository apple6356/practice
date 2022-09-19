package level5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 함수로 정수 n개의 합 구하기
public class Baekjoon_15596 {
	public static long sum(int[] a) {
		long sum = 0;
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] a = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		long sum = sum(a);
		
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}
}
