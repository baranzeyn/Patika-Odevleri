import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
	static boolean isFind(int[] k, int value) {
		for (int l : k) {
			if (l == value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] list = { 1, 2, 56, 89, 35, 46, 25, 336, 35, 2, 8, 8, 4, 1, 1, 3, 1 };
		int[] duplicate = new int[list.length];

		int sayac = 0;
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (i != j && list[i] == list[j]) {
					if (!isFind(duplicate, list[i])) {
						duplicate[sayac++] = list[i];
					}
				}
			}
		}
		int[] replay = new int[sayac + 1];

		for (int i = 0; i < sayac + 1; i++) {
			int sayac1 = 0;

			for (int j = 0; j < list.length; j++) {
				if (duplicate[i] == list[j]) {
					sayac1++;
					replay[i] = sayac1;
				}
			}
		}
		for (int i = 0; i < sayac + 1; i++) {
			if (duplicate[i] != 0) {// burada durdurduğum sıfırlar dizide otomatik olarak eklenen sıfırlar
				System.out.println(duplicate[i] + " " + replay[i] + " kez tekrar etmiştir.");
			}
		}

	}
}
