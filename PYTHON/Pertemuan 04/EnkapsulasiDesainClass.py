import sys
sys.stdout.reconfigure(encoding='utf-8')
from RekeningTabungan import RekeningTabungan
from Karyawan import Karyawan

def main():
    print("╔══════════════════════════════════════════════╗")
    print("║   PERTEMUAN 4 – Enkapsulasi & Desain Class    ║")
    print("╚══════════════════════════════════════════════╝")

    # ─── Demo RekeningTabungan ────────────────────────────────────────
    print("\n═══ DEMO: RekeningTabungan (Enkapsulasi) ═══")
    rek = RekeningTabungan("BCA-001-2025", "Budi Santoso", 5_000_000)
    rek.cetak_info()

    print("\nTransaksi:")
    rek.setor(2_500_000)
    rek.setor(1_000_000)
    rek.tarik(800_000)
    rek.tarik(20_000_000)   # saldo tidak cukup
    rek.tarik(-500)         # invalid
    print("\nSetelah semua transaksi:")
    rek.cetak_info()

    # ─── Demo Karyawan ─────────────────────────────────────────
    print("\n═══ DEMO: Karyawan (SRP + Validasi) ═══")
    k1 = Karyawan("EMP-001", "Sari Wulandari", "Software Engineer", 8_000_000)
    k2 = Karyawan("EMP-002", "Andi Pratama", "Project Manager", 12_000_000)
    k3 = Karyawan("EMP-003", "Rina", "Intern", 1_500_000) # di bawah minimum

    k1.tambah_lembur(5)
    k2.tambah_lembur(10)

    print("\nSlip Gaji:")
    k1.cetak_slip_gaji()
    k2.cetak_slip_gaji()

    # ─── Prinsip Desain ────────────────────────────────────────────────
    print("\n═══ PRINSIP DESAIN CLASS ═══")
    print("  SRP (Single Responsibility Principle):")
    print("    Setiap class memiliki SATU tanggung jawab utama.")
    print("    RekeningTabungan → urus data & transaksi rekening SAJA.")
    print("    Karyawan  → urus data & penggajian karyawan SAJA.")
    print()
    print("  High Cohesion  : Method di dalam class saling berkaitan erat.")
    print("  Low Coupling   : Class tidak bergantung berlebihan satu sama lain.")
    print("  Enkapsulasi    : private + getter/setter + validasi.")

if __name__ == "__main__":
    main()

