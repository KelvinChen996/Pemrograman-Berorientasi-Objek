package id.ac.uph.pbo.pertemuan14;

public class SistemNilai {
    private String[] dataNim    = {"25SI001", "25SI002", "25SI003"};
    private double[] dataNilai  = {0, 0, 0};

    // throws: deklarasi bahwa method ini bisa lempar NilaiTidakValidException
    void inputNilai(String nim, double nilai) throws NilaiTidakValidException, NimTidakDitemukanException {
        // Validasi: cari NIM
        int idx = -1;
        for (int i = 0; i < dataNim.length; i++) {
            if (dataNim[i].equals(nim)) { idx = i; break; }
        }

        if (idx == -1) throw new NimTidakDitemukanException(nim);   // lempar jika tidak ada

        // Validasi: cek range nilai
        if (nilai < 0 || nilai > 100) throw new NilaiTidakValidException(nilai);

        dataNilai[idx] = nilai;
        System.out.println("  ✓ Nilai " + nilai + " untuk " + nim + " berhasil disimpan.");
    }

    double getNilai(String nim) throws NimTidakDitemukanException {
        for (int i = 0; i < dataNim.length; i++) {
            if (dataNim[i].equals(nim)) return dataNilai[i];
        }
        throw new NimTidakDitemukanException(nim);
    }
}
