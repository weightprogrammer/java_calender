package java_ex100;

import java.util.Scanner;

public class San {

	public static void main(String[] args) {
		//�Է�: Ű����
		//���: ȭ��
		//System.out.println(5 + 10);
		int a,b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("���� �Է����ּ���.");
		s1 = scanner.next();
		s2 = scanner.next();
		System.out.println(s1 + "," +s2);
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.println(a + "," + b);
		
//		int c = a + b;
//		System.out.println("�μ��� ���� " + c + "�Դϴ�");
		System.out.printf("%d��%d�� ���� %d�Դϴ�",a, b, a + b);
		scanner.close();
	}

}