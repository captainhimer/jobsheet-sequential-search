package squentialarray;
import java.util.Scanner;
public class latihan_1 {
    public static void main(String[] args) {
        String find;
        boolean found = false;
        String[] hewan = new String[]{"Nyambik","Kuda","Kadal","Koceng oren","Perkutut"};
        Scanner data = new Scanner(System.in);
        System.out.print("Masukkan Nama - nama hewan : ");
        find = data.nextLine();
        for (int i=0; i<hewan.length; i++){
            if(find.equalsIgnoreCase(hewan[i])){
                found = true;
                break;
            }
        }
        if(found==true){
            System.out.println("Data ditemukan");
        }else{
            System.out.println("Data tidak ditemukan");
        }
    }
    
}
