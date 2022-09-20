package level6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 문자열 반복
public class Baekjoon_2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s;
		int a, n = Integer.parseInt(br.readLine());
		char[] ch;
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			s = st.nextToken();
			ch = new char[a];
			for(int j=0; j<s.length(); j++) {
				ch[j] = s.charAt(j);
				for(int k=0; k<a; k++) {
					bw.write(ch[j]);
				}
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}
}
