package id.ac.uph.pbo.pertemuan06;

class Buku {
    public void cekKetersediaan(int stok) {
        System.out.println("Stok: " + stok);
    }
}
 
class BukuDigital extends Buku {
    @Override
    public void cekKetersediaan(int stok) {
        System.out.println("Tersedia (format digital) dengan stok: " + stok);
    }
}

public class Latihan {
    public static void main(String[] args) {
        Buku buku = new Buku();
        buku.cekKetersediaan(10); // Output: Stok: 10

        BukuDigital bukuDigital = new BukuDigital();
        bukuDigital.cekKetersediaan(5); // Output: Tersedia (format digital) dengan stok: 5
    }
}
