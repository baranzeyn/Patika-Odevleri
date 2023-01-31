import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("mesafeyi km türünden giriniz:");
		int mesafe=scan.nextInt();
		double tutar=0.1 * mesafe;
		System.out.println("Yaşınızı giriniz:");
		int yas=scan.nextInt();
		System.out.println("Yolculuk tipinizi seçiniz\n1-tek yön\n2-çift yön");
		int secim=scan.nextInt();
		if(yas<0 || mesafe<0) {
			System.out.println("Hatalı giriş yaptınız");
			System.exit(0);
		}
		switch(secim) {
		case 1:
			 if(12<yas) {
					tutar=tutar*0.5;
				}
				else if(yas>12 && yas<=24) {
					tutar=tutar*0.8;
				}
				else if(yas>65) {
					tutar=tutar*0.3;
				}
			 break;
		case 2:
			if(12<yas) {
				tutar=tutar*0.5;
			}
			else if(yas>12 && yas<=24) {
				tutar=tutar*0.8;
			}
			else if(yas>65) {
				tutar=tutar*0.3;
			}
			tutar=tutar*0.80;
			tutar=tutar*2;
		 break;
			default:
				System.out.println("Hatalı giriş");
				System.exit(0);
				break;
		}
		System.out.println("Ödenecek tutar:"+tutar);
		
		
		
		
	}

}
