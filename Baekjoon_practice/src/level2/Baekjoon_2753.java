package level2;

import java.util.*;

// À±³â È®ÀÎ
public class Baekjoon_2753 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int year;
		
		while(true) {
			year = scanner.nextInt();
			if(year>=1 && year<=4000) break;
		}
		
		if((year%4)==0 && ((year%100)!=0 || (year%400)==0)){
			System.out.println("1");
		}
		else System.out.println("0");
	}
}
