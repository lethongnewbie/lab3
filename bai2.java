package Tryhard;

import java.util.Scanner;

public class bai2 {
	public static void ptbac1(int b, int c) {
		if (b == 0 && c == 0) {
			System.out.printf("phương trình có vô số nghiệm");
		} else if (b == 0 && c != 0) {
			System.out.println("phương trình vô nghiệm ");
		} else {
			float value = (float) -c / b;
			System.out.printf("phương trình %dx + %d = 0 ", b, c);
			System.out.printf("có nghiệm là: " + value);
		}
	}

	public static void pt2(int a, int b, int c) {
		if (a == 0) {
			ptbac1(b, c);
		} else {
			double delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("phương trình vô nghiệm");
			} else if (delta == 0) {
				float x = (float) -b / 2 * a;
				System.out.println("phương trình có nghiệm kép x = " + x);
			} else {
				float x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
				float x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("phương trình có 2 nghiệm phân biệt x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập số nguyên a: ");
		int a = sc.nextInt();
		System.out.println("nhập số nguyên b: ");
		int b = sc.nextInt();
		System.out.println("nhập số nguyên c: ");
		int c = sc.nextInt();
		System.out.printf("giải phương trình %dx^2+%dx+%d \n", a, b, c);
		pt2(a, b, c);
	}
//	Bài 2 (Dùng Function)
//
//	Viết function:
//
//	solveQuadratic(a, b, c)
//
//	Hàm này:
//
//	Nhận a b c
//
//	Trả về nghiệm của phương trình.
//
//	Sau đó gọi hàm trong main.
//

}
