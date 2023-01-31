import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı giriniz:");
		int sayi=scan.nextInt();
		int toplam=0,k=0;
		for(int i=0;i<=sayi;i++) {
			if((i%3==0) && (i%4==0)) {
				toplam+=i;
				k++;
				System.out.println(i);
			}
			else {
				continue;
			}
		}
		toplam=toplam/k;
		System.out.println("ortalama:"+toplam);

	}

}
