import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sorgulanmasını istediğiniz yılı giriniz:");
		int yıl=scan.nextInt();
		if(yıl%4==0 && yıl%100!=0) {
			System.out.println(yıl+" Artık yıldır");
		}
		else if(yıl%100==0 && yıl%400==0) {
			System.out.println(yıl+" Artık yıldır");
		}
		else {
			System.out.println(yıl+" Artık yıl değildir");
		}

	}

}
