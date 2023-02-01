import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Faktöriyeli alınacak sayıyı giriniz:");
		int number = scan.nextInt();
		int fakt = 1;
		if(number>0) {
		for (int i = 1; i <= number; i++) {
			fakt *= i;
		}}
		if(number<0) {
			System.out.println("Negatif sayıların faktöriyeli hesaplanmaz.");
			System.exit(0);
		}
		
		System.out.println("Sayının faktöriyeli:" + fakt);

	}

}
