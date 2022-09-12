package level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 더하기 사이클
public class Baekjoon_1110 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N;
		
		while(true) {
			N = Integer.parseInt(br.readLine());
			if(N >= 0 && N <= 99) break;
		}
		
		int Num1 = N;
		String strN1 = String.valueOf(N);
		int i=0, t, o, s;
		
		while(true) {
			i++;
			if(Num1 < 10) strN1 = "0" + strN1;
			
			o = Num1 % 10;
			t = (Num1 % 100) / 10;	// 십의 자리 구하기
			s = o + t;
			strN1 = String.valueOf(o) + String.valueOf(s%10);
			Num1 = Integer.parseInt(strN1);
			
			// System.out.println("t=" +  t + " o=" + o + " s=" + s + " strN1=" + strN1 + " Num1=" + Num1);
			
			if(Num1 == N) break;
		}
		
		bw.write(String.valueOf(i));
		
		bw.flush();
		bw.close();
	}
}
