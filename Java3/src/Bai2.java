import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		int a, j, i, k, q;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap do dai canh tam giac : ");
		a = sc.nextInt();
		for (i = 1; i <= a; i++) {
			for (j = 1; j <= i; j++)
				System.out.print("* ");
			System.out.println(" ");
		}
		for (k = a; k >= 1; k--) {
			for (q = 1; q <= k; q++)
				System.out.print("* ");
			System.out.println(" ");
		}
	}
}
