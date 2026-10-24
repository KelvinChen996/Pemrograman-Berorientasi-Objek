package id.ac.uph.pbo.pertemuan07;

public class BayarKartuKredit implements Bayar {
    private String nomorKartu;
    BayarKartuKredit(String nomorKartu) { this.nomorKartu = nomorKartu; }

    @Override
    public boolean prosesPembayaran(double jumlah) {
        System.out.printf("  [Kartu Kredit ***%s] Debit Rp%,.0f → Sukses!%n",
                nomorKartu.substring(nomorKartu.length()-4), jumlah);
        return true;
    }
    @Override public String getMetodePembayaran() { return "Kartu Kredit"; }
}
