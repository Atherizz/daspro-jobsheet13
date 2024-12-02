import java.util.Scanner;

public class Vero {
    static int counter = 0;
    public static void main(String[] args) {

        String prestasi [][] = new String[100][4];
        int tahunPrestasi [] = new int [100];
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
            inputPrestasi(prestasi, tahunPrestasi);
            break;
            case 2:
            System.out.println("Tampilkan Semua Prestasi");
            showPrestasi(prestasi, kategori, tahunPrestasi);
            break;   
            case 3:
            System.out.println("Analisis Prestasi");
            analisisPrestasi(prestasi, kategori, tahunPrestasi);
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

    public static void inputPrestasi (String [][] prestasi, int [] tahunPrestasi) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama :");
        prestasi[counter][0] = sc.nextLine();

        System.out.print("Masukkan NIM :");
        prestasi[counter][1] = sc.nextLine();

        System.out.print("Masukkan jenis :");
        prestasi[counter][2] = sc.nextLine();

        System.out.print("Masukkan tingkat :");
        prestasi[counter][3] = sc.nextLine();

        System.out.print("Masukkan tahun :");
        tahunPrestasi[counter] = sc.nextInt();

        while (tahunPrestasi[counter] < 2010 || tahunPrestasi[counter] > 2024) {
            System.out.println("Input tidak valid, coba lagi!");
            System.out.print("Masukkan tahun :");
            tahunPrestasi[counter] = sc.nextInt();
        }

        counter++;
    }

    public static void showPrestasi (String [][] prestasi, String[] kategori, int [] tahunPrestasi) {
        System.out.println("=== DAFTAR SEMUA PRESTASI ===");
        for(int i = 0; i < counter; i++) {
            for (int j = 0; j < prestasi[0].length;j++) {
                    System.out.print(kategori[j] + " : " + prestasi[i][j] + " | ");
            }
                System.out.print("Tahun : " + tahunPrestasi[i] + " | ");
        
            System.out.println();
        }
    }

    public static void analisisPrestasi (String [][] prestasi, String[] kategori, int [] tahunPrestasi) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jenis Prestasi yang ingin dianalsisis : ");
        String jenisPrestasi = sc.nextLine();

        for(int i = 0; i < counter; i++) {
            for (int j = 0; j < prestasi[0].length; j++) {
                if (j == 2) {
                    continue;
                }
                if (prestasi[i][2].equalsIgnoreCase(jenisPrestasi)) {
                    System.out.print(kategori[j] + " : " + prestasi[i][j] + " | ");
                }
            }
            if (prestasi[i][2].equalsIgnoreCase(jenisPrestasi)) {
                System.out.print("Tahun : " + tahunPrestasi[i]);
            }
            System.out.println();
        }
    }
}