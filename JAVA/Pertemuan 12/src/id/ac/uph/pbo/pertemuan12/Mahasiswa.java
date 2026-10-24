package id.ac.uph.pbo.pertemuan12;

import java.util.*;

public class Mahasiswa {
    String nim, nama; double ipk;
    Mahasiswa(String nim, String nama, double ipk) {
        this.nim=nim; this.nama=nama; this.ipk=ipk;
    }
    @Override public String toString() {
        return String.format("%s | %-18s | IPK: %.2f", nim, nama, ipk);
    }
}
