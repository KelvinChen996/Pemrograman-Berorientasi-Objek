import sys
sys.stdout.reconfigure(encoding='utf-8')
class Mahasiswa:
    # Menggunakan default arguments untuk mensimulasikan overloading konstruktor di Python
    def __init__(self, nim: str, nama: str, program_studi: str = "Sistem Informasi", tahun_masuk: int = 2025, ipk: float = 0.0):
        self._nim = nim
        self._nama = nama
        self._program_studi = program_studi
        self._tahun_masuk = tahun_masuk
        self._ipk = ipk

    def set_ipk(self, ipk: float):
        if 0.0 <= ipk <= 4.0:
            self._ipk = ipk

    def tampilkan(self):
        print(f"  {self._nim:<12} | {self._nama:<20} | {self._program_studi:<20} | {self._tahun_masuk} | IPK: {self._ipk:.2f}")

