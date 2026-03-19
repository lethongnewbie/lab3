package Tryhard;

import java.util.Scanner;

public class bai8 {
//	Viết menu switch case
//
//	1. Giải phương trình bậc 1
//	2. Giải phương trình bậc 2
//	3. Thoát
//
//	Người dùng chọn menu để giải.
	public static void pt1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a: ");
		double a = sc.nextDouble();

		System.out.println("Nhập b: ");
		double b = sc.nextDouble();

		if (a == 0 && b == 0) {
			System.out.println("phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("phương trình vô nghiệm");
		} else {
			double x = -b / a;
			System.out.println("phương trình có nghiệm: " + x);
		}
	}

	public static void pt2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a: ");
		double a = sc.nextDouble();

		System.out.println("Nhập b: ");
		double b = sc.nextDouble();

		System.out.println("Nhập c: ");
		double c = sc.nextDouble();
		if (a == 0) {
			pt1();
		} else {
			double delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("phương trình vô nghiệm");
			} else if (delta == 0) {
				double x = -b / 2 * a;
				System.out.println("phương trình có nghiệm kép: " + x);
			} else {
				double x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("phương trình có 2 nghiệm phân biệt x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("1. Giải phương trình bậc 1\n" + "2. Giải phương trình bậc 2\n" + "3. Thoát");
		System.out.println("bạn muốn chọn số mấy: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch (x) {
		case 1:
			System.out.println("bạn đã chọn giải phương trình bậc 1");
			pt1();
			break;
		case 2:
			System.out.println("bạn đã chọn giải phương trình bậc 2");
			pt2();
			break;
		default:
			System.out.println("thoát chương trình");
			System.exit(0);
		}
	}
}
