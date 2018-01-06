import java.util.Scanner;
public class UsahadanEk {
	public static void main(String args []) {

System.out.println("=========Usaha dan Energi Kinetik==========");
System.out.println("===========================================");
		
		Scanner scan = new Scanner (System.in);
		System.out.print("masukkan gaya : ");
		int gaya = scan.nextInt();

		System.out.print("masukkan jarak : ");
		int jarak = scan.nextInt();

		int hasil = jarak*gaya;
		System.out.println(" usaha : "+hasil+ "joule");

		
		double rumus = 0.5;
		System.out.print("masukkan massa : ");
		double massa = scan.nextDouble();

		System.out.println("masukkan kecepatan : ");
		double V = scan.nextDouble();

		int pangkat = 2;
		double hasil_pangkat= Math.pow(V,pangkat);
		
		double hasil2 = rumus*massa*hasil_pangkat;
		System.out.println("Energi Kinetik = " +hasil2 );


		
	}
}

