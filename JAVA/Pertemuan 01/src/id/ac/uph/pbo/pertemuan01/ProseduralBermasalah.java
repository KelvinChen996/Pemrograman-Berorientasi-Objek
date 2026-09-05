package id.ac.uph.pbo.pertemuan01;

public class ProseduralBermasalah {

    // ── Variabel GLOBAL – bisa diakses fungsi mana pun ──────────────────────
    static String[] namaMhs    = new String[100];
    static double[] ipkMhs     = new double[100];
    static int      jumlahMhs  = 0;

    // ── Fungsi untuk menambah mahasiswa (TANPA validasi IPK) ────────────────
    static void tambahMahasiswa(String nama, double ipk) {
        namaMhs[jumlahMhs] = nama;
        ipkMhs[jumlahMhs]  = ipk;   // nilai langsung disimpan, tidak ada validasi!
        jumlahMhs++;
    }

    // ── Fungsi yang bisa "membobol" data IPK secara sembarangan ─────────────
    static void hackIPK(int index) {
        ipkMhs[index] = 4.0;   // tidak ada yang mencegah!
        System.out.println("⚠  IPK indeks ke-" + index
                + " diubah paksa menjadi 4.0 oleh hackIPK()!");
    }

    // ── Tampilkan semua data ─────────────────────────────────────────────────
    static void tampilkanSemuaMahasiswa() {
        System.out.println("\n── Daftar Mahasiswa (Pendekatan Prosedural) ──");
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.printf("  [%d] Nama: %-15s | IPK: %.2f%n",
                    i, namaMhs[i], ipkMhs[i]);
        }
    }

    // ── main: demonstrasi masalah ────────────────────────────────────────────
    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   PENDEKATAN PROSEDURAL – Masalah Nyata      ║");
        System.out.println("╚══════════════════════════════════════════════╝\n");

        // Menambah data mahasiswa
        tambahMahasiswa("Budi Santoso",  3.50);
        tambahMahasiswa("Sari Wulandari", 3.75);
        tambahMahasiswa("Andi Pratama",   2.90);

        System.out.println("Data awal setelah ditambahkan:");
        tampilkanSemuaMahasiswa();

        // ⚠ Masalah: fungsi lain bebas mengubah data langsung!
        System.out.println();
        hackIPK(2);   // mengubah IPK Andi secara paksa

        System.out.println("\nData setelah hackIPK() dipanggil:");
        tampilkanSemuaMahasiswa();

        // ⚠ Bahkan bisa diubah langsung dari luar fungsi!
        System.out.println("\n⚠  Mengubah IPK langsung via array global (indeks 0):");
        ipkMhs[0] = -99.0;   // nilai tidak masuk akal, tapi tidak ada yang mencegah
        tampilkanSemuaMahasiswa();

        System.out.println("\n──────────────────────────────────────────────────");
        System.out.println("KESIMPULAN: Tanpa enkapsulasi, data bisa diubah");
        System.out.println("           dari mana saja & kapan saja → BERBAHAYA!");
        System.out.println("──────────────────────────────────────────────────");
    }
}
