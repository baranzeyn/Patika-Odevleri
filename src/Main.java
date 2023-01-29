import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String uName = "patika", uPassword = "dev";
		System.out.println("Kullanıcı adınızı giriniz:");
		String uN1 = scan.next();
		System.out.println("Şifrenizi giriniz:");
		String uP1 = scan.next();
		if ((uName.equals(uN1)) && (uPassword.equals(uP1))) {
			System.out.println("Giriş başarılı...");
		} else {
			System.out.println("Bilgileriniz yanlış");
			System.out.println("Şifrenizi resetlemek için 1 i\nÇıkmak için 2'i tuşlayınız");
			int select = scan.nextInt();
			switch (select) {
			case 1:
				System.out.println("yeni parolanızı giriniz:");
				String newPassword = scan.next();
				if (!(newPassword.equals(uP1)) && !(newPassword.equals(uPassword))) {
					uPassword = newPassword;
					System.out.println("Şifreniz başarıyla değiştirildi...");
				} else {
					System.out.println("Şifre oluşturulamadı lütfen tekrar deneyiniz...");
				}
				break;
			case 2:
				System.out.println("Üye giriş sayfası kapatılıyor...");
				System.exit(0);
				break;
			default:
				System.out.println("Hatalı tuşlama yaptınız");
				break;
			}
		}

	}

}
