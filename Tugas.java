import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlPert = 6;
        int jmlResp = 10;
        int survei[][] = new int[jmlPert][jmlResp];
        int i,j;
        double rataTotal;
        double total = 0;
        double rataPert[] = new double[jmlPert];
        double rataResp[] = new double[jmlResp];

        i=0;
        while (i < survei.length) {
            j=0;
            while (j < survei[i].length) {
                System.out.print("Input nilai survei pertanyaan ke-" + (i + 1) + " Responden ke-" + (j + 1) + ": ");
                survei[i][j] = input.nextInt();
                if (survei[i][j] < 0 || survei[i][j] > 5) {
                    System.out.println("Nilai responden tidak valid, input ulang nilai!");
                    continue;
                }
                j++;
            }
            System.out.println();
            i++;
        }
        i=0;
        while (i < survei.length) {
            j=0;
            while (j < survei[i].length) {
                total += survei[i][j];
                rataPert[i] += survei[i][j];
                rataResp[j] += survei[i][j];
                j++;
            }
            rataPert[i] /= jmlResp;
            i++;
        }

        System.out.println();
        i=0;
        while (i < jmlPert) {
            System.out.println("Nilai rata-rata dari survei pertanyaan ke-" + (i + 1) + ": " + rataPert[i]);
            i++;
        }

        System.out.println();
        i=0;
        while (i < jmlResp) {
            rataResp[i] /= jmlPert;
            System.out.println("Nilai rata-rata dari responden ke-" + (i + 1) + ": " + rataResp[i]);
            i++;
        }
        
        System.out.println();
        rataTotal = total / (jmlPert * jmlResp);
        System.out.println("Nilai rata-rata dari seluruh pertanyaan dan responden : " + rataTotal);
    }
}