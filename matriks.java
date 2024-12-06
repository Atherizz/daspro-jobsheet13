
import java.util.Scanner;



public class matriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriksA[][] = new int[2][2];

        for (int i = 0; i < matriksA.length; i++) {
            System.out.println("Masukkan Nilai Array ");
            for (int j = 0; j < matriksA[i].length; j++) {
                System.out.println("Elemen " + i + " " + j +" : ");
                matriksA[i][j] = sc.nextInt();
            }
        }

        int determinan;
        int hasilA;
        int hasilb;
        hasilA = matriksA[0][0] * matriksA[1][1];
        hasilb = matriksA[0][1] * matriksA[1][0];
        determinan = hasilA - hasilb;
        System.out.println("Determinan matriks : " + determinan);
    }
}
