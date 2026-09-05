package id.ac.uph.pbo.pertemuan01;

public class EmpatPilarOOP {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   EMPAT PILAR OOP – Pratinjau Konseptual      ║");
        System.out.println("╚══════════════════════════════════════════════╝\n");

        // ─── PILAR 1: ENCAPSULATION ──────────────────────────────────────────
        System.out.println("══ PILAR 1: ENCAPSULATION ══");
        System.out.println("  Saldo hanya bisa diubah lewat method setor/tarik:\n");
        Rekening rek = new Rekening("Budi", 1_000_000);
        rek.setor(500_000);
        rek.tarik(200_000);
        rek.tarik(2_000_000);   // → ditolak: saldo tidak cukup

        // ─── PILAR 2: INHERITANCE ────────────────────────────────────────────
        System.out.println("\n══ PILAR 2: INHERITANCE ══");
        System.out.println("  MobilListrik mewarisi Mobil yang mewarisi Kendaraan:\n");
        MobilListrik tesla = new MobilListrik("Tesla", 80.0);
        tesla.jalan();    // override jalan() dari Kendaraan
        tesla.jalan();
        tesla.bukaKap();  // method dari MobilWarisan
        tesla.cas();      // method khusus MobilListrik

        // ─── PILAR 3: POLYMORPHISM ───────────────────────────────────────────
        System.out.println("\n══ PILAR 3: POLYMORPHISM ══");
        System.out.println("  Tipe referensi Kendaraan, perilaku berbeda per objek:\n");

        // Array bertipe Kendaraan, tapi berisi objek berbeda-beda
        Kendaraan[] armada = {
            new MobilWarisan("Avanza", 4),
            new Motor("Yamaha"),
            new MobilListrik("BYD", 100.0)
        };

        for (Kendaraan k : armada) {
            k.jalan();   // method yang sama, perilaku berbeda → POLYMORPHISM
        }

        // ─── PILAR 4: ABSTRACTION ────────────────────────────────────────────
        System.out.println("\n══ PILAR 4: ABSTRACTION ══");
        System.out.println("  BangunDatar mendefinisikan kontrak hitungLuas/Keliling:\n");

        BangunDatar[] bentuk = {
            new Persegi(5),
            new Lingkaran(7),
            new SegitigaSiku(3, 4)
        };

        for (BangunDatar b : bentuk) {
            b.tampilkanHasil();   // setiap class implementasi berbeda
        }

        System.out.println("\n──────────────────────────────────────────────────");
        System.out.println("KESIMPULAN: Empat Pilar OOP bekerja bersama untuk");
        System.out.println("  membuat kode yang aman, fleksibel & mudah dikembangkan.");
        System.out.println("──────────────────────────────────────────────────");
    }
}
