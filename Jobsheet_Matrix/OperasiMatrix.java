package Jobsheet_Matrix;

import java.util.Scanner;

public class OperasiMatrix {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int menu;
        String lanjut;
     
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
            operasiMatrix('+');
            break;
            case 2:
            System.out.println("Pengurangan Matrix");
            operasiMatrix('-');
            break;   
            case 3:
            System.out.println("Perkalian Matrix");
            perkalianMatrix();
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
                inversOrdo3();
                break;
                default:
                System.out.println("Masukkan 2 / 3 saja!");
                break;
            }
            return;
            case 5:
            System.out.println("Transpose Matrix"); 
            transposeMatriks();
            break;
            case 6: 
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

public static void printMatrix(int [][] matrix) {
    for(int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }   
}

public static void showResult (int [][] matrix_1, int [][] matrix_2, int [][] result, char operasi) {
    for (int i = 0; i < result.length; i++) {
        System.out.print("| ");
        for (int j = 0; j < result[0].length; j++) {
            System.out.print(matrix_1[i][j] + " ");
        }
        System.out.print("|");
        if (i == result.length / 2) {
        System.out.print(" " + operasi + " ");
        } else {
            System.out.print("   ");
        }
        System.out.print("| ");
        for (int j = 0; j < result[0].length; j++) {
            System.out.print(matrix_2[i][j] + " ");
        }
        System.out.print("|");
        if (i == result.length / 2) {
            System.out.print(" = ");
            } else {
                System.out.print("   ");
            }
        System.out.print("| ");
        for (int j = 0; j < result[0].length; j++) {
            System.out.print(result[i][j] + " ");
        }
        System.out.print("|");
        System.out.println();
    }
}

public static void inputMatrix(int [][] matrix) {
    for(int i = 0; i < matrix.length; i++) {
        System.out.println("BARIS KE " + (i+1));
        for(int j = 0; j < matrix[0].length; j++) {
            System.out.print( "Elemen [" + i  + "][" + j + "] : ");
            matrix[i][j] = sc.nextInt();
        }
    }
}

public static void operasiMatrix (char operasi) {
    System.out.print("Masukkan jumlah baris matrix : ");
    int baris = sc.nextInt();

    System.out.print("Masukkan jumlah kolom matrix : ");
    int kolom = sc.nextInt();

    int [][]matrix_1 = new int[baris][kolom];
    int [][]matrix_2 = new int[baris][kolom];
    int [][] matrixHasil = new int[baris][kolom];

    System.out.println("Masukkan elemen matrix pertama : ");
    inputMatrix(matrix_1);

    System.out.println("Masukkan elemen matrix kedua : ");
    inputMatrix(matrix_2);

    switch (operasi) {
        case '+':
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matrixHasil[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }
        System.out.println("HASIL PENJUMLAHAN : ");
        showResult(matrix_1, matrix_2, matrixHasil, operasi);;
        break;
        case '-':
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matrixHasil[i][j] = matrix_1[i][j] - matrix_2[i][j];
            }
        }
        System.out.println("HASIL PENGURANGAN : ");
        showResult(matrix_1, matrix_2, matrixHasil, operasi);;
        default:
        break;
    }
}

public static void perkalianMatrix() {

    int row1, kol1, row2, kol2;

    do {
    System.out.print("Masukkan jumlah baris matriks pertama: ");
    row1 = sc.nextInt();
    System.out.print("Masukkan jumlah kolom matriks pertama: ");
    kol1 = sc.nextInt();
    System.out.print("Masukkan jumlah baris matriks kedua: ");
    row2 = sc.nextInt();
    System.out.print("Masukkan jumlah kolom matriks kedua: ");
    kol2 = sc.nextInt(); 
    if (kol1 != row2) {
        System.out.println("Jumlah baris matriks pertama dan kolom matriks kedua harus sama!");
    }
    } while (kol1 != row2);

    int matrix1[][] = new int [row1][kol1];
    int matrix2[][] = new int [row2][kol2];

    System.out.println("Masukkan Elemen pada matriks pertama");
    inputMatrix(matrix1);
    System.out.println("Masukkan Elemen pada matriks kedua");
    inputMatrix(matrix2);

    int hasil[][] = new int[row1][kol2];

    System.out.println("Hasil Perkalian Matriks");
    for (int i = 0; i < row1; i++) {
        for (int j = 0; j < kol2; j++) {
            hasil[i][j] = 0;
            for (int k = 0; k < kol1; k++) {
                hasil[i][j] += matrix1[i][k] * matrix2[k][j];
            }
        }
    }

    printMatrix(hasil);

}

