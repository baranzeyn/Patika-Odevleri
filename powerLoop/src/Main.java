import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Taban olacak sayıyı giriniz:");
		int base = scan.nextInt();
		System.out.println("Üs olacak sayıyı giriniz:");
		int power = scan.nextInt();
		int sonuc = 1;
		for (int i = 1; i <= power; i++) {
			sonuc *= base;
		}
		System.out.println(base + " in " + power + ". kuvveti:" + sonuc);

	}

}
