import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sonuc1 = 0, sonuc2 = 0;
		System.out.println("Sayı giriniz:");
		int sayi1 = scan.nextInt();
		System.out.println("Sayı giriniz:");
		int sayi2 = scan.nextInt();
		scan.close();
		int i = 1, ebob = 0;
		boolean isOver;
		if (sayi1 == 0 || sayi2 == 0) {
			isOver = false;
			System.out.println("Hesaplanamaz");

		} else {
			isOver = true;
		}
		while (isOver) {
			if (sayi1 == i || sayi2 == i) {
				isOver = false;
			}
			if (sayi1 % i == 0 && sayi2 % i == 0) {
				ebob = i;

			}
			i++;

		}

		if (ebob != 0) {
			System.out.println("Ebob:" + ebob);
			System.out.println("Ekok:"+(sayi1*sayi2)/ebob);
		}

	}

}
