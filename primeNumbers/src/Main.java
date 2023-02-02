
public class Main {

	public static void main(String[] args) {

		int[] primeN = new int[100];
		for (int i = 2; i < 100; i++) {
			int sayac = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					sayac++;// elimizdeki sayı tam bölündükçe sayac artacak
				}
			}
			if (sayac == 2) {// eğer sayı sadece iki sayıya bölünüyorsa bunlardan biri zaten 1 diğeri de
								// kendine eşit olmalı
				System.out.print(i + " ");
			}
		}
	}

}
