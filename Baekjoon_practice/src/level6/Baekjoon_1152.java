package level6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 단어의 개수
public class Baekjoon_1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String[] sArr = s.split("\\s+");	// 하나 이상의 공백과 일치하면 문자열 분할
		
		bw.write(String.valueOf(sArr.length));
		bw.flush();
		bw.close();
	}
}
