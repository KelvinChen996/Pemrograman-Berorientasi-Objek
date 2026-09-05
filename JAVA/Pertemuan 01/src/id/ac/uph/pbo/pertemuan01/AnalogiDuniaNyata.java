package id.ac.uph.pbo.pertemuan01;

public class AnalogiDuniaNyata {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   IDENTITAS, STATE & BEHAVIOR – Analogi Nyata║");
        System.out.println("╚══════════════════════════════════════════════╝\n");

        // ═══ OBJEK MOBIL ════════════════════════════════════════════════════
        System.out.println("══ Membuat 2 objek Mobil dari class yang sama ══\n");

        Mobil mobilA = new Mobil("Toyota Avanza", "Merah", 40.0);
        Mobil mobilB = new Mobil("Honda Jazz",    "Putih", 30.0);

        // IDENTITY: meski atribut bisa sama, objeknya berbeda (alamat memori beda)
        System.out.println("IDENTITY — apakah mobilA == mobilB? " + (mobilA == mobilB));
        System.out.println("(Dua Avanza merah pun tetap dua objek BERBEDA)\n");

        // STATE awal
        System.out.println("State awal mobilA:");
        mobilA.tampilkanState();
        System.out.println();

        // BEHAVIOR – mobilA beraksi
        System.out.println("BEHAVIOR mobilA:");
        mobilA.jalan();
        mobilA.klakson();
        mobilA.berhenti();

        System.out.println("\nState mobilA setelah beraksi:");
        mobilA.tampilkanState();

        System.out.println("\n── State mobilB (tidak berubah karena beda objek) ──");
        mobilB.tampilkanState();

        // ═══ OBJEK MAHASISWA ════════════════════════════════════════════════
        System.out.println("\n══ Membuat objek Mahasiswa ══\n");

        MahasiswaAnalogi sari = new MahasiswaAnalogi("Sari", "220301001", 3.75, 3);

        System.out.println("State Sari:");
        sari.tampilkanState();

        System.out.println("\nBehavior Sari:");
        sari.belajar();
        sari.mengerjakanTugas("Tugas Pertemuan 1 – Identifikasi Objek");
        sari.hadirKuliah("Pemrograman Berorientasi Objek");
        sari.ujian("Sistem Informasi Manajemen");

        System.out.println("\n──────────────────────────────────────────────────");
        System.out.println("KESIMPULAN: Objek = Identity + State + Behavior.");
        System.out.println("           Setiap objek unik & independen satu sama lain.");
        System.out.println("──────────────────────────────────────────────────");
    }
}
