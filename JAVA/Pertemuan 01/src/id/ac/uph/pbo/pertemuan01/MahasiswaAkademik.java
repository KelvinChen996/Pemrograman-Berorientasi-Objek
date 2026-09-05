package id.ac.uph.pbo.pertemuan01;

public class MahasiswaAkademik {

    private String nama;
    private String nim;
    private double ipk;
    private int    semester;
    private String programStudi;

    public MahasiswaAkademik(String nama, String nim,
                              double ipk, int semester, String prodi) {
        this.nama         = nama;
        this.nim          = nim;
        this.ipk          = ipk;
        this.semester     = semester;
        this.programStudi = prodi;
    }

    // Proses abstraksi: hanya behaviour yang relevan untuk sistem akademik
    public void ambilMataKuliah(String mk) {
        System.out.println(nama + " mengambil mata kuliah: " + mk);
    }

    public void hitungIPK(double[] nilaiList) {
        double total = 0;
        for (double n : nilaiList) total += n;
        ipk = total / nilaiList.length;
        System.out.printf("%s – IPK diperbarui menjadi: %.2f%n", nama, ipk);
    }

    public void tampilkanInfo() {
        System.out.println("  ┌─ Kartu Akademik ──────────────────────────┐");
        System.out.println("  │ Nama         : " + nama);
        System.out.println("  │ NIM          : " + nim);
        System.out.printf ("  │ IPK          : %.2f%n", ipk);
        System.out.println("  │ Semester     : " + semester);
        System.out.println("  │ Program Studi: " + programStudi);
        System.out.println("  └───────────────────────────────────────────┘");
    }
}
