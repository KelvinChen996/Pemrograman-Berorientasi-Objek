package id.ac.uph.pbo.pertemuan02;

public class ElemenDasarJava {

    // ── Konstanta program ────────────────────────────────────────────────────
    static final double PI        = 3.14159265;
    static final int    MAX_NILAI = 100;

    // ── Demo Tipe Data Primitif ──────────────────────────────────────────────
    static void demoPrimitive() {
        System.out.println("\n─── TIPE DATA PRIMITIF ───────────────────────");
        byte   b  = 127;            // 8-bit  : -128 s/d 127
        short  s  = 32_000;         // 16-bit : -32768 s/d 32767
        int    i  = 2_000_000;      // 32-bit
        long   l  = 9_000_000_000L; // 64-bit (huruf L di akhir)
        float  f  = 3.14f;          // 32-bit desimal (huruf f)
        double d  = 3.14159265;     // 64-bit desimal (lebih presisi)
        boolean ok = true;
        char   c  = 'A';

        System.out.println("  byte   b  = " + b);
        System.out.println("  short  s  = " + s);
        System.out.println("  int    i  = " + i);
        System.out.println("  long   l  = " + l);
        System.out.println("  float  f  = " + f);
        System.out.println("  double d  = " + d);
        System.out.println("  boolean ok= " + ok);
        System.out.println("  char   c  = " + c + "  (kode ASCII: " + (int)c + ")");
    }

    // ── Demo Operator ────────────────────────────────────────────────────────
    static void demoOperator() {
        System.out.println("\n─── OPERATOR ────────────────────────────────");
        int a = 10, b = 3;

        System.out.println("Aritmatika (a=10, b=3):");
        System.out.println("  a+b=" + (a+b) + "  a-b=" + (a-b) + "  a*b=" + (a*b));
        System.out.println("  a/b=" + (a/b) + " (integer)  (double)a/b=" + ((double)a/b));
        System.out.println("  a%b=" + (a%b) + " (sisa bagi)");

        System.out.println("Relasional:");
        System.out.println("  a>b:" + (a>b) + "  a<b:" + (a<b) + "  a==b:" + (a==b) + "  a!=b:" + (a!=b));

        System.out.println("Logika:");
        System.out.println("  true && false = " + (true && false));
        System.out.println("  true || false = " + (true || false));
        System.out.println("  !true = " + (!true));

        System.out.println("Assignment singkat:");
        int x = 10;
        x += 5; System.out.println("  x=10, x+=5 → x=" + x);
        x -= 3; System.out.println("  x-=3 → x=" + x);
        x *= 2; System.out.println("  x*=2 → x=" + x);
    }

    // ── Demo Kontrol Alur ────────────────────────────────────────────────────
    static void demoKontrolAlur() {
        System.out.println("\n─── KONTROL ALUR ────────────────────────────");

        // if-else: hitung grade
        double[] nilaiList = {92, 78, 65, 50, 40};
        System.out.println("if-else – Grade Mahasiswa:");
        for (double nilai : nilaiList) {
            String grade;
            if      (nilai >= 85) grade = "A";
            else if (nilai >= 70) grade = "B";
            else if (nilai >= 55) grade = "C";
            else if (nilai >= 40) grade = "D";
            else                  grade = "E (Tidak Lulus)";
            System.out.printf("  Nilai %.0f → Grade %s%n", nilai, grade);
        }

        // switch
        System.out.println("switch – Nama Hari:");
        for (int hari = 1; hari <= 7; hari++) {
            switch (hari) {
                case 1: System.out.print("Senin "); break;
                case 2: System.out.print("Selasa "); break;
                case 3: System.out.print("Rabu "); break;
                case 4: System.out.print("Kamis "); break;
                case 5: System.out.print("Jumat "); break;
                case 6: System.out.print("Sabtu "); break;
                case 7: System.out.print("Minggu "); break;
            }
        }
        System.out.println();

        // for – menghitung FPB
        int p = 48, q = 18;
        System.out.println("for – FPB(" + p + "," + q + "):");
        int fpb = 1;
        for (int k = 1; k <= Math.min(p, q); k++) {
            if (p % k == 0 && q % k == 0) fpb = k;
        }
        System.out.println("  FPB = " + fpb);

        // while – bilangan prima
        System.out.print("while – Bilangan prima ≤ 30: ");
        int num = 2;
        while (num <= 30) {
            boolean prima = true;
            for (int k = 2; k <= Math.sqrt(num); k++) {
                if (num % k == 0) { prima = false; break; }
            }
            if (prima) System.out.print(num + " ");
            num++;
        }
        System.out.println();

        // do-while
        System.out.print("do-while – Pangkat 2 < 1000: ");
        int pot = 1;
        do {
            System.out.print(pot + " ");
            pot *= 2;
        } while (pot < 1000);
        System.out.println();
    }

    // ── Demo Coding Standard ─────────────────────────────────────────────────
    static void demoCodingStandard() {
        System.out.println("\n─── JAVA CODING STANDARD ────────────────────");
        System.out.println("  Class      PascalCase  : MahasiswaBaru, RekeningTabungan");
        System.out.println("  Method     camelCase   : hitungIPK(), getNama(), setUmur()");
        System.out.println("  Variabel   camelCase   : namaLengkap, totalSKS, ipkAkhir");
        System.out.println("  Konstanta  UPPER_SNAKE : MAX_NILAI, PI, MIN_SKS_LULUS");
        System.out.println("  Package    lowercase   : com.uph.pbo, id.ac.uph.si");
        System.out.println();
        System.out.println("  ✗ Salah : class mahasiswa_baru, int Nilai_Akhir");
        System.out.println("  ✓ Benar : class MahasiswaBaru, int nilaiAkhir");
    }

    // ── Demo Access Modifier ─────────────────────────────────────────────────
    static void demoAccessModifier() {
        System.out.println("\n─── ACCESS MODIFIER ─────────────────────────");
        System.out.printf("  %-12s %-12s %-12s %-12s %-12s%n",
                "Modifier", "Class ini", "Package", "Subclass", "Semua");
        System.out.println("  " + "─".repeat(60));
        System.out.printf("  %-12s %-12s %-12s %-12s %-12s%n",
                "public",    "✓", "✓", "✓", "✓");
        System.out.printf("  %-12s %-12s %-12s %-12s %-12s%n",
                "protected", "✓", "✓", "✓", "✗");
        System.out.printf("  %-12s %-12s %-12s %-12s %-12s%n",
                "(default)", "✓", "✓", "✗", "✗");
        System.out.printf("  %-12s %-12s %-12s %-12s %-12s%n",
                "private",   "✓", "✗", "✗", "✗");
    }

    // ── main ─────────────────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   PERTEMUAN 2 – Elemen Dasar PBO dengan Java  ║");
        System.out.println("╚══════════════════════════════════════════════╝");

        demoPrimitive();
        demoOperator();
        demoKontrolAlur();
        demoCodingStandard();
        demoAccessModifier();

        // Demo class Mahasiswa
        System.out.println("\n─── DEMO CLASS Mahasiswa ───────────");
        Mahasiswa[] mhsList = {
            new Mahasiswa("Budi",  21, 3.50),
            new Mahasiswa("Sari",  20, 1.80),
            new Mahasiswa("Andi",  22, 2.75)
        };
        for (Mahasiswa m : mhsList) m.tampilkan();

        System.out.println("\n[Konstanta: PI=" + PI + ", MAX_NILAI=" + MAX_NILAI + "]");
    }
}
