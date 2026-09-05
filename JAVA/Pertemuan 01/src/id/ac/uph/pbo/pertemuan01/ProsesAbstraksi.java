package id.ac.uph.pbo.pertemuan01;

public class ProsesAbstraksi {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   PROSES ABSTRAKSI – Satu Objek, Dua Konteks ║");
        System.out.println("╚══════════════════════════════════════════════╝\n");

        System.out.println("Orang yang sama di dunia nyata: 'Sari Wulandari'");
        System.out.println("Diabstraksikan BERBEDA sesuai konteks sistem:\n");

        // ── Konteks 1: Sistem Akademik ───────────────────────────────────────
        System.out.println("── KONTEKS 1: Sistem Akademik ──");
        MahasiswaAkademik sariAkademik =
                new MahasiswaAkademik("Sari Wulandari", "220301002",
                                       3.75, 3, "Sistem Informasi");
        sariAkademik.tampilkanInfo();
        sariAkademik.ambilMataKuliah("Pemrograman Berorientasi Objek");
        sariAkademik.hitungIPK(new double[]{3.5, 4.0, 3.75, 3.8});

        // ── Konteks 2: Sistem Perpustakaan ───────────────────────────────────
        System.out.println("\n── KONTEKS 2: Sistem Perpustakaan ──");
        MahasiswaPerpustakaan sariPustaka =
                new MahasiswaPerpustakaan("Sari Wulandari", "220301002");
        sariPustaka.pinjamBuku("Object-Oriented Software Construction");
        sariPustaka.pinjamBuku("Head First Java");
        sariPustaka.kembalikanBuku(false);   // tepat waktu
        sariPustaka.kembalikanBuku(true);    // terlambat
        sariPustaka.tampilkanInfo();

        System.out.println("\n──────────────────────────────────────────────────");
        System.out.println("KESIMPULAN: Abstraksi = pilih atribut yang RELEVAN");
        System.out.println("           sesuai kebutuhan sistem. Detail yang tidak");
        System.out.println("           relevan (warna baju, hobi) → DIABAIKAN.");
        System.out.println("──────────────────────────────────────────────────");
    }
}
