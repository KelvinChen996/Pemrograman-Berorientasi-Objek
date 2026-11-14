package id.ac.uph.pbo.pertemuan14;

public class ExceptionHandling {

    // ─── Demo exception bawaan Java ──────────────────────────────────────────
    static void demoExceptionBawaan() {
        System.out.println("\n─── EXCEPTION BAWAAN JAVA ───────────────────");

        // 1. ArithmeticException
        try {
            int hasil = 10 / 0;   // division by zero
        } catch (ArithmeticException e) {
            System.out.println("  [ArithmeticException] " + e.getMessage());
        }

        // 2. NullPointerException
        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println("  [NullPointerException] Variabel s adalah null!");
        }

        // 3. ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[3];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("  [ArrayIndexOutOfBounds] " + e.getMessage());
        }

        // 4. NumberFormatException
        try {
            int angka = Integer.parseInt("bukan angka");
        } catch (NumberFormatException e) {
            System.out.println("  [NumberFormatException] " + e.getMessage());
        }

        // 5. ClassCastException
        try {
            Object obj = "Teks";
            Integer i  = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("  [ClassCastException] Tidak bisa cast String ke Integer");
        }
    }

    // ─── Demo try-catch-finally ───────────────────────────────────────────────
    static void demoTryCatchFinally() {
        System.out.println("\n─── TRY-CATCH-FINALLY ───────────────────────");
        System.out.println("  Finally SELALU dieksekusi (kecuali System.exit()):\n");

        for (int i : new int[]{5, 0, -1}) {
            System.out.println("  Mencoba: 100 / " + i);
            try {
                int hasil = 100 / i;
                if (i < 0) throw new IllegalArgumentException("Pembagi negatif!");
                System.out.println("  → Hasil: " + hasil);
            } catch (ArithmeticException e) {
                System.out.println("  → CATCH ArithmeticException: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("  → CATCH IllegalArgument: " + e.getMessage());
            } finally {
                System.out.println("  → FINALLY selalu jalan.\n");
            }
        }
    }

    // ─── Demo Multi-catch ────────────────────────────────────────────────────
    static void demoMultiCatch() {
        System.out.println("─── MULTI-CATCH BLOCK ───────────────────────");
        String[] data = {"42", "bukan_angka", null, "100"};
        for (String d : data) {
            try {
                System.out.print("  Parse '" + d + "' → ");
                int n = Integer.parseInt(d);   // bisa NumberFormatException atau NPE
                System.out.println(n * 2);
            } catch (NumberFormatException | NullPointerException e) {
                System.out.println("ERROR: " + e.getClass().getSimpleName());
            }
        }
    }

    // ─── Demo Custom Exception ────────────────────────────────────────────────
    static void demoCustomException() {
        System.out.println("\n─── CUSTOM EXCEPTION ────────────────────────");
        SistemNilai sistem = new SistemNilai();

        // Test input nilai
        String[][] tes = {
            {"25SI001", "85.5"},
            {"25SI002", "110"},     // nilai tidak valid
            {"25SI999", "75"},      // NIM tidak ada
            {"25SI003", "90"}
        };

        for (String[] t : tes) {
            try {
                sistem.inputNilai(t[0], Double.parseDouble(t[1]));
            } catch (NilaiTidakValidException e) {
                System.out.println("  ✗ " + e.getMessage());
            } catch (NimTidakDitemukanException e) {
                System.out.println("  ✗ " + e.getMessage());
            }
        }
    }

    // ─── Demo Unchecked Exception ─────────────────────────────────────────────
    static void demoUnchecked() {
        System.out.println("\n─── UNCHECKED EXCEPTION (RuntimeException) ──");
        Rekening rek = new Rekening("Budi", 3_000_000);

        double[] tarikList = {500_000, 5_000_000, -100};
        for (double jumlah : tarikList) {
            try {
                rek.tarik(jumlah);
            } catch (SaldoTidakCukupException e) {
                System.out.println("  ✗ " + e.getMessage());
                System.out.printf("    Kekurangan: Rp%,.0f%n", e.getKekurangan());
            } catch (IllegalArgumentException e) {
                System.out.println("  ✗ " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   PERTEMUAN 14 – Exception Handling           ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println("\nHierarchy:");
        System.out.println("  Throwable");
        System.out.println("  ├── Error          (sistem, tidak perlu ditangani)");
        System.out.println("  └── Exception");
        System.out.println("      ├── Checked    (WAJIB try-catch / throws)");
        System.out.println("      └── RuntimeException (Unchecked, opsional)");

        demoExceptionBawaan();
        demoTryCatchFinally();
        demoMultiCatch();
        demoCustomException();
        demoUnchecked();

        System.out.println("\n─── KESIMPULAN ──────────────────────────────");
        System.out.println("  try        : blok yang mungkin throw exception");
        System.out.println("  catch      : menangkap dan menangani exception");
        System.out.println("  finally    : selalu dieksekusi (untuk cleanup)");
        System.out.println("  throw      : melempar exception secara manual");
        System.out.println("  throws     : deklarasi exception pada method signature");
        System.out.println("  Checked    : harus ditangani (IOException, SQLException)");
        System.out.println("  Unchecked  : opsional (NullPointerException, dll)");
    }
}
