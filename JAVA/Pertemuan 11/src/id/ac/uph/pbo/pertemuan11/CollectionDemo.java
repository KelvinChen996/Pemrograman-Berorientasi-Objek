package id.ac.uph.pbo.pertemuan11;

import java.util.*;

public class CollectionDemo {

    // ── ArrayList Demo ────────────────────────────────────────────────────────
    static void demoArrayList() {
        System.out.println("\n─── ArrayList (urutan terjaga, boleh duplikat) ───");
        List<String> mataKuliah = new ArrayList<>();
        mataKuliah.add("Pemrograman Berorientasi Objek");
        mataKuliah.add("Basis Data");
        mataKuliah.add("Algoritma dan Struktur Data");
        mataKuliah.add("Pemrograman Web");
        mataKuliah.add("Basis Data");   // duplikat diizinkan

        System.out.println("Setelah add (5 item, ada duplikat):");
        for (int i = 0; i < mataKuliah.size(); i++) {
            System.out.println("  [" + i + "] " + mataKuliah.get(i));
        }

        mataKuliah.remove("Basis Data");   // hapus kemunculan pertama
        System.out.println("\nSetelah remove 'Basis Data' (kemunculan pertama):");
        mataKuliah.forEach(mk -> System.out.println("  - " + mk));

        System.out.println("Berisi 'Pemrograman Web'? " + mataKuliah.contains("Pemrograman Web"));
        System.out.println("Jumlah: " + mataKuliah.size());
    }

    // ── LinkedList Demo ───────────────────────────────────────────────────────
    static void demoLinkedList() {
        System.out.println("\n─── LinkedList (efisien insert/delete di tengah) ───");
        LinkedList<String> antrian = new LinkedList<>();
        antrian.addLast("Mahasiswa A");   // enqueue
        antrian.addLast("Mahasiswa B");
        antrian.addLast("Mahasiswa C");
        antrian.addFirst("Prioritas!");   // tambah di depan

        System.out.println("Antrian layanan:");
        while (!antrian.isEmpty()) {
            System.out.println("  Dilayani: " + antrian.removeFirst());
        }
    }

    // ── Set Demo ──────────────────────────────────────────────────────────────
    static void demoSet() {
        System.out.println("\n─── HashSet (tidak urut, TIDAK BOLEH duplikat) ───");
        Set<String> tags = new HashSet<>();
        tags.add("java");
        tags.add("oop");
        tags.add("programming");
        tags.add("java");       // duplikat DIABAIKAN
        tags.add("oop");        // duplikat DIABAIKAN
        System.out.println("Tags (duplikat otomatis dihapus): " + tags);

        System.out.println("\n─── TreeSet (terurut secara alami) ───");
        TreeSet<Integer> nilai = new TreeSet<>();
        nilai.addAll(Arrays.asList(78, 92, 65, 88, 75, 90, 65, 88));
        System.out.println("Nilai unik terurut: " + nilai);
        System.out.println("Nilai tertinggi: " + nilai.last());
        System.out.println("Nilai terendah: " + nilai.first());

        System.out.println("\n─── LinkedHashSet (urutan insert terjaga, tidak duplikat) ───");
        LinkedHashSet<String> kota = new LinkedHashSet<>();
        kota.add("Medan"); kota.add("Jakarta"); kota.add("Surabaya");
        kota.add("Medan"); kota.add("Bandung");
        System.out.println("Kota (urutan insert): " + kota);
    }

    // ── Map Demo ──────────────────────────────────────────────────────────────
    static void demoMap() {
        System.out.println("\n─── HashMap (pasangan key-value, tidak urut) ───");
        Map<String, Double> nilaiMhs = new HashMap<>();
        nilaiMhs.put("25SI001", 85.5);
        nilaiMhs.put("25SI002", 92.0);
        nilaiMhs.put("25SI003", 78.5);
        nilaiMhs.put("25SI004", 90.0);
        nilaiMhs.put("25SI001", 87.0);   // update nilai NIM yang sama

        System.out.println("Nilai mahasiswa:");
        for (Map.Entry<String, Double> entry : nilaiMhs.entrySet()) {
            System.out.printf("  NIM: %s → Nilai: %.1f%n", entry.getKey(), entry.getValue());
        }
        System.out.println("Nilai 25SI002: " + nilaiMhs.get("25SI002"));
        System.out.println("Ada NIM '25SI005'? " + nilaiMhs.containsKey("25SI005"));

        System.out.println("\n─── TreeMap (key terurut) ───");
        TreeMap<String, String> profil = new TreeMap<>();
        profil.put("email", "budi@uph.edu");
        profil.put("nama", "Budi Santoso");
        profil.put("nim", "25SI001");
        profil.put("prodi", "Sistem Informasi");
        profil.forEach((k, v) -> System.out.printf("  %-10s : %s%n", k, v));

        System.out.println("\n─── Frekuensi kata (penggunaan Map nyata) ───");
        String[] kata = {"java","oop","java","class","oop","java","method","class"};
        Map<String, Integer> frekuensi = new LinkedHashMap<>();
        for (String k : kata) {
            frekuensi.put(k, frekuensi.getOrDefault(k, 0) + 1);
        }
        frekuensi.forEach((k, v) -> System.out.println("  \"" + k + "\" muncul " + v + "x"));
    }

    // ── Sorting Demo ──────────────────────────────────────────────────────────
    static void demoSorting() {
        System.out.println("\n─── Sorting dengan Comparable & Comparator ───");
        List<Siswa> kelas = new ArrayList<>(Arrays.asList(
            new Siswa("Budi Santoso", 85.0, "A"),
            new Siswa("Sari Wulandari", 92.5, "A"),
            new Siswa("Andi Pratama", 78.0, "B"),
            new Siswa("Rina Kusuma", 90.0, "B"),
            new Siswa("Doni Saputra", 85.0, "A")
        ));

        System.out.println("Sebelum sorting:");
        kelas.forEach(s -> System.out.println("  " + s));

        Collections.sort(kelas);   // pakai Comparable (nilai desc)
        System.out.println("\nSetelah sort nilai (desc) via Comparable:");
        kelas.forEach(s -> System.out.println("  " + s));

        kelas.sort(Comparator.comparing(s -> s.nama));  // sort nama asc via Comparator
        System.out.println("\nSetelah sort nama (asc) via Comparator:");
        kelas.forEach(s -> System.out.println("  " + s));
    }

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   PERTEMUAN 11 – Collection Framework         ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        demoArrayList();
        demoLinkedList();
        demoSet();
        demoMap();
        demoSorting();

        System.out.println("\n─── KAPAN PAKAI APA? ────────────────────────");
        System.out.println("  ArrayList  : akses index cepat, urutan penting");
        System.out.println("  LinkedList : sering insert/delete di tengah");
        System.out.println("  HashSet    : cek duplikat cepat, urutan tidak penting");
        System.out.println("  TreeSet    : kumpulan unik terurut");
        System.out.println("  HashMap    : cari data cepat via key");
        System.out.println("  TreeMap    : key terurut otomatis");
    }
}
