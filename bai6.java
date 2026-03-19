package Tryhard;

import java.util.Scanner;

public class bai6 {
//	Bài 6 (Level khó)
//
//	Viết chương trình:
//
//	Nhập a b c.
//
//	Nếu có 2 nghiệm → in nghiệm lớn hơn
//
//	Nếu nghiệm kép → in nghiệm
//
//	Nếu vô nghiệm → thông báo
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a: ");
		double a = sc.nextDouble();

		System.out.print("Nhập b: ");
		double b = sc.nextDouble();

		System.out.print("Nhập c: ");
		double c = sc.nextDouble();

		if (a == 0) {
			System.out.println("Không phải phương trình bậc 2");
		} else {

			double delta = b * b - 4 * a * c;

			if (delta < 0) {
				System.out.println("No solution");
			} else if (delta == 0) {

				double x = -b / (2 * a);
				System.out.println("Có nghiệm kép: " + x);

			} else {

				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);

				if (x1 > x2) {
					System.out.println("nghiệm lớn hơn là: " + x1);
				} else {
					System.out.println("nghiệm lớn hơn là: " + x2);
				}
			}
		}

		sc.close();
	}
}
