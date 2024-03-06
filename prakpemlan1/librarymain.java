package prakpemlan1;
import java.util.Scanner;

public class librarymain {
    public static void main(String[] args) {
        library buku= new library();
        Scanner scn = new Scanner(System.in);
        System.out.println("LIBRARY LIST: ");
        System.out.println("1. Teknologi "+ "\n2. Filsafat" +"\n3. Sejarah"+ "\n4. Agama" +"\n5. Psikologi"+ "\n6. Politik" + "\n7. Fiksi");
        System.out.println("Masukkan nomor kategori untuk melihat list buku : ");
        int x = scn.nextInt();

        if (x==1){
            buku.teknologi();
        }
        else if (x==2){
            buku.filsafat();
        }
        else if (x==3){
            buku.sejarah();
        }
        else if (x==4){
            buku.agama();
        }
        else if (x==5){
            buku.psikologi();
        }
        else if (x==6){
            buku.politik();
        }
        else if (x==7){
            buku.fiksi();
        }
        else{
            System.out.println("Silahkan masukkan kategori yang tersedia");
        }
    }


}
