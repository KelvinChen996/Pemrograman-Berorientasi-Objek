import sys
sys.stdout.reconfigure(encoding='utf-8')
class MahasiswaAnalogi:
    def __init__(self, nama: str, nim: str, ipk: float, semester: int):
        self.nama = nama
        self.nim = nim
        self.ipk = ipk
        self.semester = semester

    def belajar(self):
        print(f"[{self.nama}] sedang belajar…")

    def mengerjakan_tugas(self, nama_tugas: str):
        print(f"[{self.nama}] mengerjakan tugas: {nama_tugas}")

    def hadir_kuliah(self, mata_kuliah: str):
        print(f"[{self.nama}] hadir di: {mata_kuliah}")

    def ujian(self, mata_kuliah: str):
        print(f"[{self.nama}] mengikuti ujian: {mata_kuliah}")

    def tampilkan_state(self):
        print(f"  Nama     : {self.nama}")
        print(f"  NIM      : {self.nim}")
        print(f"  IPK      : {self.ipk}")
        print(f"  Semester : {self.semester}")

