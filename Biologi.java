import java.util.Scanner;
public class Biologi
{
	public static void main(String[] args)
	{


		Scanner masuk = new Scanner(System.in);

System.out.println("=========Ciri Klasifikasi 5 Kingdom=================");
System.out.println("====================================================");

		String kingdom;

		System.out.print("masukan kingdom : ");
		kingdom = masuk.next();

		if(kingdom.equals("monera"))
		{
			System.out.println("ciri : prokariotik");
	
		}
		if(kingdom.equals("protista"))
		{
			System.out.println("ciri : eukariotik");
		}
	
		else if(kingdom.equals("fungi"))
		{
			System.out.println("ciri : tidak berklorofil");
		}
		else if(kingdom.equals("plantae"))
		{	
			System.out.println("ciri : berklorofil");
		}
		else if(kingdom.equals("animalia"))
		{
			System.out.println("ciri : multiseluler");
		}
	}
}