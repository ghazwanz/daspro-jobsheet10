import java.util.Scanner;

public class SIAKAD11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlMatkul,jmlSiswa;

        System.out.print("Masukkan jumlah mata kuliah: ");
        jmlMatkul = sc.nextInt();

        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlSiswa = sc.nextInt();

        int[][] nilai = new int[jmlSiswa][jmlMatkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPersiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai matakuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPersiswa/jmlMatkul);
        }

        System.out.println("\n=======================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");

        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j+1) + ": " + totalPerMatkul/jmlSiswa);
        }
    }
}