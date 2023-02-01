import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı giriniz:");
		int sayi = scan.nextInt();
		int temp = sayi;
		int toplam = 0;

		toplam += temp % 10;
		while (temp != 0) {
			temp /= 10;
			toplam += temp % 10;
		}
		System.out.println("basamak değerleri toplamı:"+toplam);

	}

}
