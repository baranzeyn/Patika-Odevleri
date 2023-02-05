import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Satır sayısını giriniz:");
		int rows = scan.nextInt();
		System.out.println("Sütun sayısı giriniz:");
		int col = scan.nextInt();
		int[][] array1 = new int[rows][col];
		int[][] array2 = new int[rows][col];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("sayı giriniz:");
				array1[i][j] = scan.nextInt();
				array2[i][j] = array1[i][j];
			}
		}
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(array2[j][i] + "\t");
			}
			System.out.println(" ");
		}

	}

}
