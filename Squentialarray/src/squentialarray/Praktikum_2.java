package squentialarray;
import java.util.Scanner;
public class Praktikum_2 {
    public static void main(String[]args)
    {
        double ratarata = 0;
        int cari;
        int v = 0;
        boolean found = false;
        int[]data=new int[]{83,76,45,90,85,80,78,74};
        Scanner input = new Scanner(System.in);
        System.out.println("Data pada array : ");
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+"\t");
        if(data[i]<v){
                v=data[i];
        }
    }
        for(int i=0;i<data.length;i++)ratarata+=data [i];
             ratarata/=data.length;
             System.out.println("\nRata-rata nilai array = "+ratarata);
             System.out.print("Nilai yang diatas rata-rata adalah :\t ");
             for(int a=0; a<data.length; a++){
                 if(data[a]>ratarata){
                     System.out.print(data[a]+"\t");
                 }
             }
    }
}
