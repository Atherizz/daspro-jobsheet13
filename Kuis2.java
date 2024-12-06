import java.util.Scanner;
public class Kuis2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah baris matriks : ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks : ");
        int kolom = sc.nextInt();
        
        int[][] Matriks = new int[baris][kolom];
        int[][] Matriks2 = new int[baris][kolom];
        int[][] jumlah = new int[baris][kolom];

        System.out.println("Masukkan elemen matriks pertama : ");
        for (int i = 0; i <baris; i++) {
            for (int j = 0; j <kolom ; j++) {
                System.out.print("Elemen [" + i + "][" + j + "] : ");
                Matriks[i][j] = sc.nextInt();
            }
        }
        System.out.println("Masukkan elemen matriks kedua : ");
        for (int i = 0; i <baris; i++) {
            for (int j = 0; j <kolom ; j++) {
                System.out.print("Elemen [" + i + "][" + j + "] : ");
                Matriks2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Penjumlahan matriks : " );
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(Matriks[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(" + ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                jumlah[i][j] = Matriks[i][j] + Matriks2[i][j]; 
                System.out.print("\t" + Matriks2[i][j]);
            }
            System.out.println();
        }
    }
}
// 12 + 12 = hasil
// 34 +  34 = hasil