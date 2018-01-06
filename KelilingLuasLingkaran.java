import java.util.Scanner;

public class KelilingLuasLingkaran
{
 public static void main (String[]args)
{

	Scanner masuk = new Scanner(System.in);
	int r;
	double keliling, luas;
	double phi = 3.14;
	
	System.out.print("masukkan nilai r : ");
	r = masuk.nextInt();

	keliling = 2*phi*r;
	luas = phi*r*r;
	
	System.out.println("keliling = "+ keliling);
	System.out.println("luas = "+ luas);
 }
}