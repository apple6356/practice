package level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 빠른 A+B
public class Baekjoon_15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T, A, B;
		while(true) {
			T = Integer.parseInt(br.readLine());
			if(T <= 1000000) break;
		}
		
		
		for(int i=0; i<T; i++) {
			while(true) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				A = Integer.parseInt(st.nextToken());
				B = Integer.parseInt(st.nextToken());
				//System.out.println(A +" "+B+" "+(A+B));
				// A = br.read();
				// B = br.read();
				if(A >= 1 && A <= 1000 && B >= 1 && B <= 1000) {
					bw.write(String.valueOf(A + B) + "\n"); 
					break;
				}
			}
		}
		
		bw.flush();
		bw.close();
	}
}
