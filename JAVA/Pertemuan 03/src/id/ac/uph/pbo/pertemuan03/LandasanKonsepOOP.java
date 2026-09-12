package id.ac.uph.pbo.pertemuan03;

public class LandasanKonsepOOP {

    // ── Demo Primitif vs Object ───────────────────────────────────────────────
    static void demoPrimVsObject() {
        System.out.println("\n─── PRIMITIF vs OBJECT ──────────────────────");

        // Primitif: disimpan langsung di stack, copy nilai
        int a = 10;
        int b = a;
        b = 99;
        System.out.println("Primitif (int) – copy nilai:");
        System.out.println("  a=" + a + "  b=" + b + " (a tidak terpengaruh perubahan b)");

        // Object: disimpan di heap, variabel menyimpan REFERENSI
        Produk p1 = new Produk("Laptop", 12_000_000, 5);
        Produk p2 = p1;   // p2 merujuk ke OBJEK YANG SAMA
        p2.beli(1);
        System.out.println("Object – copy referensi:");
        System.out.println("  Stok p1 setelah p2.beli(1): " + p1.getStok() + " (sama!)");

        // null
        Produk p3 = null;
        System.out.println("  p3 == null? " + (p3 == null));
    }

    // ── Demo String ───────────────────────────────────────────────────────────
    static void demoString() {
        System.out.println("\n─── TIPE DATA STRING ────────────────────────");
        String s1 = "Pemrograman Berorientasi Objek";
        String s2 = "java";
        String s3 = "  hello world  ";

        System.out.println("  s1 = \"" + s1 + "\"");
        System.out.println("  panjang    : " + s1.length());
        System.out.println("  huruf ke-0 : " + s1.charAt(0));
        System.out.println("  substring(0,11) : " + s1.substring(0, 11));
        System.out.println("  indexOf('B')    : " + s1.indexOf('B'));
        System.out.println("  toUpperCase()   : " + s2.toUpperCase());
        System.out.println("  toLowerCase()   : " + s1.toLowerCase().substring(0,6));
        System.out.println("  trim()          : \"" + s3.trim() + "\"");
        System.out.println("  contains('Java'): " + s1.contains("Java"));
        System.out.println("  startsWith('Pem'): " + s1.startsWith("Pem"));
        System.out.println("  replace: " + s1.replace("Objek", "Object"));

        // String comparison BENAR
        String kata1 = new String("hello");
        String kata2 = new String("hello");
        System.out.println("\n  Perbandingan String:");
        System.out.println("  kata1 == kata2      : " + (kata1 == kata2) + " (SALAH, compare referensi)");
        System.out.println("  kata1.equals(kata2) : " + kata1.equals(kata2) + " (BENAR, compare isi)");
        System.out.println("  equalsIgnoreCase    : " + kata1.equalsIgnoreCase("HELLO"));

        // String formatting
        String info = String.format("Mahasiswa: %-15s | IPK: %.2f | Semester: %d",
                "Budi Santoso", 3.75, 5);
        System.out.println("  String.format: " + info);

        // StringBuilder (efisien untuk banyak concatenation)
        System.out.println("\n  StringBuilder:");
        StringBuilder sb = new StringBuilder();
        sb.append("UPH").append(" - ").append("Sistem Informasi").append(" 2025");
        System.out.println("  " + sb.toString());
    }

    // ── Demo Access Modifier dengan class Produk ─────────────────────────────
    static void demoAccessModifier() {
        System.out.println("\n─── ACCESS MODIFIER – Demo Produk ───────────");
        Produk laptop = new Produk("Laptop ASUS", 8_500_000, 10);
        Produk mouse  = new Produk("Mouse Logitech", 350_000, 50);
        Produk kosong = new Produk("SSD Samsung", 1_200_000, 0);

        System.out.println("Daftar Produk:");
        laptop.info();
        mouse.info();
        kosong.info();

        System.out.println("\nTransaksi Pembelian:");
        laptop.beli(3);
        mouse.beli(200);  // melebihi stok
        kosong.beli(1);   // stok habis

        System.out.println("\nNilai total stok:");
        System.out.printf("  %-20s : Rp%,.0f%n", laptop.getNama(), laptop.totalNilai());
        System.out.printf("  %-20s : Rp%,.0f%n", mouse.getNama(),  mouse.totalNilai());
    }

    // ── Demo instanceof ───────────────────────────────────────────────────────
    static void demoInstanceof() {
        System.out.println("\n─── instanceof ──────────────────────────────");
        Object obj1 = new Produk("TV Samsung", 5_000_000, 3);
        Object obj2 = "Ini sebuah String";
        Object obj3 = Integer.valueOf(42);

        System.out.println("  obj1 instanceof Produk  : " + (obj1 instanceof Produk));
        System.out.println("  obj1 instanceof String  : " + (obj1 instanceof String));
        System.out.println("  obj2 instanceof String  : " + (obj2 instanceof String));
        System.out.println("  obj3 instanceof Integer : " + (obj3 instanceof Integer));
    }

    // ── main ─────────────────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   PERTEMUAN 3 – Landasan Konsep OOP           ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        demoPrimVsObject();
        demoString();
        demoAccessModifier();
        demoInstanceof();
    }
}
