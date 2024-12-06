import java.util.Scanner;
public class transposeMatriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris : ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        int kolom = sc.nextInt();

        int matriks[][] = new int[baris][kolom];
        int transpose[][] = new int[kolom][baris];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print( "Elemen [" + i  + "][" + j + "] : ");
                matriks[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriks awal : ");
        for (int i = 0; i < baris; i++) {
            System.out.print("| ");
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j] + " ");
                transpose[j][i] = matriks [i][j];
            }
            System.out.print("|");
            System.out.println();
        }
        
        System.out.println("Matriks Transpose : ");
        for (int i = 0; i < kolom; i++) {
            System.out.print("| ");
            for (int j = 0; j < baris; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
