import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int brut;
		double kdv,top=0.0;
		System.out.println("Brüt tutarı giriniz:");
		brut=scan.nextInt();
		if((brut>0)&&(brut<=1000)) {
			kdv=brut%18;
			top=brut+brut%18;
		}
		else if(brut>1000) {
			kdv=brut%8;
			top=brut+brut%8;
		}
		else {
			kdv=0;
			System.out.println("hatalı giriş yaptınız");
		}
		System.out.println("Ödenecek turar:"+top+" kdv:"+kdv);

	}

}
