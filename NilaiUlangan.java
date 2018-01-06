import java.util.Scanner;

public class NilaiUlangan{
  public static void main(String[] args) {
   
     System.out.println ("           MENGECEK HASIL STUDI "); 

     Scanner in = new Scanner(System.in);

     int a;
     System.out.print(" Nilai ulangan 1 :");
     a=in.nextInt();
   
      int b;
     System.out.print(" Nilai ulangan 2 :");
     b=in.nextInt();

      int c;
     System.out.print(" Nilai ujian     :");
     c=in.nextInt();
    
     int rata2 = (a+b+c) / 3 ;
     System.out.println (" Nilai Akhir     :"+rata2);
    
     String keputusan ="";
    
     if (rata2>75) 
    keputusan+=" Selamat Anda Lulus "; 
    
    else if (rata2>60) 
    keputusan+=" Lulus Bersyarat ( info lebih lanjut hubungi xxxx ) ";
  
    else 
    keputusan+=" Silahkan Mengulang Tahun Depan ";

System.out.println ("            HASIL AKHIR : "+keputusan) ;

    

     
}
      }
       