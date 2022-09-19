package level5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 한수
public class Baekjoon_1065 {
	public static int han(int n) {
		int result = 0, a, b, c;
		for(int i=1; i<=n; i++) {
			if(i==1000) break;
			if(i > 0 && i < 100) { 
				result++;
			}
			else if(i>=100) {
				a = i % 10;
				b = i % 100 / 10;
				c = i % 1000 / 100;
				if(a - b == b - c) result++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n, result;
		while(true) {
			n = Integer.parseInt(br.readLine());
			if(n >= 1 && n <= 1000) break;
		}
		
		result = han(n);
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
}
