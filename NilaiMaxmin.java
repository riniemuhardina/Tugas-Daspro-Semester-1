import java.util.Scanner;
	public class NilaiMaxmin
{
		public static void main(String[]args) {

		Scanner masuk = new Scanner(System.in);
			int data, a=1, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE, b=0;
		System.out.print("Banyaknya data: ");
		data = masuk.nextInt();
		while (a <= data) {
		System.out.print("Data ke-"+a+ " : ");
		b = masuk.nextInt();
			if (b>max) max=b;
				if (b<min) min=b;
		a++;
	}
		System.out.println("Min: "+ min);
		System.out.println("Max : " + max);
}
}