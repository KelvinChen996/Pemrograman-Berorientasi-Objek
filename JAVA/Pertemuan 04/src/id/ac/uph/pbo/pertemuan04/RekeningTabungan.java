package id.ac.uph.pbo.pertemuan04;

public class RekeningTabungan {
    // private: tidak bisa diakses langsung dari luar
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;
    private int    jumlahTransaksi;

    // Konstruktor
    RekeningTabungan(String nomorRekening, String namaPemilik, double saldoAwal) {
        this.nomorRekening   = nomorRekening;
        this.namaPemilik     = namaPemilik;
        this.jumlahTransaksi = 0;
        this.setSaldo(saldoAwal);   // validasi lewat setter
    }

    // Getter (akses baca)
    String getNomorRekening() { return nomorRekening; }
    String getNamaPemilik()   { return namaPemilik; }
    double getSaldo()         { return saldo; }
    int    getJumlahTransaksi() { return jumlahTransaksi; }

    // Setter dengan validasi
    private void setSaldo(double saldo) {
        if (saldo >= 0) this.saldo = saldo;
        else System.out.println("  ⚠ Saldo awal tidak boleh negatif!");
    }

    // Business method (bukan sekedar getter/setter)
    void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            jumlahTransaksi++;
            System.out.printf("  [SETOR]  Rp%,12.0f → Saldo: Rp%,12.0f%n", jumlah, saldo);
        } else {
            System.out.println("  ⚠ Jumlah setor harus > 0");
        }
    }

    void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("  ⚠ Jumlah tarik harus > 0");
        } else if (jumlah > saldo) {
            System.out.printf("  ⚠ Saldo tidak cukup! Saldo: Rp%,.0f%n", saldo);
        } else {
            saldo -= jumlah;
            jumlahTransaksi++;
            System.out.printf("  [TARIK]  Rp%,12.0f → Saldo: Rp%,12.0f%n", jumlah, saldo);
        }
    }

    void cetakInfo() {
        System.out.println("  ┌── Info Rekening ──────────────────────────┐");
        System.out.println("  │ No. Rekening : " + nomorRekening);
        System.out.println("  │ Pemilik      : " + namaPemilik);
        System.out.printf ("  │ Saldo        : Rp%,.0f%n", saldo);
        System.out.println("  │ Transaksi    : " + jumlahTransaksi + " kali");
        System.out.println("  └───────────────────────────────────────────┘");
    }
}
