import java.util.Scanner;

public class Main {

	static boolean isPalindrom(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		if (str.equals(reverse)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sorgulanacak string ifadeyi giriniz:");
		String a = scan.next();
		System.out.println(isPalindrom(a));
	}

}
