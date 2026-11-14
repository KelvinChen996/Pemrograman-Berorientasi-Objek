package id.ac.uph.pbo.pertemuan14;

public class NilaiTidakValidException extends Exception {
    private double nilaiInput;

    NilaiTidakValidException(double nilai) {
        super("Nilai " + nilai + " tidak valid! Harus antara 0-100.");
        this.nilaiInput = nilai;
    }

    double getNilaiInput() { return nilaiInput; }
}
