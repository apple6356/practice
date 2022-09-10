package level3;

import java.util.*;

// 1부터 n까지의 합
public class Baekjoon_8393 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n, sum = 0;
		
		while(true) {
			n = scanner.nextInt();
			if(n>=1 && n<=10000) break;
		}
		
		for(int i=1;i<=n;i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		scanner.close();
	}
}
