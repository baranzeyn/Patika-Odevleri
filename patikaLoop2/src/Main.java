import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int toplam=0;
		System.out.println("Bir sayı giriniz");
		int sayi=scan.nextInt();
		while(sayi%2!=1) {
			if(sayi%4==0) {
				toplam+=sayi;
			}
			System.out.println("Bir sayı giriniz");
			sayi=scan.nextInt();
			
		}
		System.out.println("Girilen 4'ün katı sayıların toplamı:"+toplam);

	}

}
