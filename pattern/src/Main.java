import java.util.Scanner;

public class Main {
	static int desen(int a) {
	 int b = a;
	 
		if(a>0) {
			a-=5;
			System.out.println(a);
			return desen(a);
		}
		if(a<=0) {
			a+=5;
			System.out.println(a);
			if(b==a) {
				return a;
			}
				return desen2(a,b);
			
		}
		return 0;
	}
	
	static int desen2(int c,int b) {
		c+=5;
		System.out.println(c);
		if(b<=c) {
			return 0;
		}
		else {
			return desen2(c,b);
		}	}
	
	public static void main(String[] args) {
		/*kullanıcıdan değer al eğer negatif veya sıfır değilse olana kadar 5 çıkar 
		 * sonra geri eski değerini alana kadar beş ekle eski değerini aldığında
		 * programmı sonlandır  
		 */
		Scanner scan =new Scanner(System.in);
		int sayi;
		System.out.println("Sayı giriniz:");
		sayi=scan.nextInt();
		System.out.println(sayi);
		desen(sayi);
	}

}
