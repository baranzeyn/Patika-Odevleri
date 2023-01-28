import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s1, s2;
		System.out.println("1.sayıyı giriniz:");
		s1 = scan.nextInt();
		System.out.println("2.sayıyı giriniz:");
		s2 = scan.nextInt();
		System.out.println("Yapılacak iişlemi seçiniz:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		int select = scan.nextInt();
		if (select == 1) {
			System.out.println("Sonuç:" + (s1 + s2));
		} else if (select == 2) {
			System.out.println("Sonuç:" + (s1 - s2));
		} else if (select == 3) {
			System.out.println("Sonuç:" + (s1 * s2));
		} else if (select == 4) {
			if (s2 != 0) {
				System.out.println("Sonuç:" + (s1 / s2));
			} else {
				System.out.println("Bir sayı 0'a bölünemez.");
			}

		} else {
			System.out.println("Hatalı tuşlama yaptınız.");
		}
	}
}
