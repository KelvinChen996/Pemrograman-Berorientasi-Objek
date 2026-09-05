import sys
sys.stdout.reconfigure(encoding='utf-8')
class Mahasiswa:
    # Konstanta: UPPER_SNAKE_CASE
    IPK_MINIMUM_LULUS = 2.00

    def __init__(self, nama: str, umur: int, ipk: float):
        self._nama = nama
        self._umur = umur
        self._ipk = ipk

    @property
    def nama(self) -> str:
        return self._nama

    @property
    def ipk(self) -> float:
        return self._ipk

    def apakah_lulus(self) -> bool:
        return self._ipk >= self.IPK_MINIMUM_LULUS

    def tampilkan(self):
        print(f"  Nama: {self.nama:<15} | Umur: {self._umur:2d} | IPK: {self.ipk:.2f} | Lulus: {'Ya' if self.apakah_lulus() else 'Tidak'}")

