import java.util.Scanner;

public class Tugas {
    static int counter = 0;
    public static void main(String[] args) {

        String prestasi [][] = new String[100][5];
        String kategori [] = {"Nama", "NIM", "Jenis", "Tingkat", "Tahun"};
        
        
        Scanner sc = new Scanner(System.in);
        int menu;
        String lanjut;

        do {
        System.out.println("==== PENCATATAN PRESTASI MAHASISWA =====");
        System.out.println("1. Tambah Data Prestasi");
        System.out.println("2. Tampilkan Semua Prestasi");
        System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
        System.out.println("4. Keluar");
        
        System.out.print("Pilih menu : ");
        menu = sc.nextInt();

        switch (menu) {
            case 1:
            System.out.println("Tambah Data Prestasi");
            // inputPrestasi(prestasi, kategori);
            break;
            case 2:
            System.out.println("Tampilkan Semua Prestasi");
            // showPrestasi(prestasi, kategori);
            break;   
            case 3:
            System.out.println("Analisis Prestasi");
            break;    
            case 4:
            System.out.println("Keluar");   
            return;
            default:
            System.out.println("Input dari 1 - 4!");
            break;
        }

        System.out.print("Apakah anda ingin mengakses menu lagi? (y/n)");
        lanjut = sc.next();
        } while (lanjut.equalsIgnoreCase("y"));
    }

}