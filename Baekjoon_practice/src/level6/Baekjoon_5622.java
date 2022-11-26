package level6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		int t = 0;
		for(int i=0; i<str.length(); i++) {
			switch (str.charAt(i)) {
			case 'A': case 'B': case 'C':
				t = t + 3;
				break;
			case 'D': case 'E': case 'F':
				t = t + 4;
				break;
			case 'G': case 'H': case 'I':
				t = t + 5;
				break;
			case 'J': case 'K': case 'L':
				t = t + 6;
				break;
			case 'M': case 'N': case 'O':
				t = t + 7;
				break;
			case 'P': case 'Q': case 'R': case 'S':
				t = t + 8;
				break;
			case 'T': case 'U': case 'V':
				t = t + 9;
				break;
			case 'W': case 'X': case 'Y': case 'Z':
				t = t + 10;
				break;
			}
		}
		
		bw.write(String.valueOf(t));
		
		bw.flush();
		bw.close(); 
	}
}
