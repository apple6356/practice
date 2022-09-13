package level4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

// 나머지 개수
public class Baekjoon_3052 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			while(true) {
				arr[i] = Integer.parseInt(br.readLine());
				if(arr[i] >= 0 && arr[i] <= 1000) break;
			}
		}
		
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			if(i==0) result.add(arr[i] % 42);
			
			if(result.contains(arr[i]%42)) continue;
			else result.add(arr[i]%42);
		}
		
		bw.write(String.valueOf(result.size()));
		
		bw.flush();
		bw.close();
	}
}
