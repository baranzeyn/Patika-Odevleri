import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double centerAngle,radius,area=0.0,sliceArea=0.0,primeter=0.0,p=3.14;
		
		System.out.println("Çevresi ve alanı hesaplanacak olan çemberin yarıçapını giriniz: ");
		radius=scan.nextDouble();
		System.out.println("Çemberin merkez açı ölçüsünü giriniz:");
		centerAngle=scan.nextDouble();
		area=p*radius*radius;
		primeter=2*p*radius;
		sliceArea=(p*radius*radius*centerAngle)/360;
		System.out.println("istenilen dilimin alanı:"+sliceArea);
		

	}

}
