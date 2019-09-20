package squentialarray;
import java.util.Scanner;
public class Praktikum_4 {
    public static void main(String[]args)
    {
    Scanner input =new Scanner(System.in);
        String cari;
        int jumlah;
        System.out.print("Masukkan sebuah kata/kalimat: ");
        cari= input.nextLine();
        int a=0;
        for(int i=0;i<cari.length();i++){
            if(cari.charAt(i)=='a'){
                a++;
            }
        }
        System.out.println("Jumlah huruf a = "+a);
        int i=0;
        for(int b=0;b<cari.length();b++){
            if(cari.charAt(b)=='i'){
                i++;
            }
        }
        System.out.println("Jumlah huruf i = "+i);
        int u=0;
        for(int c=0;c<cari.length();c++){
            if(cari.charAt(c)=='u'){
                u++;
            }
        }
        System.out.println("Jumlah huruf u = "+u);
        
        int e=0;
        for(int d=0;d<cari.length();d++){
            if(cari.charAt(d)=='e'){
                e++;
            }
        }
        System.out.println("Jumlah huruf e = "+e);
        int o=0;
        for(int z=0;z<cari.length();z++){
            if(cari.charAt(z)=='o'){
                o++;
            }
        }
        System.out.println("Jumlah huruf o = "+o);
        jumlah=a+i+u+e+o;
        System.out.println("Jumlah semua huruf vokal = "+jumlah);    
    }
}
