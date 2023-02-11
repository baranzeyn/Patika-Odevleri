import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Satır sayisini giriniz:");
		int row = scan.nextInt();
		System.out.println("Sütun sayısını giriniz:");
		int col = scan.nextInt();
		MineSweeper sweeper = new MineSweeper(row, col);

		System.out.println("Oyun oluşturuldu...");
		sweeper.createMineSweeper();
		sweeper.show();
		sweeper.run();
	}

}
