import sys
sys.stdout.reconfigure(encoding='utf-8')
from MataKuliah import MataKuliah
from Mahasiswa import Mahasiswa

# Demo nilai default (disimulasikan karena Python tidak punya tipe primitif dengan default bawaan otomatis selain tipe default argumen)
def demo_nilai_default():
    print("\n─── NILAI DEFAULT TIPE DATA DI JAVA vs PYTHON ─────────")
    print("Di Python, atribut kelas tidak memiliki nilai default otomatis kecuali diinisialisasi secara eksplisit, biasanya di __init__")
    print("  int      → biasanya diinisialisasi 0")
    print("  float    → biasanya diinisialisasi 0.0")
    print("  bool     → biasanya diinisialisasi False")
    print("  str      → biasanya diinisialisasi '' atau None")
    print("  objek    → biasanya diinisialisasi None")

def main():
    print("╔══════════════════════════════════════════════╗")
    print("║   PERTEMUAN 5 – Konstruktor Default & Non-Default ║")
    print("╚══════════════════════════════════════════════╝")

    # ─── Demo MataKuliah ──────────────────────────────────────────────
    print("\n═══ DEMO: Konstruktor MataKuliah ═══")
    print("Membuat objek dengan konstruktor (argumen default) berbeda:\n")
    mk1 = MataKuliah()                                           # default
    mk2 = MataKuliah(kode="SYS07406", nama="PBO")                # 2-param
    mk3 = MataKuliah(kode="SYS07301", nama="Basis Data", sks=3)  # 3-param
    mk4 = MataKuliah(kode="SYS07100", nama="Kalkulus", sks=3, tipe="Wajib", nilai_min=60.0) # lengkap
    mk5 = MataKuliah(lain=mk4)                                   # copy constructor

    print("\nDaftar Mata Kuliah:")
    print(f"  {'Kode':<12} | {'Nama':<40} | SKS | Tipe     | Min")
    print("  " + "─" * 80)
    mk1.tampilkan()
    mk2.tampilkan()
    mk3.tampilkan()
    mk4.tampilkan()
    mk5.tampilkan()

    # ─── Demo Mahasiswa ─────────────────────────────────────────────
    print("\n═══ DEMO: Konstruktor Mahasiswa Overloading ═══")
    m1 = Mahasiswa("25SI001", "Budi")
    m2 = Mahasiswa("25SI002", "Sari", program_studi="Teknik Informatika")
    m3 = Mahasiswa("25SI003", "Andi", program_studi="Sistem Informasi", tahun_masuk=2024, ipk=3.85)

    m1.set_ipk(3.50)

    print(f"  {'NIM':<12} | {'Nama':<20} | {'Prodi':<20} | Tahun | IPK")
    print("  " + "─" * 80)
    m1.tampilkan()
    m2.tampilkan()
    m3.tampilkan()

    # ─── Nilai default ────────────────────────────────────────────────
    demo_nilai_default()

    print("\n─── KESIMPULAN ──────────────────────────────")
    print("  Konstruktor Default     : argumen opsional/default pada __init__")
    print("  Konstruktor Non-Default : mengisi argumen spesifik")
    print("  Overloading Konstruktor : menggunakan default parameters pada Python")
    print("  self                    : digunakan untuk merujuk ke instance saat ini")
    print("  Copy Constructor        : disimulasikan dengan argumen opsional 'lain'")

if __name__ == "__main__":
    main()

