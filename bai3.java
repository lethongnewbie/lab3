package Tryhard;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập a: ");
		int a = sc.nextInt();

		System.out.print("Nhập b: ");
		int b = sc.nextInt();

		System.out.print("Nhập c: ");
		int c = sc.nextInt();

		System.out.printf("Giải phương trình %dx^2 + %dx + %d\n", a, b, c);

		if (a == 0) {
			System.out.println("Không phải phương trình bậc 2");
		} else {
			float delta = b * b - 4 * a * c;

			if (delta < 0) {
				System.out.println("No solution");
			} else {
				float sum = (float) -b / a;
				System.out.println("Tổng 2 nghiệm là: " + sum);
			}
		}

		sc.close();
	}
}
//	Bài 3 (Khó hơn)
//
//	Viết chương trình:
//
//	Nhập a b c
//
//	Nếu phương trình có nghiệm → in tổng 2 nghiệm
//
//	Nếu vô nghiệm → in "no solution"
//
//	Gợi ý:
//
//	x1 + x2 = -b/a
