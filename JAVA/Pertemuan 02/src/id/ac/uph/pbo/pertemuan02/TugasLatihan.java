package id.ac.uph.pbo.pertemuan02;

import java.util.Scanner;

public class TugasLatihan {

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("TUGAS LATIHAN MANDIRI - PERTEMUAN 02");
        System.out.println("=========================================\n");

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih menu latihan:");
        System.out.println("1. Cek Bilangan Ganjil/Genap");
        System.out.println("2. Hitung Deret Angka");
        System.out.println("3. Kalkulator Sederhana");
        System.out.print("Pilihan (1-3): ");
        
        int pilihan = scanner.nextInt();
        
        switch (pilihan) {
            case 1:
                cekGanjilGenap(scanner);
                break;
            case 2:
                hitungDeret(scanner);
                break;
            case 3:
                kalkulatorSederhana(scanner);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
        
        scanner.close();
        System.out.println("\nProgram Selesai.");
    }

    // 1. Method untuk cek ganjil genap
    private static void cekGanjilGenap(Scanner sc) {
        System.out.println("\n--- 1. Cek Ganjil / Genap ---");
        System.out.print("Masukkan sebuah angka integer: ");
        int angka = sc.nextInt();
        
        if (angka % 2 == 0) {
            System.out.println("-> " + angka + " adalah bilangan GENAP.");
        } else {
            System.out.println("-> " + angka + " adalah bilangan GANJIL.");
        }
    }

    // 2. Method untuk hitung deret dengan loop (for)
    private static void hitungDeret(Scanner sc) {
        System.out.println("\n--- 2. Hitung Deret Angka ---");
        System.out.print("Masukkan batas maksimal deret: ");
        int batas = sc.nextInt();
        
        int total = 0;
        System.out.print("Deret: ");
        for (int i = 1; i <= batas; i++) {
            System.out.print(i + (i == batas ? "" : " + "));
            total += i;
        }
        System.out.println("\nTotal Jumlah = " + total);
    }

    // 3. Method kalkulator sederhana dengan while
    private static void kalkulatorSederhana(Scanner sc) {
        System.out.println("\n--- 3. Kalkulator Sederhana ---");
        System.out.print("Masukkan angka pertama: ");
        double num1 = sc.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double num2 = sc.nextDouble();
        
        System.out.print("Pilih operasi (+, -, *, /): ");
        char op = sc.next().charAt(0);
        
        double hasil = 0;
        boolean valid = true;
        
        switch(op) {
            case '+': hasil = num1 + num2; break;
            case '-': hasil = num1 - num2; break;
            case '*': hasil = num1 * num2; break;
            case '/': 
                if (num2 != 0) hasil = num1 / num2; 
                else {
                    System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Operasi tidak dikenal!");
                valid = false;
        }
        
        if(valid) {
            System.out.printf("Hasil: %.2f %c %.2f = %.2f\n", num1, op, num2, hasil);
        }
    }
}
