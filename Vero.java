import java.util.Scanner;

public class Vero {
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
            inputPrestasi(prestasi, kategori);
            break;
            case 2:
            System.out.println("Tampilkan Semua Prestasi");
            showPrestasi(prestasi, kategori);
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

    public static void inputPrestasi (String [][] prestasi, String [] kategori) {
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
        prestasi[counter][4] = sc.nextLine();
        counter++;
    }

    public static void showPrestasi (String [][] prestasi, String[] kategori) {
        for(int i = 0; i < counter; i++) {
            for (int j = 0; j < prestasi[0].length;j++) {
                    System.out.print(kategori[j] + " : " + prestasi[i][j] + " | ");
            }
            System.out.println();
        }
    }
}