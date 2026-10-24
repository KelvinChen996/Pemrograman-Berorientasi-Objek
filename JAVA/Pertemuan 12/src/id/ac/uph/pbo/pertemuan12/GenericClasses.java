package id.ac.uph.pbo.pertemuan12;

import java.util.*;

public class GenericClasses {

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   PERTEMUAN 12 – Generic Classes              ║");
        System.out.println("╚══════════════════════════════════════════════╝");

        // ─── Box<T> ───────────────────────────────────────────────────
        System.out.println("\n═══ Box<T> – Generic Class ═══");
        Box<String>  kotak1 = new Box<>("Teks");
        Box<Integer> kotak2 = new Box<>("Angka");
        Box<Double>  kotak3 = new Box<>("Desimal");

        kotak1.masukkan("Halo Dunia");
        kotak2.masukkan(42);
        kotak3.masukkan(3.14);

        System.out.println(kotak1);
        System.out.println(kotak2);
        System.out.println(kotak3);

        // ─── Pair<K, V> ───────────────────────────────────────────────
        System.out.println("\n═══ Pair<K, V> – 2 Type Parameter ═══");
        Pair<String, Double>  nilaiSiswa = new Pair<>("Budi", 88.5);
        Pair<String, Integer> jumlah     = new Pair<>("Stok Laptop", 15);
        Pair<Integer, String> lookup     = new Pair<>(404, "Not Found");

        System.out.println("  " + nilaiSiswa);
        System.out.println("  " + jumlah);
        System.out.println("  " + lookup);

        // ─── GenericStack<T> ──────────────────────────────────────────
        System.out.println("\n═══ GenericStack<Integer> ═══");
        GenericStack<Integer> stackInt = new GenericStack<>(5);
        stackInt.push(10); stackInt.push(30); stackInt.push(20);
        stackInt.push(50); stackInt.push(40);
        System.out.println("  Max di stack: " + stackInt.max());
        stackInt.pop(); stackInt.pop();
        System.out.println("  Top sekarang: " + stackInt.peek());

        System.out.println("\n═══ GenericStack<String> ═══");
        GenericStack<String> stackStr = new GenericStack<>(4);
        stackStr.push("alpha"); stackStr.push("delta");
        stackStr.push("beta");  stackStr.push("gamma");
        System.out.println("  Max (leksikografi): " + stackStr.max());

        // ─── Generic Repository ───────────────────────────────────────
        System.out.println("\n═══ Repository<Mahasiswa> ═══");
        Repository<Mahasiswa> repo = new Repository<>();
        repo.simpan(new Mahasiswa("25SI001", "Budi Santoso",    3.75));
        repo.simpan(new Mahasiswa("25SI002", "Sari Wulandari",  3.90));
        repo.simpan(new Mahasiswa("25SI003", "Andi Pratama",    3.45));
        repo.tampilkanSemua();

        // ─── Generic Method ───────────────────────────────────────────
        System.out.println("\n═══ Generic Method ═══");
        Integer[] angka = {5, 2, 8, 1, 9, 3};
        String[]  huruf = {"banana", "apple", "cherry", "date"};

        System.out.print("Angka: "); GenericUtil.cetakList(Arrays.asList(angka));
        System.out.println("  Max angka: " + GenericUtil.maks(angka));

        System.out.print("Huruf: "); GenericUtil.cetakList(Arrays.asList(huruf));
        System.out.println("  Max huruf: " + GenericUtil.maks(huruf));

        List<Integer>     listInt  = Arrays.asList(1, 2, 3, 4, 5);
        List<Double>      listDbl  = Arrays.asList(1.1, 2.2, 3.3);
        System.out.println("  Jumlah int list: " + GenericUtil.jumlahkanSemua(listInt));
        System.out.println("  Jumlah dbl list: " + GenericUtil.jumlahkanSemua(listDbl));

        System.out.println("\n─── MENGAPA GENERIC? ─────────────────────────");
        System.out.println("  ✓ Type Safety   : error tipe terdeteksi saat compile, bukan runtime");
        System.out.println("  ✓ Reusability   : satu class/method untuk banyak tipe");
        System.out.println("  ✓ No Casting    : tidak perlu manual (Integer) cast");
        System.out.println("  ✓ Cleaner Code  : kode lebih ekspresif dan mudah dibaca");
    }
}
