import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı
		// kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
		Scanner scan = new Scanner(System.in);
		int number = (int) (Math.random() * 100);
		boolean isWin = false;
		int right = 0;
		while (right < 5) {
			System.out.println("Sorgulanacak sayıyı giriniz:");
			int selected = scan.nextInt();
			if (selected < 0 || selected > 100) {
				System.out.println("Sınırların dışında bir sayı girdiniz...");
				break;
			} else {
				System.out.println("Sayınız sorgulanıyor... ");
			}
			if (selected == number) {
				isWin = true;
				System.out.println("Oyunu kazandınız...");
			} else {
				System.out.println("Malesef doğru tahmin edemediniz " + (5 - right - 1) + " tane hakkınız kaldı...");
				if (right == 4) {
					System.out.println("Oyunu kaybettiniz...");
				}

			}
			if (isWin) {
				break;
			} else {
				right++;
			}

		}
	}

}
