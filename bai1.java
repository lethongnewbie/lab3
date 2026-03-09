package Tryhard;

import java.util.Scanner;

public class bai1 {
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

	public static void main(String[] args) {
//	Bài 1 (Khó hơn một chút)
//	Giải nhiều phương trình bậc 2
//
//	Viết chương trình:
//
//	Nhập số n (số phương trình).
//
//	Mỗi lần nhập a, b, c.
//
//	In nghiệm của từng phương trình.
//
//	Ví dụ
//
//	Input
//	n = 2
//
//	1 5 6
//	1 2 1
//
//	Output
//
//	x1 = -2, x2 = -3
//	x = -1 (nghiệm kép)
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập số phương trình");
		int quanlity = sc.nextInt();
		for (int i = 1; i <= quanlity; i++) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("nhập số nguyên a: ");
			int a = scanner.nextInt();
			System.out.println("nhập số nguyên b: ");
			int b = scanner.nextInt();
			System.out.println("nhập số nguyên c: ");
			int c = scanner.nextInt();
			System.out.printf("giải phương trình %dx^2 + %dx + %d = 0 \n", a, b, c);
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
	}
}
