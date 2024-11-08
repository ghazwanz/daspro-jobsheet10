import java.util.Scanner;

public class BioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, next;
        int baris, kolom, menu;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("================================= Bioskop =================================");
            System.out.println("Menu 1: Input penonton");
            System.out.println("Menu 2: Lihat daftar penonton");
            System.out.println("Menu 3: keluar");
            System.out.println("===========================================================================");
            System.out.print("Masukkan pilihan menu (1-3): ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        while (true) {
                            System.out.print("Masukkan baris: ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom: ");
                            kolom = sc.nextInt();

                            if (baris > penonton.length || kolom > penonton[0].length) {
                                System.out.println("Kursi tidak tersedia!");
                                System.out.println();
                                continue;
                            } else if( baris<=0 || kolom<=0 ){
                                System.out.println("Input Baris atau kolom tidak valid!");
                                System.out.println();
                                continue;
                            } else if(penonton[baris-1][kolom-1] != null) {
                                System.out.println("Kursi sudah terisi!");
                                System.out.println();
                            }
                            
                            if (penonton[baris - 1][kolom - 1] == null) {
                                break;
                            }
                        }
                        sc.nextLine();

                        System.out.println();
                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();

                        penonton[baris - 1][kolom - 1] = nama;
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.println("Daftar penonton pada baris ke-" + (i + 1));
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("*** \t");
                            } else
                                System.out.printf("%s \t ", penonton[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Program Selesai");
                    break;
                default:
                    System.out.println("Input menu tidak valid!");
                    break;
            }
            if (menu == 3) break;
        }
    }
}