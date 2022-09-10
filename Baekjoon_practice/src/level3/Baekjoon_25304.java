package level3;

import java.util.*;

// 영수증
public class Baekjoon_25304 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int X, N;
		
		while(true) {
			X = scanner.nextInt();
			N = scanner.nextInt();
			
			if(X>=1 && X<=1000000000 && N>=1 && N<=100) break;
		}
		
		int[] a = new int[N], b = new int[N];
		
		for(int i=0;i<N;i++) {
			while(true) {
				a[i] = scanner.nextInt();
				b[i] = scanner.nextInt();
				
				if(a[i]>=1 && a[i]<=1000000 && b[i]>=1 && b[i]<=10) break;
			}
		}
		
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			sum = sum + (a[i] * b[i]);
		}
		
		if(X == sum) System.out.println("Yes");
		else System.out.println("No");
		
		scanner.close();
	}
}
