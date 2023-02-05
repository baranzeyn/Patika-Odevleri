import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nearMin = 0, nearMax = 0;
		System.out.println("Sayı giriniz:");
		int sayi = scan.nextInt();
		int[] sayilar = { 1, -4, 9, 4, 5, 10, -2, sayi };
		Arrays.sort(sayilar);
		int min = sayilar[0];
		int max = sayilar[sayilar.length - 1];
		int a = Arrays.binarySearch(sayilar, sayi);
		if (a != 0) {
			nearMin = sayilar[a - 1];
		} else {
			nearMin = sayi;
		}
		if (a != sayilar.length - 1) {
			nearMax = sayilar[a + 1];
		} else {
			nearMax = sayi;
		}
		System.out.println("dizinin max değeri : " + max + " dizinin min değeri : " + min
				+ " girilen sayıya yakın min : " + nearMin + "\ngirilen sayıya yakın max : " + nearMax);
	}
}