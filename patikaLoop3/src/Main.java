import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı giriniz:");
		int number=scan.nextInt();
		/*for(int i=1;i<=number;i*=2) {
			System.out.println(i);          videodaki örnek
		}*/
		/*for(int i=1,j=1;i<=number && j<=number;i*=4,j*=5) {
			System.out.println("4-"+i);
			System.out.println("5-"+j);
		}*/
		
		  int a,b;
		  System.out.println("1-Hangi sayının kuvvetleri konrol edilsin:");
		  a=scan.nextInt();
		   System.out.println("2-Hangi sayının kuvvetleri konrol edilsin:");
		  b=scan.nextInt();
		  for(int i=0;i<number;i++){
		  if(Math.pow(a,i)<=number){
		     System.out.println(a+"'in "+i+". kuvveti "+Math.pow(a,i));}
		     if(Math.pow(b,i)<=number){
		      System.out.println(b+"'in "+i+". kuvveti "+Math.pow(b,i));}
		  }
		 

	}

}
