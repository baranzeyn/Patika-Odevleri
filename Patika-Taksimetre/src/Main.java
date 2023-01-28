import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int ucret=10;
		double yol;
		System.out.println("Gidilen kmyi giriniz:");
		yol=scan.nextDouble();
		ucret+=yol*2.20;
		if(yol>0.0) {
		if(ucret<=20) {
			ucret=20;
			System.out.println("Ödenecek tutar:"+ucret);
		}
		else if(ucret>20) {
			System.out.println("Ödenecek tutar:"+ucret);
		}}
		else {
			System.out.println("Hatalı tuşlama yaptınız.");
		}

	}

}
