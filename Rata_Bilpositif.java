import java.util.Scanner;
 public class Rata_Bilpositif
{

	public static void main(String args[]){
	
	Scanner masuk = new Scanner(System.in);

		int data, y;
		double rata, nilai, semua;
		System.out.print("Banyaknya data : ");
		data = masuk.nextInt();
		y = 1;
		semua =0;
		nilai =0;
		do {

	System.out.print("Data ke-"+y+" : ");
	nilai = masuk.nextDouble();
	semua +=nilai;
	y++;
	}
	while (y<=data);
	rata =semua/data;
	System.out.print("Rata-rata = "+rata);
	}
}






