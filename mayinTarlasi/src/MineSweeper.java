import java.util.Scanner;

public class MineSweeper {
	Scanner scan = new Scanner(System.in);
	int row, col;
	String[][] matris;

	String bombs[][];
	int[][] near;
	int mine = 0;
	boolean isBomb = false;

	public MineSweeper(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public void createMineSweeper() {
		matris = new String[row][col];
		bombs = new String[row][col];
		near = new int[row][col];
		for (int h = 0; h < row; h++) {
			for (int g = 0; g < col; g++) {
				matris[h][g] = "-";
				bombs[h][g] = "-";
			}
		}
		mine = (int) ((col * row) / 4);

		for (int i = 0; i < mine; i++) {
			int a = (int) (Math.random() * row);
			int b = (int) (Math.random() * col);
			bombs[a][b] = "*";
		}
		for (int k = 0; k < row; k++) {
			for (int l = 0; l < col; l++) {
				int counter = 0;
				if (!(bombs[k][l].equals("*"))) {
					if (l < col - 1) {
						if (bombs[k][l + 1].equals("*")) {
							counter++;
							near[k][l] = counter;
						}
						if (k < row - 1) {
							if (matris[k + 1][l].equals("*")) {
								counter++;
								near[k][l] = counter;
							}
						}
					}
					if (k < row - 1) {
						if (matris[k + 1][l].equals("*")) {
							counter++;
							near[k][l] = counter;
						}
					}
					if (l > 0) {
						if (k < row - 1) {
							if (matris[k + 1][l - 1].equals("*")) {
								counter++;
								near[k][l] = counter;
							}
						}
						if (matris[k][l - 1].equals("*")) {
							counter++;
							near[k][l] = counter;
						}
					}
					if (k > 0 && l > 0) {
						if (matris[k - 1][l - 1].equals("*")) {
							counter++;
							near[k][l] = counter;
						}
					}
					if (k > 0) {
						if (matris[k - 1][l].equals("*")) {
							counter++;
							near[k][l] = counter;
						}
					}
					if (k > 0 && l < col - 1) {
						if (matris[k - 1][l + 1].equals("*")) {
							counter++;
							near[k][l] = counter;
						}
					}

				}

			}

		}

	}

	public void show() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matris[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void run() {
		while (!isBomb) {
			System.out.println("satır no:");
			int row1 = scan.nextInt();
			System.out.println("Sütun no:");
			int col1 = scan.nextInt();
			if ((0 <= row1 && row1 < row) && (0 <= col1 && col1 < col)) {
				if (bombs[row1][col1].equals("*")) {
					isBomb = true;
				} else {
					System.out.println("oyun devam ediyor..");
					matris[row1][col1] = String.valueOf(near[row1][col1]);
					show();
				}
			} else {
				System.out.println("Hatalı tuşlama yaptınız...\nTekrar deneyiniz");
			}

		}
		if (isBomb == true) {
			System.out.println("Oyunu kaybettiniz...");
			System.exit(0);
		}
	}
}