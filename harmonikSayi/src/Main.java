import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı giriniz:");
		int sayi=scan.nextInt();
		double top=0.0;
		for(double i=1;i<=sayi;i++) {
			top+=(1/i);
		}
		System.out.println(top);

	}

}
