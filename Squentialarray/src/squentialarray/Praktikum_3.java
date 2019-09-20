package squentialarray;
import java.util.Scanner;
public class Praktikum_3 {
    public static void main(String[]args)
    {
        int[]data=new int[]{92,98,76,72,84,101,39};
        Scanner input=new Scanner(System.in);
        System.out.print("Data pada array : ");
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+"\t");
        }
        System.out.println("\nNilai yang merupakan kelipatan tiga : ");
        for(int j=0; j <data.length; j++){
            if(data[j]%3 == 0){
                System.out.println(data[j]);
            }
        }
    }
}
