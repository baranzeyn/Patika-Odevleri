import java.util.Scanner;

public class Main {
	static boolean isPrime(int num, int temp) {
        if (num == 1) {
            return false;
        }
        if (temp % --num != 0) {
            return isPrime(num, temp);
        } else if (temp % num == 0 && num != 1) {
            return false;
        }
        return true;
    }

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num,b;
		System.out.println("Asallığı sorgulanacak sayıyı giriniz:");
		num=scan.nextInt();
		b=num;
		if(isPrime(num,b)) {
			System.out.println("Sayı asaldır");
			
		}
		else {
			System.out.println("Sayı asal değildir");
		}

	}

}
