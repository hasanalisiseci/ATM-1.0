import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int bakiye = 1000, islem, out, in;

		System.out.println("İSLEMLER \n1 : Bakiye Sorgulama \n2 : Para Cekme \n3 : Para Yatirma");
		
		while (true) {
			System.out.print("Islem seciniz : ");
			islem = input.nextInt();

			switch (islem) {
			case 1:
				System.out.println("Mevcut Bakiyeniz : " + bakiye);
				break;
			case 2:
				System.out.print("Cekilecek para miktarını giriniz : ");
				out = input.nextInt();
				bakiye -= out;
				System.out.println("Guncel bakiyeniz : " + bakiye);
				break;
			case 3:
				System.out.print("Yatirilcak para miktarini giriniz : ");
				in = input.nextInt();
				bakiye += in;
				System.out.println("Guncel bakiyeniz : " + bakiye);
				break;

			default:
				System.out.println("Gecerli bir islem seciniz");
				break;
			}
			System.out.println("Isleme devam etmek icin 1 Tuslayiniz");
			int repeat = input.nextInt();
			if (repeat == 1) {
				continue;
			} else if (repeat != 1) {
				System.out.println("Cıkılıyor ... ");
				break;
			}
		}

		input.close();
	}

}
