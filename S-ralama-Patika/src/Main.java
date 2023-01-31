import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] sayilar=new int[3];
		int max;
		for(int i=0;i<sayilar.length;i++) {
			System.out.println((i+1)+".sayıyı giriniz:");
			sayilar[i]=scan.nextInt();
		}
		if((sayilar[0]>=sayilar[1])&&(sayilar[0]>=sayilar[2])) {
			max=sayilar[0];
		}
		else if((sayilar[1]>=sayilar[0])&&(sayilar[1]>=sayilar[2])) {
			max=sayilar[1];
		}
		else {
			max=sayilar[2];
		}
		System.out.println("En büyük sayı:"+max);

	}

}
