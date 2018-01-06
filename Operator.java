import java.util.Scanner;
public class Operator
{
 public static void main(String args[])
 {

	int A = 7, B = 2, jumlah, kurang, kali, bagi, sisa;
	
	System.out.print("Bilangan 1 : 7 ");
	System.out.print("Bilangan 1 : 2 ");
	
	System.out.println("========Hasil Operator Aritmatika=========");
	

	Scanner masuk = new Scanner(System.in);
	
	jumlah =  A + B;
	System.out.println("Jumlah = " + jumlah);
	kurang =  A - B;
	System.out.println("Kurang = " + kurang);
	kali =  A * B;
	System.out.println("Kali = " + kali);	
	bagi =  A / B;
	System.out.println("Bagi = " + bagi);
	sisa =  A % B;
	System.out.println("Sisa = " + sisa);
 }

}