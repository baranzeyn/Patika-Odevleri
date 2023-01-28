import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// notları alsın if else e göre
		// geçme durumunu boolean veri tipiyle belirlediğimiz değişkene atasın ve
		// sınıfı geçme durumumuzu bassın
		Scanner scan = new Scanner(System.in);
		String dersler[] = { "matematik", "fizik", "kimya", "türkçe", "müzik" };
		int a = dersler.length * 2;
		int[] sonuc = new int[a];
		boolean pass1 = false, pass2 = false, pass3 = false, pass4 = false, pass5 = false, pass = false;

		for (int j = 0; j < dersler.length; j++) {

			for (int i = 1; i <= 2; i++) {

				System.out.println(dersler[j] + " dersinin " + i + ".sınav notunu giriniz:");
				int b = scan.nextInt();
				for (int k = 0; k < (dersler.length * 2); k++) {
					sonuc[k] = b;

				}

			}

		}
		if ((sonuc[0] + sonuc[1]) / 2 >= 50) {
			pass1 = true;
		}
		else if ((sonuc[2] + sonuc[3]) / 2 >= 50) {
			pass2 = true;
		}
		else if ((sonuc[4] + sonuc[5]) / 2 >= 50) {
			pass3 = true;
		}
		else if ((sonuc[6] + sonuc[7]) / 2 >= 50) {
			pass4 = true;
		}
		else if ((sonuc[8] + sonuc[9]) / 2 >= 50) {
			pass5 = true;
		}
		else if ((pass1 == true) && (pass2==true)) {
			if ((pass3 == true) && (pass4==true)) {
				if (pass5 == true) {
					pass = true;
					
				}}
			}
		if(pass==true) {
			System.out.println("Öğrenci sınıfı geçmiştir ");}
		else {
	
					System.out.println("Öğrenci sınıf tekrarı yapmalıdır.");
				}
			}

		}


	 
		
