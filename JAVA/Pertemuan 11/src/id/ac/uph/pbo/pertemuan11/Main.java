package id.ac.uph.pbo.pertemuan11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== MENU PRAKTIKUM PERTEMUAN 11 ===");
            System.out.println("1. Jalankan CollectionDemo");
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
                    CollectionDemo.main(args);
                    break;
                default:
                    System.out.println("Pilihan tidak ada di menu.");
            }
            System.out.println("-------------------------------------------------");
        }
        scanner.close();
    }
}
