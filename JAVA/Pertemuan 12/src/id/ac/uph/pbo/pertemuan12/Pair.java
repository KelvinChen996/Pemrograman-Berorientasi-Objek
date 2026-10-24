package id.ac.uph.pbo.pertemuan12;

import java.util.*;

public class Pair<K, V> {
    private K kunci;
    private V nilai;

    Pair(K kunci, V nilai) { this.kunci = kunci; this.nilai = nilai; }

    K getKunci() { return kunci; }
    V getNilai() { return nilai; }

    @Override public String toString() {
        return "(" + kunci + " → " + nilai + ")";
    }
}
