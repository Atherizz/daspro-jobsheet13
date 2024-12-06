package Jobsheet_Matrix;

import java.util.Scanner;
public class MatrixKurang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris matriks pertama: ");
        int row1 = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks pertama: ");
        int kol1 = input.nextInt();
    
        int matriks1[][] = new int[row1][kol1];
        int newMatriks1[][] = new int[row1][kol1];
        System.out.println("Masukkan elemen matriks pertama: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < kol1; j++) {
                System.out.print("Elemen ["+ i +"][" + j +"]: ");    
                matriks1[i][j] = input.nextInt();
                newMatriks1[i][j] = matriks1[i][j];
            }
        }
        System.out.print("Masukkan jumlah baris matriks kedua: ");
        int row2 = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks kedua: ");
        int kol2 = input.nextInt();
        
        int matriks2[][] = new int[row2][kol2];
        int newMatriks2[][] = new int[row1][kol1];
        System.out.println("Masukkan elemen matriks kedua: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < kol2; j++) {
                System.out.print("Elemen ["+ i +"][" + j +"]: ");    
                matriks2[i][j] = input.nextInt();
                newMatriks2[i][j] = matriks2[i][j];
            }
        }
        System.out.println("Hasil penjumlahan matriks: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < kol1; j++) {
                System.out.print(matriks1[i][j] - matriks2[i][j] + " ");
            }
            System.out.println();
        }
            input.close();
    }
}