package level2;

import java.util.Scanner;

// 사분면 구분
public class Baekjoon_14681 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x, y;
		
		while(true) {
			x = scanner.nextInt();
			y = scanner.nextInt();
			
			if(x>=-1000 && x<=1000 && x!=0 && y>=-1000 && y<=1000 && y!=0) break;
		}
		
		if(x>0 && y>0) System.out.println("1");
		else if(x<0 && y>0) System.out.println("2");
		else if(x<0 && y<0) System.out.println("3");
		else if(x>0 && y<0) System.out.println("4");
		
		scanner.close();
	}
}
