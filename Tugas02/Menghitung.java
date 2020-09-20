//Pemanggil fungsi scanner
import  java.util.Scanner;

public class Menghitung{

	//Main method
	public static void Menghitung() {

		//Membuat suatu input
		Scanner input = new Scanner(System.in);

		//Input jumlah
		System.out.print("Silahkan Masukkan Nominalnya : ");
		int jumlah = (int) input.nextDouble();

		//Menghitung pecahan 100 ribu
		int ratusRibu = jumlah / 100000;
		int sisa = jumlah % 100000;

		//Menghitung pecahan 50 ribu
		int limapuluhribu = (sisa / 50000);
		sisa = sisa % 50000;

		//Menghitung pecahan 20 ribu
		int duapuluhribu = (sisa / 20000);
		sisa = sisa % 20000;

		//Menghitung pecahan 10 ribu
		int puluhRibu = (sisa / 10000);
		sisa = sisa % 10000;

		//Menghitung pecahan 5 ribu
		int limaribu = (sisa / 5000);
		sisa = sisa % 5000;

		//Menghitung pecahan 2 ribu
		int duaribu = (sisa / 2000);
		sisa = sisa % 2000;

		//Menghitung pecahan seribu
		int seribuan = (sisa / 1000);
		sisa = sisa % 1000;

		//Menghitung pecahan 500 rurpiah
		int limaratus = (sisa / 500);
		sisa = sisa % 500;

		//Menghitung pecahan 200 rupiah
		int duaratus = (sisa / 200);
		sisa = sisa % 2000;

		//Menghitung pecahan 100 rupiah
		int seratus = (sisa / 100);
		sisa = sisa % 100;

		//menghitung pecahan 10 rupiah
		int puluh = (sisa / 10);
		sisa = sisa % 10;

		//Menghitung pecahan sen (1 rupiah)
		int sen = (sisa);

		//Hasil dari input
		if (jumlah <1){
			System.out.println("Maaf, Input Anda Error !!");
		} //Jika < 1

		else {
			System.out.println("Nominal = " + jumlah);
			System.out.println("Rp 100.000 = " + ratusRibu);
			System.out.println("Rp 50.000 = " + limapuluhribu);
			System.out.println("Rp 20.000 = " + duapuluhribu);
			System.out.println("Rp 10.000 = " + puluhRibu);
			System.out.println("Rp 5000 = " + limaribu);
			System.out.println("Rp 2000 = " + duaribu);
			System.out.println("Rp 1.000 = " + seribuan);
			System.out.println("Rp 500 = " + limaratus);
			System.out.println("Rp 200 = " + duaratus);
			System.out.println("Rp 100 = " + seratus);
			System.out.println("Rp 10 = " + puluh);
			System.out.println("Rp 1 = " + sen);
		} //Jika > 1
	}

	//Pemanggil dari semua fungsi
	public static void main(String []args ){
			System.out.println("Hai, Selamat Datang Member !! ");
			Menghitung();
		}
}
