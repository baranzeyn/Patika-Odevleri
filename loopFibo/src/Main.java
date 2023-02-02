import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı giriniz:");
		int number=scan.nextInt();
		int n1=0,n=1,toplam=0;
		for(int i=0;i<number;i++) {
			System.out.print(n+" ");
			toplam=n+n1;
			n1=n;
			n=toplam;
			
		}
	}

}
