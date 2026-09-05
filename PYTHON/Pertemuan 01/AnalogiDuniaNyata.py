import sys
sys.stdout.reconfigure(encoding='utf-8')
from Mobil import Mobil
from MahasiswaAnalogi import MahasiswaAnalogi

def main():
    print("╔══════════════════════════════════════════════╗")
    print("║   IDENTITAS, STATE & BEHAVIOR – Analogi Nyata║")
    print("╚══════════════════════════════════════════════╝\n")

    # ═══ OBJEK MOBIL ════════════════════════════════════════════════════
    print("══ Membuat 2 objek Mobil dari class yang sama ══\n")

    mobilA = Mobil("Toyota Avanza", "Merah", 40.0)
    mobilB = Mobil("Honda Jazz",    "Putih", 30.0)

    # IDENTITY: meski atribut bisa sama, objeknya berbeda (alamat memori beda)
    print(f"IDENTITY — apakah mobilA is mobilB? {mobilA is mobilB}")
    print("(Dua Avanza merah pun tetap dua objek BERBEDA)\n")

    # STATE awal
    print("State awal mobilA:")
    mobilA.tampilkan_state()
    print()

    # BEHAVIOR – mobilA beraksi
    print("BEHAVIOR mobilA:")
    mobilA.jalan()
    mobilA.klakson()
    mobilA.berhenti()

    print("\nState mobilA setelah beraksi:")
    mobilA.tampilkan_state()

    print("\n── State mobilB (tidak berubah karena beda objek) ──")
    mobilB.tampilkan_state()

    # ═══ OBJEK MAHASISWA ════════════════════════════════════════════════
    print("\n══ Membuat objek Mahasiswa ══\n")

    sari = MahasiswaAnalogi("Sari", "220301001", 3.75, 3)

    print("State Sari:")
    sari.tampilkan_state()

    print("\nBehavior Sari:")
    sari.belajar()
    sari.mengerjakan_tugas("Tugas Pertemuan 1 – Identifikasi Objek")
    sari.hadir_kuliah("Pemrograman Berorientasi Objek")
    sari.ujian("Sistem Informasi Manajemen")

    print("\n──────────────────────────────────────────────────")
    print("KESIMPULAN: Objek = Identity + State + Behavior.")
    print("           Setiap objek unik & independen satu sama lain.")
    print("──────────────────────────────────────────────────")

if __name__ == "__main__":
    main()

