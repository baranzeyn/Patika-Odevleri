import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
	static boolean isFind(int[] array, int value) {
		for (int i : array) {
			if (i == value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] list = { 1, 2, 3, 42, 115, 21, 6, 2, 43, 8, 63, 96, 8 };
		int sayac = 0;
		int[] duplicateEven = new int[list.length];
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if ((i != j) && (list[i] == list[j])) {
					if (list[i] % 2 == 0 && !(isFind(duplicateEven, list[i]))) {
						duplicateEven[sayac++] = list[i];
					}
					break;
				}

			}

		}

		System.out.println(Arrays.toString(duplicateEven));
	}
}