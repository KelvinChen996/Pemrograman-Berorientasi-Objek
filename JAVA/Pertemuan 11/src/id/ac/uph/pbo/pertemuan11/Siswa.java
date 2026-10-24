package id.ac.uph.pbo.pertemuan11;

import java.util.*;

public class Siswa implements Comparable<Siswa> {
    String nama;
    double nilai;
    String kelas;

    Siswa(String nama, double nilai, String kelas) {
        this.nama  = nama;
        this.nilai = nilai;
        this.kelas = kelas;
    }

    @Override
    public int compareTo(Siswa lain) {
        return Double.compare(lain.nilai, this.nilai);  // urut nilai desc
    }

    @Override public String toString() {
        return String.format("%-18s | Nilai: %5.1f | Kelas: %s", nama, nilai, kelas);
    }
}
