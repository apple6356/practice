package level6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String sr = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			sr = sr + s.charAt(i);
		}
		
		String[] sArr = sr.split("\\s+");
		
		if(Integer.parseInt(sArr[0]) > Integer.parseInt(sArr[1])) bw.write(sArr[0]);
		if(Integer.parseInt(sArr[0]) < Integer.parseInt(sArr[1])) bw.write(sArr[1]);
		
		bw.flush();
		bw.close();
	}
}
