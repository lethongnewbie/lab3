package Tryhard;

import java.util.Scanner;

public class bai9 {
//	Giải nhiều phương trình bậc 1
//
//	Viết chương trình:
//
//	Nhập số n (số phương trình).
//
//	Mỗi lần nhập a, b
//
//	In nghiệm của từng phương trình.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập số phương trình muốn giải: ");
		int quan = sc.nextInt();
		for (int i = 1; i <= quan; i++) {
			System.out.println("nhập a: ");
			int a = sc.nextInt();
			System.out.println("nhập b: ");
			int b = sc.nextInt();
			if (a == 0 && b == 0) {
				System.out.printf("phương trình có vô số nghiệm \n");
			} else if (a == 0 && b != 0) {
				System.out.println("phương trình vô nghiệm \n");
			} else {
				float value = (float) -b / a;
				System.out.printf("phương trình %dx + %d = 0 ", a, b);
				System.out.println("có nghiệm là: " + value);
			}
		}
	}
}
