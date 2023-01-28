import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double top=0.0;
		double[] ucret= {2.14,3.67,1.11,0.95,5.00};
		String[] tur= {"armut","elma","domates","muz","patlıcan"};
		for(int i=0;i<tur.length;i++) {
			System.err.println(tur[i]+ " den kaç kilo alacaksınız:");
			double kg=scan.nextDouble();
			top+=kg*ucret[i];
		}
		System.out.println("Toplam tutar:"+top);

	}

}
