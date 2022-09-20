package level6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 알파벳 찾기
public class Baekjoon_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int[] alphabet = new int[26];
		
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i] = -1;
		}
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(alphabet[ch-97] != -1) continue;
			else if(alphabet[ch-97] == -1) {
				alphabet[ch-97] = i;
			}
		}
		
		for(int i=0; i<alphabet.length; i++) {
			bw.write(String.valueOf(alphabet[i]) + " ");
		}
		
		bw.flush();
		bw.close();
	}
}
