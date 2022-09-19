package level6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 숫자의 합
public class Baekjoon_11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		String str = br.readLine();
		for(int i=0; i<str.length(); i++) {
			sum = sum + Integer.parseInt(str.substring(i, i+1));
		}
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}
}
