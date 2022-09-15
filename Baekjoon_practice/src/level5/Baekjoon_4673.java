package level5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

// 셀프 넘버
public class Baekjoon_4673 {
	public static int d(int n) {
		int result=n;
		
		if(n>0) result = result + (n % 10);
		if(n>=10) result = result + (n % 100 / 10);
		if(n>=100) result = result + (n % 1000 / 100);
		if(n>=1000) result = result + (n % 10000 / 1000);
		
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] sn = new int[10001];
		int r;
		
		for(int i=1; i<10001; i++) {
			r = Baekjoon_4673.d(i);
			if(r>10000) continue;
			sn[r] = 1;
		}
		
		for(int i=1; i<10001; i++) {
			if(sn[i] == 0) bw.write(String.valueOf(i) + "\n");
		}
		bw.flush();
		bw.close();
	}
}
