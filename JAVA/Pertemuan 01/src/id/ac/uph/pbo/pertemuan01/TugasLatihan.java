package id.ac.uph.pbo.pertemuan01;

public class TugasLatihan {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   TUGAS & LATIHAN – Pertemuan 1               ║");
        System.out.println("╚══════════════════════════════════════════════╝\n");

        // ─── LATIHAN 01: Identifikasi Objek ──────────────────────────────────
        System.out.println("══ LATIHAN 01: Identifikasi Objek (Mudah) ══\n");

        Ponsel hp = new Ponsel("Samsung", "Galaxy A55", 6.6, 5000);
        hp.tampilkanInfo();
        hp.telepon("08123456789");
        hp.ambilFoto();
        System.out.println();

        Tas ransel = new Tas("Eiger", "Hitam", 25.0, 5);
        ransel.tampilkanInfo();
        ransel.masukkanBarang("Laptop");
        ransel.masukkanBarang("Buku OOP");
        ransel.kunci();
        System.out.println();

        JamTangan jam = new JamTangan("Casio", "G-Shock", true);
        jam.tampilkanInfo();
        jam.setWaktu(8, 30);
        jam.tampilkanWaktu();
        jam.aktifkanAlarm(6, 0);

        // ─── LATIHAN 02: Class Buku ───────────────────────────────────────────
        System.out.println("\n══ LATIHAN 02: Class Buku – 3 Objek (Sedang) ══\n");

        Buku buku1 = new Buku(
                "Object-Oriented Software Construction",
                "Bertrand Meyer", 1254);
        Buku buku2 = new Buku(
                "Head First Java",
                "Kathy Sierra & Bert Bates", 722);
        Buku buku3 = new Buku(
                "Clean Code",
                "Robert C. Martin", 431);

        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo();

        // ─── LATIHAN 03: Refactor Prosedural → OOP ────────────────────────────
        System.out.println("\n══ LATIHAN 03: Refactor Prosedural → OOP (Menantang) ══\n");

        System.out.println("  VERSI PROSEDURAL (sebelum refactor):");
        System.out.printf("    Persegi (5)          : Luas = %.2f%n",
                ProseduralLuas.luasPersegi(5));
        System.out.printf("    PersegiPanjang (8x4) : Luas = %.2f%n",
                ProseduralLuas.luasPersegiPanjang(8, 4));
        System.out.printf("    Segitiga (6, 3)      : Luas = %.2f%n",
                ProseduralLuas.luasSegitiga(6, 3));
        System.out.printf("    Lingkaran (7)        : Luas = %.2f%n",
                ProseduralLuas.luasLingkaran(7));

        System.out.println("\n  VERSI OOP (setelah refactor):");
        new PersegiLatihan(5).cetak();
        new PersegiPanjang(8, 4).cetak();
        new SegitigaLatihan(6, 3, 6, 3, Math.sqrt(45)).cetak();
        new LingkaranLatihan(7).cetak();

        System.out.println("\n──────────────────────────────────────────────────");
        System.out.println("Versi OOP lebih terstruktur: setiap bangun datar");
        System.out.println("adalah objek yang tahu cara menghitung dirinya sendiri.");
        System.out.println("──────────────────────────────────────────────────");
    }
}
