import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02();
        for (int i = 0; i < 5; i++) {
            System.out.println("=== Input Mahasiswa ke-" + (i + 1) + " ===");
            System.out.print("NIM   : "); 
            String nim = sc.nextLine();
            System.out.print("Nama  : "); 
            String nama = sc.nextLine();
            System.out.print("Kelas : "); 
            String kelas = sc.nextLine();
            System.out.print("IPK   : "); 
            double ipk = sc.nextDouble();
            sc.nextLine();
            list.tambah(new Mahasiswa02(nim, nama, kelas, ipk));
        }
        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();

        
    }
}