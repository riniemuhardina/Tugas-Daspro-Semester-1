import java.util.Scanner;
public class Fibo {
 public static void main(String args[]) {

int a=0,b=1,hasil=0, i=1,c;
Scanner input = new Scanner (System.in);
System.out.println ("Masukkan Deret Fibonacci : ");
c= input.nextInt (); //10
	while(i<=c){
	 a=b;
	 b=hasil;
	 System.out.println(hasil+" ");
	 hasil=a+b;
 	 i++;
  }
 }
}