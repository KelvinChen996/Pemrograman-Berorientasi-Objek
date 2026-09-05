package id.ac.uph.pbo.pertemuan01;

public class Rekening {

    private String pemilik;
    private double saldo;   // private → tidak bisa diakses langsung dari luar

    public Rekening(String pemilik, double saldoAwal) {
        this.pemilik = pemilik;
        this.saldo   = saldoAwal;
    }

    // "Pintu resmi" – saldo hanya bisa berubah melalui method berikut:
    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.printf("[%s] Setor Rp%.0f → Saldo: Rp%.0f%n",
                    pemilik, jumlah, saldo);
        }
    }

    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.printf("[%s] Tarik Rp%.0f → Saldo: Rp%.0f%n",
                    pemilik, jumlah, saldo);
        } else {
            System.out.println("[" + pemilik + "] ⚠ Saldo tidak cukup!");
        }
    }

    public double getSaldo() { return saldo; }
    public String getPemilik() { return pemilik; }
}
