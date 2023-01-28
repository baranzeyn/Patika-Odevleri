import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double boy,kilo,bmi=0.0;
		System.out.println("Boyunuzu metre cinsinden giriniz:");
		boy=scan.nextDouble();
		System.out.println("Kilonuzu kg cinsinden girinz:");
		kilo=scan.nextDouble();
		bmi=(kilo)/(boy*boy);
		System.out.println("Vücut kitle endeksiniz:"+bmi);

	}

}
