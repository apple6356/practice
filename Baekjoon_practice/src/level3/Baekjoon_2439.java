package level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 별 찍기
public class Baekjoon_2439 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N;
		
		while(true) {
			N = Integer.parseInt(br.readLine());
			if(N >= 1 && N <= 100) break;
		}
		
		for(int i=1; i <= N; i++) {
			for(int j=0; j < (N-i); j++) {
				bw.write(" ");	
			}
			
			for(int k=0; k < i; k++) {
				bw.write("*");
			}
			
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}
}
