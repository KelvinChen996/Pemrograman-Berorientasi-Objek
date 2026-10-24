package id.ac.uph.pbo.pertemuan10;

public class KartuDebit extends BasePayment {
    private String nomorKartu;

    KartuDebit(String pemilik, String nomorKartu, double saldo) {
        super("DEBIT-" + nomorKartu.substring(nomorKartu.length()-4), pemilik, saldo);
        this.nomorKartu = nomorKartu;
    }

    @Override
    public boolean bayar(double jumlah) {
        if (cekSaldo(jumlah)) {
            saldo -= jumlah;
            System.out.printf("  [Kartu Debit ***%s] Bayar Rp%,.0f ✓ (sisa: Rp%,.0f)%n",
                    nomorKartu.substring(nomorKartu.length()-4), jumlah, saldo);
            return true;
        }
        System.out.println("  [Kartu Debit] Saldo tidak cukup!");
        return false;
    }

    @Override public String getInfo() {
        return String.format("Kartu Debit [%s] Pemilik: %s Saldo: Rp%,.0f", id, pemilik, saldo);
    }
}
