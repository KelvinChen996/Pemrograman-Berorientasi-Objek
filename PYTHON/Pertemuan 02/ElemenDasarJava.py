import sys
sys.stdout.reconfigure(encoding='utf-8')
import math
from Mahasiswa import Mahasiswa

# ── Konstanta program ────────────────────────────────────────────────────
PI = 3.14159265
MAX_NILAI = 100

# ── Demo Tipe Data Primitif ──────────────────────────────────────────────
def demo_primitive():
    print("\n─── TIPE DATA PRIMITIF ───────────────────────")
    b = 127            # Python only has int and float, no byte/short
    s = 32_000
    i = 2_000_000
    l = 9_000_000_000
    f = 3.14
    d = 3.14159265
    ok = True
    c = 'A'

    print(f"  byte   b  = {b}")
    print(f"  short  s  = {s}")
    print(f"  int    i  = {i}")
    print(f"  long   l  = {l}")
    print(f"  float  f  = {f}")
    print(f"  double d  = {d}")
    print(f"  boolean ok= {ok}")
    print(f"  char   c  = {c}  (kode ASCII: {ord(c)})")

# ── Demo Operator ────────────────────────────────────────────────────────
def demo_operator():
    print("\n─── OPERATOR ────────────────────────────────")
    a, b = 10, 3

    print("Aritmatika (a=10, b=3):")
    print(f"  a+b={a+b}  a-b={a-b}  a*b={a*b}")
    print(f"  a/b={a//b} (integer)  (float)a/b={a/b}")
    print(f"  a%b={a%b} (sisa bagi)")

    print("Relasional:")
    print(f"  a>b:{a>b}  a<b:{a<b}  a==b:{a==b}  a!=b:{a!=b}")

    print("Logika:")
    print(f"  true && false = {True and False}")
    print(f"  true || false = {True or False}")
    print(f"  !true = {not True}")

    print("Assignment singkat:")
    x = 10
    x += 5
    print(f"  x=10, x+=5 → x={x}")
    x -= 3
    print(f"  x-=3 → x={x}")
    x *= 2
    print(f"  x*=2 → x={x}")

# ── Demo Kontrol Alur ────────────────────────────────────────────────────
def demo_kontrol_alur():
    print("\n─── KONTROL ALUR ────────────────────────────")

    # if-else: hitung grade
    nilai_list = [92, 78, 65, 50, 40]
    print("if-else – Grade Mahasiswa:")
    for nilai in nilai_list:
        if nilai >= 85:
            grade = "A"
        elif nilai >= 70:
            grade = "B"
        elif nilai >= 55:
            grade = "C"
        elif nilai >= 40:
            grade = "D"
        else:
            grade = "E (Tidak Lulus)"
        print(f"  Nilai {nilai:.0f} → Grade {grade}")

    # match (Python 3.10+) equivalent to switch
    print("switch (match) – Nama Hari:")
    for hari in range(1, 8):
        match hari:
            case 1: print("Senin ", end="")
            case 2: print("Selasa ", end="")
            case 3: print("Rabu ", end="")
            case 4: print("Kamis ", end="")
            case 5: print("Jumat ", end="")
            case 6: print("Sabtu ", end="")
            case 7: print("Minggu ", end="")
    print()

    # for – menghitung FPB
    p, q = 48, 18
    print(f"for – FPB({p},{q}):")
    fpb = 1
    for k in range(1, min(p, q) + 1):
        if p % k == 0 and q % k == 0:
            fpb = k
    print(f"  FPB = {fpb}")

    # while – bilangan prima
    print("while – Bilangan prima ≤ 30: ", end="")
    num = 2
    while num <= 30:
        prima = True
        for k in range(2, int(math.sqrt(num)) + 1):
            if num % k == 0:
                prima = False
                break
        if prima:
            print(f"{num} ", end="")
        num += 1
    print()

    # do-while (simulated in Python)
    print("do-while – Pangkat 2 < 1000: ", end="")
    pot = 1
    while True:
        print(f"{pot} ", end="")
        pot *= 2
        if pot >= 1000:
            break
    print()

# ── Demo Coding Standard ─────────────────────────────────────────────────
def demo_coding_standard():
    print("\n─── PYTHON CODING STANDARD (PEP 8) ────────────────────")
    print("  Class      PascalCase  : MahasiswaBaru, RekeningTabungan")
    print("  Function   snake_case  : hitung_ipk(), get_nama(), set_umur()")
    print("  Variabel   snake_case  : nama_lengkap, total_sks, ipk_akhir")
    print("  Konstanta  UPPER_SNAKE : MAX_NILAI, PI, MIN_SKS_LULUS")
    print("  Package    lowercase   : com.uph.pbo, id.ac.uph.si")
    print()
    print("  ✗ Salah : class mahasiswa_baru, int Nilai_Akhir")
    print("  ✓ Benar : class MahasiswaBaru, nilai_akhir = 10")

# ── Demo Access Modifier ─────────────────────────────────────────────────
def demo_access_modifier():
    print("\n─── ACCESS MODIFIER (Konvensi Python) ─────────────────────────")
    print("Python tidak memiliki access modifier sejati. Menggunakan konvensi:")
    print("  - public: nama_variabel")
    print("  - protected: _nama_variabel (hanya konvensi untuk subclass)")
    print("  - private: __nama_variabel (name mangling)")

# ── main ─────────────────────────────────────────────────────────────────
def main():
    print("╔══════════════════════════════════════════════╗")
    print("║   PERTEMUAN 2 – Elemen Dasar PBO dengan Python║")
    print("╚══════════════════════════════════════════════╝")

    demo_primitive()
    demo_operator()
    demo_kontrol_alur()
    demo_coding_standard()
    demo_access_modifier()

    # Demo class Mahasiswa
    print("\n─── DEMO CLASS Mahasiswa ───────────")
    mhs_list = [
        Mahasiswa("Budi", 21, 3.50),
        Mahasiswa("Sari", 20, 1.80),
        Mahasiswa("Andi", 22, 2.75)
    ]
    for m in mhs_list:
        m.tampilkan()

    print(f"\n[Konstanta: PI={PI}, MAX_NILAI={MAX_NILAI}]")

if __name__ == "__main__":
    main()

