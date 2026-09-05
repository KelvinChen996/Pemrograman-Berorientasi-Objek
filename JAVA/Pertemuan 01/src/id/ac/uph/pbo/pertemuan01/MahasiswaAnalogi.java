package id.ac.uph.pbo.pertemuan01;

public class MahasiswaAnalogi {

    // ── State ────────────────────────────────────────────────────────────────
    private String nama;
    private String nim;
    private double ipk;
    private int    semester;

    // ── Constructor ──────────────────────────────────────────────────────────
    public MahasiswaAnalogi(String nama, String nim, double ipk, int semester) {
        this.nama     = nama;
        this.nim      = nim;
        this.ipk      = ipk;
        this.semester = semester;
    }

    // ── Behavior ─────────────────────────────────────────────────────────────
    public void belajar() {
        System.out.println("[" + nama + "] sedang belajar…");
    }

    public void mengerjakanTugas(String namaTugas) {
        System.out.println("[" + nama + "] mengerjakan tugas: " + namaTugas);
    }

    public void hadirKuliah(String mataKuliah) {
        System.out.println("[" + nama + "] hadir di: " + mataKuliah);
    }

    public void ujian(String mataKuliah) {
        System.out.println("[" + nama + "] mengikuti ujian: " + mataKuliah);
    }

    // ── Tampilkan state ──────────────────────────────────────────────────────
    public void tampilkanState() {
        System.out.println("  Nama     : " + nama);
        System.out.println("  NIM      : " + nim);
        System.out.println("  IPK      : " + ipk);
        System.out.println("  Semester : " + semester);
    }
}
