import java.util.Scanner;

public class Bintang {
    static int counter = 0;
    public static void main(String[] args) {
        
        String prestasi [][] = new String[100][4];
        String kategori [] = {"Nama", "NIM", "Jenis", "Tingkat", "Tahun"};  
        int tahun [] = new int[100];      
        
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
            inputPrestasi(prestasi, kategori, tahun);
            // inputPrestasi(prestasi, kategori);
            break;
            case 2:
            System.out.println("Seluruh Prestasi Yang Tercatat");
            tampilan(prestasi, kategori, tahun);
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
        
        System.out.print("Apakah anda ingin mengakses menu lagi? (y/n) : ");
        lanjut = sc.next();
    } while (lanjut.equalsIgnoreCase("y"));
}
public static void inputPrestasi(String[][] prestasi, String[] kategori, int[] tahun) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan Nama Mahasiswa     : ");
        prestasi[counter][0] = sc.nextLine();
    System.out.print("Masukkan NIM Mahasiswa      : ");
        prestasi[counter][1] = sc.nextLine();
    System.out.print("Masukkan Jenis Prestasi     : ");
        prestasi[counter][2] = sc.nextLine();
    System.out.print("Masukkan Tingkat Prestasi   : ");
        prestasi[counter][3] = sc.nextLine();

        for (int i=0; i<=i;i++){
        System.out.print("Masukkan Tahun Prestasi(2010 - 2024): ");
            tahun[counter] = sc.nextInt();
            if (tahun[counter] >= 2010 && tahun[counter] <= 2024) {
                break;
            } else {
                System.out.println("Tahun tidak valid. Coba lagi!");
            }
        }
    counter++;
    }
    static void tampilan(String prestasi[][], String kategori[], int[] tahun) {

        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < prestasi[0].length; j++) {
                System.out.print(kategori[j] + " : \t" + prestasi[i][j] + " \t | ");
            }          
            System.out.println("Tahun : \t" + tahun[i]);                                                       
        }
    }
}