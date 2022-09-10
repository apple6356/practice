package level1;

import java.util.*;

// a + b 출력
public class Bj_1000 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("A>>");
		int a = scanner.nextInt();
		
		System.out.print("B>>");
		int b = scanner.nextInt();
		
		System.out.println(a+b);
		
		scanner.close();
	}
}
