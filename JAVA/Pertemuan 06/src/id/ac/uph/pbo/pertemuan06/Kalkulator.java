package id.ac.uph.pbo.pertemuan06;

public class Kalkulator {

    // Overloading: semua bernama hitungLuas, tapi signature berbeda
    double hitungLuas(double sisi) {
        return sisi * sisi;   // persegi
    }

    double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;   // persegi panjang
    }

    double hitungLuas(double alas, double tinggi, String bentuk) {
        if (bentuk.equalsIgnoreCase("segitiga")) return 0.5 * alas * tinggi;
        if (bentuk.equalsIgnoreCase("jajaran"))  return alas * tinggi;
        return 0;
    }

    double hitungLuas(double radius, boolean lingkaran) {
        return Math.PI * radius * radius;   // lingkaran
    }

    // Overloading: cetak() dengan tipe berbeda
    void cetak(int nilai)     { System.out.println("  int    : " + nilai); }
    void cetak(double nilai)  { System.out.println("  double : " + nilai); }
    void cetak(String teks)   { System.out.println("  String : " + teks); }
    void cetak(boolean flag)  { System.out.println("  boolean: " + flag); }
}
