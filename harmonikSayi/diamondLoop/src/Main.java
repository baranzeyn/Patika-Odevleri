import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı giriniz:");
		int sayi = scan.nextInt();
		for (int i = 0; i <= sayi; i++) {
			for (int j = 1; j <= (sayi - i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for (int i = sayi; i >= 0; i--) {
			for (int j = (sayi - i); j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = (2 * i - 1); k > 0; k--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
