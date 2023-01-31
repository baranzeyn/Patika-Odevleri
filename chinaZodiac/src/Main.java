import java.util.Scanner;

public class Main {
// burda konunun karar yağpıları olduğunun farkındayım ama cidde bu kadar kısa ve kolay bir şekilde ifade edebilecekken diğer
	// şekilde yapmak doğru gelmedi
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Doğum yılınızı giriniz:");
		int year=scan.nextInt();
		String[] cZodiac= {"Maymun","Horoz","Köpek","Domuz","Fare","Öküz","Kaplan","Tavşan","Ejderha","Yılan","At","Koyun"};
		int number=year%12;
		String yZodiac=cZodiac[number];
		System.out.println("Çin zodyağı değeriniz:"+yZodiac);
	}
}
