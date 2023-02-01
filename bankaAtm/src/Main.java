import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName1 = "zeynep", password1 = "brn";
		int right = 3, balance = 1250;
		int select, price;
		while (right != 0) {
			System.out.println("Kullanıcı adınız:");
			String userName = scan.next();
			System.out.println("Şifreniz:");
			String password = scan.next();
			if (password.equals(password1) && userName.equals(userName1)) {
				System.out.println("Patika.dev atmye hoşgeldiniz...");
				System.out.println("1-Para çekme\n2-Para Yatırma\n3-Bakiye sorgulama\n4-Çıkış yapma");
				System.out.println("Lütfen yapacağınız işlemi seçiniz:");
				select = scan.nextInt();
				switch (select) {
				case 1:
					System.out.println("Çekmek istediğiniz miktarı giriniz:");
					price = scan.nextInt();
					if (price > balance) {
						System.out.println("Bakiyenizden fazla para çekemezsiniz");
					} else {
						balance -= price;
					}
					break;
				case 2:
					System.out.println("Yatırmak istediğiniz miktarı giriniz:");
					price = scan.nextInt();
					balance += price;
					break;
				case 3:
					System.out.println("Bakiyeniz:" + balance);
					break;
				case 4:
					System.out.println("Hesaptan çıkış yapılıyor...");
					System.exit(0);
					break;
				default:
					System.out.println("Hatalı seçim yaptınız lütfen tekrar deneyiniz...");
					break;
				}

			} else {
				right--;
				System.out.println("Hatalı kullanıcı adı veya şifre.Tekrar deneyiniz...");
				if (right == 0) {
					System.out.println("Hesabınız bloke olmuştur.Lürfen banka ile iletişime geçiniz...");
				} else {
					System.out.println("Kalan hakkınız:" + right);
				}
			}

		}

	}
}
