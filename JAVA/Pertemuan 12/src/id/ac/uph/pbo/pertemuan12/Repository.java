package id.ac.uph.pbo.pertemuan12;

import java.util.*;

public class Repository<T> {
    private List<T> data = new ArrayList<>();

    void simpan(T item)  { data.add(item); System.out.println("  Simpan: " + item); }
    void hapus(T item)   { data.remove(item); }
    T    cari(int index) { return data.get(index); }
    List<T> semuaData()  { return Collections.unmodifiableList(data); }
    int  jumlah()        { return data.size(); }

    void tampilkanSemua() {
        System.out.println("  Repository (" + jumlah() + " item):");
        for (int i = 0; i < data.size(); i++) {
            System.out.println("    [" + i + "] " + data.get(i));
        }
    }
}
