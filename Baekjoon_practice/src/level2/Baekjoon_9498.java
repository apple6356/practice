package level2;

import java.util.*;

// 시험 성적에 따라 학점 분류
public class Baekjoon_9498 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a;
		
		while(true) {
			System.out.print("0~100사이의 정수 입력 : ");
			a = scanner.nextInt();
			if((a>=0) && (a<=100)) break;
		}
		
		if(a>=90) System.out.println("A");
		else if(a>=80) System.out.println("B");
		else if(a>=70) System.out.println("C");
		else if(a>=60) System.out.println("D");
		else System.out.println("F");
		
		scanner.close();
	}
}