public static void inversOrdo2() {

    int [][] matrix = new int[2][2];

    System.out.println("INPUT MATRIKS");
        inputMatrix(matrix);
        int a = matrix[0][0];
        int b = matrix[0][1];
        int c = matrix[1][0];
        int d = matrix[1][1];

        int b_minus = b * -1;
        int c_minus = c * -1;
        
        double det =  a * d - b * c;
        double pecahan = 1 / det;

        int [][] adjoint = {
            {d, b_minus},
            {c_minus, a}
        };

        double [][] invers = new double[2][2];

        // MENGALIKAN DENGAN ADJOINT
        for(int i = 0; i < invers.length; i++) {
            for (int j = 0; j < invers[0].length;j++) {
                invers[i][j] = pecahan * adjoint[i][j];
            }
        }

        System.out.println("\nINVERS MATRIX");
        for(int i = 0; i < invers.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < invers[0].length; j++) {
                System.out.print(invers[i][j] + " ");
            }
            System.out.print(" | ");
            System.out.println();
        }   
}

public static void inversOrdo3() {
    int [][] matrix = new int[3][3];

    System.out.println("INPUT MATRIKS");
    inputMatrix(matrix);

    int a = matrix[0][0] , b = matrix[0][1] , c = matrix[0][2];
    int d = matrix[1][0] , e = matrix[1][1] , f = matrix[1][2];
    int g = matrix[2][0] , h = matrix[2][1] , i = matrix[2][2];

    double det = ((a*e*i) + (b*f*g) + (c*d*h)) - ((c*e*g) + (a*f*h) + (b*d*i)); 
    double pecahan = 1 / det;

    int det_a = (e*i) - (f*h);
    int det_b = ((d*i) - (f*g)) * -1;
    int det_c = (d*h) - (e*g);
    int det_d = ((b*i) - (c*h)) * -1;
    int det_e = (a*i) - (c*g);
    int det_f = ((a*h) - (b*g)) * -1;
    int det_g = (b*f) - (c*e);
    int det_h = ((a*f) - (c*d)) * -1;
    int det_i = (a*e) - (b*d);

    int [][] kofaktor = {
        {det_a, det_b, det_c},
        {det_d, det_e, det_f},
        {det_g, det_h, det_i}
    };

    int [][] adjoint = new int[3][3];

    // TRANSPOSE MATRIX KOFAKTOR
    for (int j = 0; j < kofaktor[0].length; j++) {
        for (int k = 0; k < kofaktor.length; k++) {
            adjoint[j][k] = kofaktor[k][j];
        }
    }

    double [][] invers = new double[3][3];

    // MENGALIKAN DENGAN ADJOINT
    for(int j = 0; j < invers.length; j++) {
        for (int k = 0; k < invers[0].length;k++) {
            invers[j][k] = pecahan * adjoint[j][k];
        }
    }

    System.out.println("\nINVERS MATRIX");
        for(int j = 0; j < invers.length; j++) {
            System.out.print(" | ");
            for (int k = 0; k < invers[0].length; k++) {
                System.out.print(invers[j][k] + " ");
            }
            System.out.print(" | ");
            System.out.println();
        }   
}


public static void transposeMatriks () {
    System.out.print("Masukkan jumlah Baris : ");
    int baris = sc.nextInt();
    System.out.print("Masukkan jumlah kolom : ");
    int kolom = sc.nextInt();

    int [][] matrix = new int[baris][kolom];

    System.out.println("Input Matrix");
    inputMatrix(matrix);
    System.out.println("Matriks awal : ");
    printMatrix(matrix);
    
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