import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// notları alsın if else e göre
		// geçme durumunu boolean veri tipiyle belirlediğimiz değişkene atasın ve
		// sınıfı geçme durumumuzu bassın
		Scanner scan = new Scanner(System.in);
		String dersler[] = { "matematik", "fizik", "kimya", "türkçe", "müzik" };
		int toplam = 0;
		int a = dersler.length * 2;
		int[] sonuc = new int[a];
		boolean pass1 = false, pass2 = false, pass3 = false, pass4 = false, pass5 = false;

		for (int j = 0; j < dersler.length; j++) {

			for (int i = 1; i <= 2; i++) {

				System.out.println(dersler[j] + " dersinin " + i + ".sınav notunu giriniz:");
				int b = scan.nextInt();
				for (int k = 0; k < (dersler.length * 2); k++) {
					sonuc[k] = b;

				}

			}

		}
		for (int k = 0; k < (sonuc.length); k += 2) {
			toplam += sonuc[k] + sonuc[k + 1];
		}
		toplam /= 10;
		boolean pass = (toplam) > 60;
		while (pass) {
			System.out.println("sınıfı geçtiniz");
			System.exit(0);
		}
		System.out.println("Sınıfta kaldınız");

	}
}
