package id.ac.uph.pbo.pertemuan01;

public class Mahasiswa {

    // Atribut bersifat private → tidak bisa diakses langsung dari luar class
    private String nama;
    private String nim;
    private double ipk;

    // ── Constructor: membuat objek Mahasiswa baru ────────────────────────────
    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim  = nim;
        this.setIpk(ipk);   // melalui setter agar tervalidasi
    }

    // ── Setter IPK dengan validasi ───────────────────────────────────────────
    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("⚠  IPK " + ipk + " tidak valid! Harus antara 0.0–4.0."
                    + " IPK tidak diubah.");
        }
    }

    // ── Getter ───────────────────────────────────────────────────────────────
    public String getNama()  { return nama; }
    public String getNim()   { return nim;  }
    public double getIpk()   { return ipk;  }

    // ── Method perilaku ──────────────────────────────────────────────────────
    public void belajar() {
        System.out.println(nama + " sedang belajar.");
    }

    public void hadirKuliah(String mataKuliah) {
        System.out.println(nama + " hadir di kuliah: " + mataKuliah);
    }

    // ── Tampilkan info singkat ───────────────────────────────────────────────
    public void tampilkanInfo() {
        System.out.printf("  Nama : %-20s | NIM : %-12s | IPK : %.2f%n",
                nama, nim, ipk);
    }
}
