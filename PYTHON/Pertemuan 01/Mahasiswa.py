import sys
sys.stdout.reconfigure(encoding='utf-8')
class Mahasiswa:
    def __init__(self, nama: str, nim: str, ipk: float):
        self._nama = nama
        self._nim = nim
        self._ipk = 0.0
        self.ipk = ipk  # uses setter for validation

    @property
    def nama(self) -> str:
        return self._nama

    @property
    def nim(self) -> str:
        return self._nim

    @property
    def ipk(self) -> float:
        return self._ipk

    @ipk.setter
    def ipk(self, value: float):
        if 0.0 <= value <= 4.0:
            self._ipk = value
        else:
            print(f"⚠  IPK {value} tidak valid! Harus antara 0.0–4.0. IPK tidak diubah.")

    def belajar(self):
        print(f"{self.nama} sedang belajar.")

    def hadir_kuliah(self, mata_kuliah: str):
        print(f"{self.nama} hadir di kuliah: {mata_kuliah}")

    def tampilkan_info(self):
        print(f"  Nama : {self.nama:<20} | NIM : {self.nim:<12} | IPK : {self.ipk:.2f}")

