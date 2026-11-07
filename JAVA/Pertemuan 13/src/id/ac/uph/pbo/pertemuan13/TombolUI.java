package id.ac.uph.pbo.pertemuan13;

import java.util.*;

public class TombolUI {
    private String label;
    private Aksi   aksiKlik;   // interface

    TombolUI(String label) { this.label = label; }

    void setAksiKlik(Aksi aksi) { this.aksiKlik = aksi; }

    void klik() {
        System.out.print("  [" + label + " diklik] → ");
        if (aksiKlik != null) aksiKlik.lakukan();
        else System.out.println("Tidak ada aksi.");
    }
}
