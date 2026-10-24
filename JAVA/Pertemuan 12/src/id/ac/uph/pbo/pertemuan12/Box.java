package id.ac.uph.pbo.pertemuan12;

import java.util.*;

public class Box<T> {
    private T isi;
    private String label;

    Box(String label) { this.label = label; }

    void masukkan(T item) {
        this.isi = item;
        System.out.println("  [Box:" + label + "] Diisi: " + item);
    }

    T ambil() {
        System.out.println("  [Box:" + label + "] Diambil: " + isi);
        return isi;
    }

    boolean kosong() { return isi == null; }

    @Override public String toString() {
        return "Box[" + label + "] isi: " + (isi != null ? isi : "KOSONG");
    }
}
