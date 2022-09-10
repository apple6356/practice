package level1;

import java.util.*;

// 세 자리수 곱셈 과정 출력하기
public class Bj_2588 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, b1, b2, b3;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		int bc = b;
		
		b1 = bc % 10;
		bc /= 10;
		b2 = bc % 10;
		bc /= 10;
		b3 = bc % 10;
		
		System.out.println(a*b1);
		System.out.println(a*b2);
		System.out.println(a*b3);
		System.out.println(a*b);
		
		scanner.close();
	}
}
