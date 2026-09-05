import sys
sys.stdout.reconfigure(encoding='utf-8')
from MobilPraktek import MobilPraktek

def main():
    print("╔══════════════════════════════════════════════╗")
    print("║   PRAKTEK MANDIRI – Program OOP Pertama       ║")
    print("╚══════════════════════════════════════════════╝\n")

    # ── Membuat dua objek dari class MobilPraktek ────────────────────────
    m1 = MobilPraktek("Honda", "Putih")
    m2 = MobilPraktek("Yamaha", "Hitam")

    print("── Output sesuai slide: ──")
    m1.jalan()       # Honda melaju 60 km/j
    m2.jalan()       # Yamaha melaju 60 km/j
    m1.berhenti()    # Honda berhenti

    print("\n── Info state masing-masing objek: ──")
    print("Objek m1 (Honda):")
    m1.info()
    print("Objek m2 (Yamaha):")
    m2.info()

    # ── Eksperimen tambahan ──────────────────────────────────────────────
    print("\n── Eksperimen: klakson & jalan lagi ──")
    m2.klakson()
    m2.berhenti()
    m1.klakson()

    # ── Membuat objek ketiga ─────────────────────────────────────────────
    print("\n── Membuat objek ke-3: ──")
    m3 = MobilPraktek("Toyota", "Merah")
    m3.jalan()
    m3.klakson()
    m3.berhenti()

    print("\n──────────────────────────────────────────────────")
    print("KEY TAKEAWAY:")
    print("  • m1, m2, m3 dibuat dari class yang SAMA")
    print("  • Masing-masing menyimpan state sendiri (merek, warna, kecepatan)")
    print("  • Method dipanggil lewat titik (dot): m1.jalan()")
    print("──────────────────────────────────────────────────")

if __name__ == "__main__":
    main()

