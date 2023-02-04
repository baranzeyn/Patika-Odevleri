import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dizinin kaç elamanlı olmasını istersiniz?");
		int elemanS = scan.nextInt();
		double toplam = 0.0;
		double sonuc = 0.0;
		int[] numbers = new int[elemanS];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println((i + 1) + ". değeri giriniz:");
			numbers[i] = scan.nextInt();
			if (numbers[i] == 0) {
				System.out.println("Hatalı tuşlama yaptınız...");
				System.exit(0);
			} else {
				toplam += (1.0 / numbers[i]);
			}
		}
		sonuc = elemanS / toplam;
		System.out.println("Sonuç : " + sonuc);

	}

}
