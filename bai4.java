package Tryhard;

//	Bài 4 (Logic hơn)
//
//	Nhập a b c.
//
//	In ra loại phương trình:
//
//	1. Phương trình bậc 2
//	2. Phương trình bậc 1
//	3. Phương trình vô nghiệm
//	4. Phương trình vô số nghiệm
//
import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập a: ");
		int a = sc.nextInt();

		System.out.print("Nhập b: ");
		int b = sc.nextInt();

		System.out.print("Nhập c: ");
		int c = sc.nextInt();

		if (a != 0) {
			System.out.println("Phương trình bậc 2");
		} else if (b != 0) {
			System.out.println("Phương trình bậc 1");
		} else if (c != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			System.out.println("Phương trình vô số nghiệm");
			sc.close();
		}
	}
}
