package id.ac.uph.pbo.pertemuan13;

import java.util.*;

public class Komputer {
    private String merek;
    private int    ram;   // GB

    Komputer(String merek, int ram) {
        this.merek = merek;
        this.ram   = ram;
    }

    // ══════════════════════════════════════════════════════
    // 2. INNER CLASS (Non-static Nested)
    //    Bisa akses semua member outer class (termasuk private)
    // ══════════════════════════════════════════════════════
    class Prosesor {
        private String tipe;
        private int    jumlahCore;

        Prosesor(String tipe, int core) {
            this.tipe       = tipe;
            this.jumlahCore = core;
        }

        void infoProsesor() {
            // Akses langsung ke field outer class (Komputer.this.merek)
            System.out.println("  Prosesor " + tipe + " (" + jumlahCore + " core) "
                    + "di dalam " + merek + " (" + ram + " GB RAM)");
        }
    }

    // ══════════════════════════════════════════════════════
    // 3. STATIC NESTED CLASS
    //    Tidak perlu objek outer untuk dibuat
    //    Tidak bisa akses non-static member outer class
    // ══════════════════════════════════════════════════════
    static class Spesifikasi {
        private String nama;
        private String nilai;

        Spesifikasi(String nama, String nilai) {
            this.nama  = nama;
            this.nilai = nilai;
        }

        @Override public String toString() {
            return String.format("  %-20s : %s", nama, nilai);
        }
    }

    void cetakSpesifikasi() {
        System.out.println("  Komputer: " + merek);
        System.out.println(new Spesifikasi("RAM", ram + " GB"));
    }
}
