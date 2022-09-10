package level2;

import java.util.Scanner;

// 알람 시계 설정 시간보다 45 전으로 설정
public class Baekjoon_2884 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int H, M;
		
		while(true) {
			H = scanner.nextInt();
			M = scanner.nextInt();
			
			if(H>=0 && H<=23 && M>=0 && M<=59) break;
		}
		
		M = M - 45;
		if(M < 0) {
			M = M + 60;
			if(H == 0) H = 23;
			else H = H - 1;
		}
		
		System.out.println(H + " " + M);
		
		scanner.close();
	}
}
