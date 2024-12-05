package Jobsheet_Matrix;

import java.util.Scanner;

public class OperasiMatrix {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int menu;
        String lanjut;
        int baris, kolom;
        
        do {
            System.out.println("==== OPERASI MATRIX =====");
            System.out.println("1. Penjumlahan Matrix");
            System.out.println("2. Pengurangan Matrix");
            System.out.println("3. Perkalian Matrix");
            System.out.println("4. Invers Matrix");
            System.out.println("5. Transpose Matrix");
            System.out.println("6. Keluar");
            
            System.out.print("Pilih menu : ");
            menu = sc.nextInt();
            
        switch (menu) {
            case 1:
            System.out.println("Penjumlahan Matrix");
            // inputPrestasi(prestasi, kategori, tahun);
            break;
            case 2:
            System.out.println("Pengurangan Matrix");
            // tampilanPrestasi(prestasi, kategori, tahun);
            break;   
            case 3:
            System.out.println("Perkalian Matrix");
            // analisisPrestasi(prestasi, kategori, tahun);
            break;    
            case 4:
            System.out.println("Invers Matrix");   
            System.out.print("Masukkan jumlah ordo : ");
            int ordo = sc.nextInt();

            switch (ordo) {
                case 2:
                inversOrdo2();
                break;  
                case 3:
                // inversOrdo3();
                break;
                default:
                System.out.println("Masukkan 2 / 3 saja!");
                break;
            }
            return;
            case 5:
            System.out.println("Transpose Matrix"); 
            transposeMatriks();
            return;
            default:
            System.out.println("Input dari 1 - 5!");
            break;
        }
        
        System.out.print("Apakah anda ingin mengakses menu lagi? (y/n) : ");
        lanjut = sc.next();
        System.out.println();
    } while (lanjut.equalsIgnoreCase("y"));
}

public static void inversOrdo2() {

    int [][] matrix = new int[2][2];

    System.out.println("INPUT MATRIKS");
        for(int i = 0; i < matrix.length; i++) {
            System.out.println("BARIS KE " + (i+1));
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print( "Elemen [" + i  + "][" + j + "] : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        int A = matrix[0][0];
        int B = matrix[0][1];
        int C = matrix[1][0];
        int D = matrix[1][1];

        int B_minus = B * -1;
        int C_minus = C * -1;
        
        double det =  A * D - B * C;
        double pecahan = 1 / det;

        int [][] adjoint = {
            {D, B_minus},
            {C_minus, A}
        };

        double [][] invers = new double[2][2];

        for(int i = 0; i < invers.length; i++) {
            for (int j = 0; j < invers[0].length;j++) {
                invers[i][j] = pecahan * adjoint[i][j];
            }
        }

        System.out.println("\nTRANSPOSE MATRIX");
        for(int i = 0; i < invers.length; i++) {
            for (int j = 0; j < invers[0].length; j++) {
                System.out.print(invers[i][j] + " ");
            }
            System.out.println();
        }   
}


public static void transposeMatriks () {
    System.out.print("Masukkan jumlah Baris : ");
    int baris = sc.nextInt();
    System.out.print("Masukkan jumlah kolom : ");
    int kolom = sc.nextInt();

    int [][] matrix = new int[baris][kolom];
    for (int i = 0; i < baris; i++) {
        for (int j = 0; j < kolom; j++) {
            System.out.print( "Elemen [" + i  + "][" + j + "] : ");
            matrix[i][j] = sc.nextInt();
        }
    }
    System.out.println("Matriks awal : ");
    for (int i = 0; i < baris; i++) {
        System.out.print("| ");
        for (int j = 0; j < kolom; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.print("|");
        System.out.println();
    }
    
    System.out.println("Matriks Transpose : ");
    for (int i = 0; i < kolom; i++) {
        System.out.print("| ");
        for (int j = 0; j < baris; j++) {
            System.out.print(matrix[j][i] + " ");
        }
        System.out.print("|");
        System.out.println();
    }
}
}