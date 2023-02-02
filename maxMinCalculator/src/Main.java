import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = 0;
		int min1 = 0, min2 = 0;
		System.out.println("Kaç tane sayı gireceksiniz:");
		int elemanS = input.nextInt();
		int[] sayilar = new int[elemanS];
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println("Sayı giriniz:");
			sayilar[i] = input.nextInt();
		}
		min1 = sayilar[0];
		max = sayilar[0];
		for (int i = 0; i < sayilar.length; i++) {

			if (max < sayilar[i]) {
				max = sayilar[i];
			}
			if (min1 > sayilar[i]) {
				min1 = sayilar[i];
			}
		}
		System.out.println("max:" + max);
		System.out.println("min:" + min1);

	}

}
