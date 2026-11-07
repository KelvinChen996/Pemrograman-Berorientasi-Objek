package id.ac.uph.pbo.pertemuan13;

import java.util.*;

public class InnerClassDemo {

    // ══════════════════════════════════════════════════════
    // 4. LOCAL CLASS (dalam method)
    // ══════════════════════════════════════════════════════
    static void demoLocalClass() {
        System.out.println("\n─── LOCAL CLASS (di dalam method) ───────────");

        // Definisi class LANGSUNG di dalam method
        class KonversiSuhu {
            double celsiusKeF(double c)  { return c * 9/5 + 32; }
            double celsiusKeK(double c)  { return c + 273.15; }
        }

        KonversiSuhu conv = new KonversiSuhu();
        double[] suhu = {0, 25, 37, 100};
        System.out.printf("  %-8s %-10s %-10s%n", "Celsius", "Fahrenheit", "Kelvin");
        System.out.println("  " + "─".repeat(30));
        for (double c : suhu) {
            System.out.printf("  %-8.1f %-10.2f %-10.2f%n", c, conv.celsiusKeF(c), conv.celsiusKeK(c));
        }
    }

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   PERTEMUAN 13 – Inner Class & Anonymous Class║");
        System.out.println("╚══════════════════════════════════════════════╝");

        // ─── 1. Non-static Inner Class ────────────────────────────────
        System.out.println("\n═══ INNER CLASS (Non-static) ═══");
        Komputer laptop = new Komputer("ASUS", 16);
        Komputer.Prosesor cpu = laptop.new Prosesor("Intel Core i7", 12);
        cpu.infoProsesor();
        laptop.cetakSpesifikasi();

        // ─── 2. Static Nested Class ───────────────────────────────────
        System.out.println("\n═══ STATIC NESTED CLASS ═══");
        // Tidak perlu objek Komputer untuk membuat Spesifikasi!
        Komputer.Spesifikasi spek1 = new Komputer.Spesifikasi("Penyimpanan", "512 GB SSD");
        Komputer.Spesifikasi spek2 = new Komputer.Spesifikasi("Layar", "15.6 inch FHD");
        System.out.println(spek1);
        System.out.println(spek2);

        // ─── 3. Local Class ───────────────────────────────────────────
        demoLocalClass();

        // ─── 4. Anonymous Inner Class ─────────────────────────────────
        System.out.println("\n═══ ANONYMOUS INNER CLASS ═══");

        TombolUI btnSimpan  = new TombolUI("Simpan");
        TombolUI btnHapus   = new TombolUI("Hapus");
        TombolUI btnBatal   = new TombolUI("Batal");

        // Setiap tombol punya aksi berbeda, definisi langsung (anonymous)
        btnSimpan.setAksiKlik(new Aksi() {
            @Override
            public void lakukan() {
                System.out.println("Data berhasil disimpan ke database!");
            }
        });

        btnHapus.setAksiKlik(new Aksi() {
            @Override
            public void lakukan() {
                System.out.println("Data dihapus permanen! Harap konfirmasi.");
            }
        });

        btnBatal.setAksiKlik(new Aksi() {
            @Override
            public void lakukan() {
                System.out.println("Operasi dibatalkan. Kembali ke menu.");
            }
        });

        btnSimpan.klik();
        btnHapus.klik();
        btnBatal.klik();

        // ─── 5. Anonymous Class untuk Comparator ──────────────────────
        System.out.println("\n─── Anonymous Inner Class: Comparator ────────");
        String[] kota = {"Medan", "Jakarta", "Bandung", "Surabaya", "Bali"};
        System.out.print("Sebelum sort: "); System.out.println(Arrays.toString(kota));

        Arrays.sort(kota, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return Integer.compare(a.length(), b.length());  // sort by panjang nama
            }
        });
        System.out.print("Sort panjang : "); System.out.println(Arrays.toString(kota));

        // ─── 6. Lambda Expression (alternatif modern anonymous class) ──
        System.out.println("\n═══ LAMBDA EXPRESSION (Java 8+ – alternatif anonymous) ═══");

        // Anonymous class:
        Aksi sapa = new Aksi() {
            @Override public void lakukan() { System.out.println("  [Anonymous] Halo dari anonymous class!"); }
        };

        // Setara dengan Lambda (lebih ringkas):
        Aksi sapaLambda = () -> System.out.println("  [Lambda] Halo dari lambda expression!");

        sapa.lakukan();
        sapaLambda.lakukan();

        // Lambda untuk Comparator
        String[] buah = {"Mangga","Apel","Pisang","Jeruk","Nanas"};
        Arrays.sort(buah, (a, b) -> a.compareToIgnoreCase(b));  // lambda
        System.out.print("  Buah (alpha): "); System.out.println(Arrays.toString(buah));

        // ─── Perbandingan ─────────────────────────────────────────────
        System.out.println("\n─── PERBANDINGAN INNER CLASS ─────────────────");
        System.out.printf("  %-22s %-35s%n", "Jenis", "Kapan Dipakai");
        System.out.println("  " + "─".repeat(57));
        System.out.printf("  %-22s %-35s%n", "Inner Class", "Akses data outer class");
        System.out.printf("  %-22s %-35s%n", "Static Nested Class", "Helper tanpa butuh outer");
        System.out.printf("  %-22s %-35s%n", "Local Class", "Logic khusus di satu method");
        System.out.printf("  %-22s %-35s%n", "Anonymous Inner Class", "Implementasi sekali pakai");
        System.out.printf("  %-22s %-35s%n", "Lambda", "Functional interface (modern)");
    }
}
