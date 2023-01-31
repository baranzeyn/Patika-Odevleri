import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Doğduğunuz ayı giriniz:");
		int month = scan.nextInt();
		System.out.println("Doğduğunuz günü giriniz:");
		int day = scan.nextInt();
		boolean day1;
		String[] zodiacS = { "oğlak", "kova", "balık", "koç", "boğa", "ikizler", "yengeç", "aslan", "başak", "terazi",
				"akrep", "yay" };
		boolean month1 = (month < 13) && (0 < month);
		day1 = (day < 32) && (0 < day);
		if ((month % 2 == 0) && (month != 2)) {
			day1 = (day < 31) && (0 < day);
		} else if (month == 2) {
			day1 = (day < 30) && (0 < day);
		}

		if (month1 == day1) {
			switch (month) {
			case 1:
				if ((0 < day) && (day <= 21)) {
					System.out.println("Burcunuz:" + zodiacS[0]);
				} else {
					System.out.println("Burcunuz:" + zodiacS[1]);
				}
				break;
			case 2:
				if ((0 < day) && (day <= 19)) {
					System.out.println("Burcunuz:" + zodiacS[1]);
				} else {
					System.out.println("Burcunuz:" + zodiacS[2]);
				}
				break;
			case 3:
				if ((0 < day) && (day <= 20)) {
					System.out.println("Burcunuz:" + zodiacS[2]);
				} else {
					System.out.println("Burcunuz:" + zodiacS[3]);
				}
				break;
			case 4:
				if ((0 < day) && (day <= 20)) {
					System.out.println("Burcunuz:" + zodiacS[3]);
				} else {
					System.out.println("Burcunuz:" + zodiacS[4]);
				}
				break;
			case 5:
				if ((0 < day) && (day <= 21)) {
					System.out.println("Burcunuz:" + zodiacS[4]);
				} else {
					System.out.println("Burcunuz:" + zodiacS[5]);
				}
				break;
			case 6:
				if ((0 < day) && (day <= 22)) {
					System.out.println("Burcunuz:" + zodiacS[5]);
				} else {
					System.out.println("Burcunuz:" + zodiacS[6]);
				}
				break;
			case 7:
				if ((0 < day) && (day <= 22)) {
					System.out.println("Burcunuz:" + zodiacS[6]);
				} else {
					System.out.println("Burcunuz:" + zodiacS[7]);
				}
				break;
			case 8:
				if ((0 < day) && (day <= 22)) {
					System.out.println("Burcunuz:" + zodiacS[7]);
				} else {
					System.out.println("Burcunuz:" + zodiacS[8]);
				}
				break;
			case 9:
				if ((0 < day) && (day <= 22)) {
					System.out.println("Burcunuz:" + zodiacS[8]);
				} else {
					System.out.println("Burcunuz:" + zodiacS[9]);
				}
				break;
			case 10:
				if ((0 < day) && (day <= 22)) {
					System.out.println("Burcunuz:" + zodiacS[9]);
				} else {
					System.out.println("Burcunuz:" + zodiacS[10]);
				}
				break;
			case 11:
				if ((0 < day) && (day <= 21)) {
					System.out.println("Burcunuz:" + zodiacS[10]);
				} else {
					System.out.println("Burcunuz:" + zodiacS[11]);
				}
				break;
			case 12:
				if ((0 < day) && (day <= 21)) {
					System.out.println("Burcunuz:" + zodiacS[11]);
				} else {
					System.out.println("Burcunuz:" + zodiacS[0]);
				}
				break;
			}
		} else {
			System.out.println("Hatalı tuşlama yaptınız...");
		}
	}
}
