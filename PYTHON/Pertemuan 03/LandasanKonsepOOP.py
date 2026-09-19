import sys
sys.stdout.reconfigure(encoding='utf-8')
from Produk import Produk

# ── Demo Primitif vs Object ───────────────────────────────────────────────
def demo_prim_vs_object():
    print("\n─── PRIMITIF vs OBJECT ──────────────────────")

    # Primitif (di Python tipe int immutable, jadi mirip perilaku primitif di Java)
    a = 10
    b = a
    b = 99
    print("Primitif (int) – copy nilai:")
    print(f"  a={a}  b={b} (a tidak terpengaruh perubahan b)")

    # Object: disimpan di heap, variabel menyimpan REFERENSI
    p1 = Produk("Laptop", 12_000_000, 5)
    p2 = p1   # p2 merujuk ke OBJEK YANG SAMA
    p2.beli(1)
    print("Object – copy referensi:")
    print(f"  Stok p1 setelah p2.beli(1): {p1.stok} (sama!)")

    # None (analog dengan null)
    p3 = None
    print(f"  p3 is None? {p3 is None}")

# ── Demo String ───────────────────────────────────────────────────────────
def demo_string():
    print("\n─── TIPE DATA STRING ────────────────────────")
    s1 = "Pemrograman Berorientasi Objek"
    s2 = "python"
    s3 = "  hello world  "

    print(f"  s1 = \"{s1}\"")
    print(f"  panjang    : {len(s1)}")
    print(f"  huruf ke-0 : {s1[0]}")
    print(f"  substring(0,11) : {s1[0:11]}")
    print(f"  indexOf('B')    : {s1.find('B')}")
    print(f"  toUpperCase()   : {s2.upper()}")
    print(f"  toLowerCase()   : {s1.lower()[0:6]}")
    print(f"  trim()          : \"{s3.strip()}\"")
    print(f"  contains('Ber'): {'Ber' in s1}")
    print(f"  startsWith('Pem'): {s1.startswith('Pem')}")
    print(f"  replace: {s1.replace('Objek', 'Object')}")

    # String comparison
    kata1 = "hello"
    kata2 = "hello"
    print("\n  Perbandingan String:")
    print(f"  kata1 is kata2      : {kata1 is kata2} (compare referensi)")
    print(f"  kata1 == kata2      : {kata1 == kata2} (compare isi)")
    print(f"  equalsIgnoreCase    : {kata1.lower() == 'HELLO'.lower()}")

    # String formatting
    info = f"Mahasiswa: {'Budi Santoso':<15} | IPK: {3.75:.2f} | Semester: {5}"
    print(f"  String.format/f-string: {info}")

    # StringBuilder (di Python biasanya menggunakan list join atau +=)
    print("\n  StringBuilder (List Join):")
    sb = []
    sb.append("UPH")
    sb.append(" - ")
    sb.append("Sistem Informasi")
    sb.append(" 2025")
    print(f"  {''.join(sb)}")

# ── Demo Access Modifier dengan class Produk ─────────────────────────────
def demo_access_modifier():
    print("\n─── ACCESS MODIFIER – Demo Produk ───────────")
    laptop = Produk("Laptop ASUS", 8_500_000, 10)
    mouse  = Produk("Mouse Logitech", 350_000, 50)
    kosong = Produk("SSD Samsung", 1_200_000, 0)

    print("Daftar Produk:")
    laptop.info()
    mouse.info()
    kosong.info()

    print("\nTransaksi Pembelian:")
    laptop.beli(3)
    mouse.beli(200)  # melebihi stok
    kosong.beli(1)   # stok habis

    print("\nNilai total stok:")
    print(f"  {laptop.nama:<20} : Rp{laptop.total_nilai():,.0f}")
    print(f"  {mouse.nama:<20} : Rp{mouse.total_nilai():,.0f}")

# ── Demo isinstance ───────────────────────────────────────────────────────
def demo_isinstance():
    print("\n─── isinstance ──────────────────────────────")
    obj1 = Produk("TV Samsung", 5_000_000, 3)
    obj2 = "Ini sebuah String"
    obj3 = 42

    print(f"  isinstance(obj1, Produk) : {isinstance(obj1, Produk)}")
    print(f"  isinstance(obj1, str)    : {isinstance(obj1, str)}")
    print(f"  isinstance(obj2, str)    : {isinstance(obj2, str)}")
    print(f"  isinstance(obj3, int)    : {isinstance(obj3, int)}")

# ── main ─────────────────────────────────────────────────────────────────
def main():
    print("╔══════════════════════════════════════════════╗")
    print("║   PERTEMUAN 3 – Landasan Konsep OOP           ║")
    print("╚══════════════════════════════════════════════╝")
    demo_prim_vs_object()
    demo_string()
    demo_access_modifier()
    demo_isinstance()

if __name__ == "__main__":
    main()

