import sys
sys.stdout.reconfigure(encoding='utf-8')
# Variabel GLOBAL – bisa diakses fungsi mana pun
nama_mhs = []
ipk_mhs = []
jumlah_mhs = 0

def tambah_mahasiswa(nama: str, ipk: float):
    global jumlah_mhs
    nama_mhs.append(nama)
    ipk_mhs.append(ipk)   # nilai langsung disimpan, tidak ada validasi!
    jumlah_mhs += 1

def hack_ipk(index: int):
    ipk_mhs[index] = 4.0   # tidak ada yang mencegah!
    print(f"⚠  IPK indeks ke-{index} diubah paksa menjadi 4.0 oleh hack_ipk()!")

def tampilkan_semua_mahasiswa():
    print("\n── Daftar Mahasiswa (Pendekatan Prosedural) ──")
    for i in range(jumlah_mhs):
        print(f"  [{i}] Nama: {nama_mhs[i]:<15} | IPK: {ipk_mhs[i]:.2f}")

def main():
    print("╔══════════════════════════════════════════════╗")
    print("║   PENDEKATAN PROSEDURAL – Masalah Nyata      ║")
    print("╚══════════════════════════════════════════════╝\n")

    # Menambah data mahasiswa
    tambah_mahasiswa("Budi Santoso", 3.50)
    tambah_mahasiswa("Sari Wulandari", 3.75)
    tambah_mahasiswa("Andi Pratama", 2.90)

    print("Data awal setelah ditambahkan:")
    tampilkan_semua_mahasiswa()

    # ⚠ Masalah: fungsi lain bebas mengubah data langsung!
    print()
    hack_ipk(2)   # mengubah IPK Andi secara paksa

    print("\nData setelah hack_ipk() dipanggil:")
    tampilkan_semua_mahasiswa()

    # ⚠ Bahkan bisa diubah langsung dari luar fungsi!
    print("\n⚠  Mengubah IPK langsung via list global (indeks 0):")
    ipk_mhs[0] = -99.0   # nilai tidak masuk akal, tapi tidak ada yang mencegah
    tampilkan_semua_mahasiswa()

    print("\n──────────────────────────────────────────────────")
    print("KESIMPULAN: Tanpa enkapsulasi, data bisa diubah")
    print("           dari mana saja & kapan saja → BERBAHAYA!")
    print("──────────────────────────────────────────────────")

if __name__ == "__main__":
    main()

