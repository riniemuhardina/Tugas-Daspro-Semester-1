import java.util.Scanner;
	public class ModifikasiProgram
{
	public static void main(String args[])
	{
		Scanner masuk = new Scanner(System.in);
	    int i;
		float n, jum, x, rata;
		System.out.print("Banyaknya data : ");
		n = masuk.nextFloat ();
		jum =0;
		for (i=1;i<=n;i++) {
			System.out.print("Data ke-"+i+" : ");
		x=masuk.nextFloat();
		jum += x;
	}
		System.out.println("Jumlah : "+jum);
		rata = jum/n;
		System.out.println("rata-rata : "+rata);
	}
}
		





