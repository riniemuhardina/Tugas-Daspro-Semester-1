import java.util.Scanner;
 public class Batas
{
	public static void main(String[] args)
	{
	Scanner masuk = new Scanner(System.in);
		int awal, akhir, y;
		System.out.print("Masukkan Batas Awal : ");
		awal = masuk.nextInt();
		System.out.print("Masukkan Batas Akhir: ");
		akhir = masuk.nextInt();
			for (y=awal;y<=akhir&&awal%2!=0;y++) {
				System.out.println(y);
		y++;
	}
 }
}


