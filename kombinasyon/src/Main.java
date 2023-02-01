import java.util.Scanner;

public class Main {
	static int fakt(int a) {
		int toplam = 1;
		for (int i = 1; i <= a; i++) {
			toplam *= i;
		}
		return toplam;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kümenin eleman sayısını yazınız:");
		int n = scan.nextInt();
		System.out.println("Oluşturulacak komninasyonların kaç elemanlı olması istersiniz:");
		int r = scan.nextInt();
		int komb;
		komb = (fakt(n)) / (fakt(r) * fakt(n - r));
		System.out.println("Kombinasyon sonucu:" + komb);

	}

}
