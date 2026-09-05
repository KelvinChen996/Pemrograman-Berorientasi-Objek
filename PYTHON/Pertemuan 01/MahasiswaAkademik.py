import sys
sys.stdout.reconfigure(encoding='utf-8')
class MahasiswaAkademik:
    def __init__(self, nama: str, nim: str, ipk: float, semester: int, prodi: str):
        self.nama = nama
        self.nim = nim
        self.ipk = ipk
        self.semester = semester
        self.program_studi = prodi

    def ambil_mata_kuliah(self, mk: str):
        print(f"{self.nama} mengambil mata kuliah: {mk}")

    def hitung_ipk(self, nilai_list: list[float]):
        if nilai_list:
            self.ipk = sum(nilai_list) / len(nilai_list)
        print(f"{self.nama} – IPK diperbarui menjadi: {self.ipk:.2f}")

    def tampilkan_info(self):
        print("  ┌─ Kartu Akademik ──────────────────────────┐")
        print(f"  │ Nama         : {self.nama}")
        print(f"  │ NIM          : {self.nim}")
        print(f"  │ IPK          : {self.ipk:.2f}")
        print(f"  │ Semester     : {self.semester}")
        print(f"  │ Program Studi: {self.program_studi}")
        print("  └───────────────────────────────────────────┘")

