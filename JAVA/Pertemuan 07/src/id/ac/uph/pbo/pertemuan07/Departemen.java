package id.ac.uph.pbo.pertemuan07;

public class Departemen {
    private String        nama;
    private Karyawan[] anggota;   // Aggregation: karyawan bisa ada tanpa dept
    private int           jumlah;

    Departemen(String nama, int kapasitas) {
        this.nama    = nama;
        this.anggota = new Karyawan[kapasitas];
        this.jumlah  = 0;
    }

    void tambahAnggota(Karyawan k) {
        if (jumlah < anggota.length) anggota[jumlah++] = k;
    }

    void tampilkan() {
        System.out.println("  Departemen: " + nama + " (" + jumlah + " orang)");
        for (int i = 0; i < jumlah; i++)
            System.out.println("    - " + anggota[i].nama + " (" + anggota[i].jabatan + ")");
    }
}
