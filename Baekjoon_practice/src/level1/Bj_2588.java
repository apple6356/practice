package level1;

import java.util.*;

// �� �ڸ��� * �� �ڸ��� ���� ���� ǥ�� 
public class Bj_2588 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, b1, b2, b3;	// b1, b2, b3 b�� �� �ڸ��� ���� ���� ����
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		int bc = b;	// b ����
		
		// b�� �� �ڸ��� ����
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
