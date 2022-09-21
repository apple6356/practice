package level6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 가장 많이 사용된 문자
public class Beakjoon_1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s1 = br.readLine();
		String s2 = s1.toUpperCase();
		int[] n = new int[26];
		for(int i=0; i<s2.length(); i++) {
			n[s2.charAt(i) - 65]++;
		}

		int max = 0;
		char ch = ' ';
		
		for(int i=0; i<n.length; i++) {
			if(n[max] < n[i]) max = i;
		}

		for(int i=0; i<n.length; i++) {
			if(n[max] == n[i] && max != i) ch = '?';
			else if(ch != '?') ch = (char)(max+65);
		}
		
		bw.write(ch);
		bw.flush();
		bw.close();
	}
}
