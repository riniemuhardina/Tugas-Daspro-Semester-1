import java.util.Scanner;
public class Determinan
{
 public static void main(String args[])
  {
	Scanner masuk =  new Scanner(System.in);

	int D, a, b, c;

	System.out.print("masukkan nilai a : ");
	a = masuk.nextInt();

	System.out.print("masukkan nilai  b : ");
	b = masuk.nextInt();
	
	System.out.print("masukkan nilai c : ");
	c = masuk.nextInt();

	D=b*b-(4*a*c);
	if (D==0)
	System.out.print("akar kembar");
	else if (D>0)
	System.out.print("akar beda");
	else if (D<0)
	System.out.print("akar imajiner");
	

 }
}
	