package Tryhard;

import java.util.Scanner;

public class bai5 {
	public static void check(double x) {

		if (x > 0) {
			System.out.println("1 nghiệm dương");
		} else if (x < 0) {
			System.out.println("1 nghiệm âm");
		} else {
			System.out.println("1 nghiệm bằng 0");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập a: ");
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
				check(x);

			} else {

				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);

				check(x1);
				check(x2);
			}
		}

		sc.close();
	}
}