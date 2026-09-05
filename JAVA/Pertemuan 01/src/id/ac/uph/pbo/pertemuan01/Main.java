package id.ac.uph.pbo.pertemuan01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== MENU PRAKTIKUM PERTEMUAN 01 ===");
            System.out.println("1. Jalankan AnalogiDuniaNyata");
            System.out.println("2. Jalankan EmpatPilarOOP");
            System.out.println("3. Jalankan OOPSolusi");
            System.out.println("4. Jalankan PraktekMandiriMobil");
            System.out.println("5. Jalankan ProseduralBermasalah");
            System.out.println("6. Jalankan ProsesAbstraksi");
            System.out.println("7. Jalankan TugasLatihan");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("Input tidak valid!");
                scanner.next(); // clear bad input
                continue;
            }
            
            int pilihan = scanner.nextInt();
            if (pilihan == 0) {
                System.out.println("Keluar dari menu.");
                break;
            }
            
            System.out.println("-------------------------------------------------");
            switch (pilihan) {
                case 1:
                    AnalogiDuniaNyata.main(args);
                    break;
                case 2:
                    EmpatPilarOOP.main(args);
                    break;
                case 3:
                    OOPSolusi.main(args);
                    break;
                case 4:
                    PraktekMandiriMobil.main(args);
                    break;
                case 5:
                    ProseduralBermasalah.main(args);
                    break;
                case 6:
                    ProsesAbstraksi.main(args);
                    break;
                case 7:
                    TugasLatihan.main(args);
                    break;
                default:
                    System.out.println("Pilihan tidak ada di menu.");
            }
            System.out.println("-------------------------------------------------");
        }
        scanner.close();
    }
}
