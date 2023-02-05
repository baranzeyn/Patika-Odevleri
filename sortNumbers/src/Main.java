import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dizinin eleman sayısı:");
		int number = scan.nextInt();
		int[] numbers = new int[number];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println((i + 1) + ". elemanı giriniz:");
			numbers[i] = scan.nextInt();
		}
		Arrays.sort(numbers);
		// System.out.println(Arrays.toString(numbers));
		for (int i : numbers) {
			System.out.print(i + " ");
		}

	}

}
