import java.util.Scanner;

public class Main {
	static int sum(int a,int b) {
		int result=a+b;
		System.out.println("Sonuç:" +result);
		return result;
	}
	static int minus(int a,int b) {
		int result=a-b;
		System.out.println("Sonuç:" +result);
		return result;
	}
	static int times(int a,int b) {
		int result=a*b;
		System.out.println("Sonuç:" +result);
		return result;
	}
	static int divide(int a,int b) {
		int result=a/b;
		System.out.println("Sonuç:" +result);
		return result;
	}
	static int power(int a,int b) {
		int result=1;
		for(int i=1;i<=(b-1);i++) {
			a*=a;
		}
		result=a;
		System.out.println("Sonuç:" + result);
		return result;
		
	}
	static int mod(int a,int b) {
		int result=a%b;
		System.out.println("Sonuç:" +result);
		return result;
	}
	static void alanCevre(int a,int b) {
		int result1=a*b;
		int result2= 2*(a+b);
		System.out.println("Dikdörtgenin alanı:" +result1);
		System.out.println("Dikdörtgenin çevresi: " +result2);
		
	}
	static int fact(int a) {
		int sonuc=1;
		for(int i=1;i<=a;i++) {
			sonuc*=i;
		}
		System.out.println("Sayının faktöriyeli:" + sonuc);
		return sonuc;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int secim;
		
		
			System.out.println("Yapılacak işlemi seçiniz \n 1-Çıkarma işlemi\n 2-Çarpma işlemi \n 3-Bölme işlemi \n 4-Üslü sayı hesaplama \n 5-Mod alma\n 6-Dikdörtgen Alan ve Çevre Hesabı\n 7-Toplma İşlemi \n 8-Faktöriyel alma \n 9-Çıkış işlemi");
			secim=scan.nextInt();
			if(!(secim==9)) {
			System.out.println("1. sayıyı giriniz:");
			int s1=scan.nextInt();
			System.out.println("2. sayıyı giriniz:");
			int s2=scan.nextInt();
			scan.close();
			switch(secim) {
			case 1:
				minus(s1,s2);
		
				break;
			case 2:
				times(s1,s2);
				
				break;
			case 3:
				divide(s1,s2);
				break;
			case 4:
				power(s1,s2);
				break;
			case 5:
				mod(s1,s2);
				break;
			case 6:
				alanCevre(s1,s2);
				break;
			case 7:
				sum(s1,s2);
				break;
			case 8:
				fact(s1);
				fact(s2);

			}}
		
			else {
				System.out.println("Sistemden çıkış yapılıyor");
				System.exit(0);
			}
		

	}

}
