package id.ac.uph.pbo.pertemuan14;

public class NimTidakDitemukanException extends Exception {
    NimTidakDitemukanException(String nim) {
        super("NIM '" + nim + "' tidak ditemukan di database.");
    }
}
