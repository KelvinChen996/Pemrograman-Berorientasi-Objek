import sys
sys.stdout.reconfigure(encoding='utf-8')
from abc import ABC, abstractmethod

class BangunDatar(ABC):
    def __init__(self, nama: str):
        self.nama = nama

    # Method abstrak – wajib diimplementasikan oleh subclass
    @abstractmethod
    def hitung_luas(self) -> float:
        pass

    @abstractmethod
    def hitung_keliling(self) -> float:
        pass

    # Method konkret – tersedia untuk semua subclass
    def tampilkan_hasil(self):
        print(f"  [{self.nama}] Luas = {self.hitung_luas():.2f} | Keliling = {self.hitung_keliling():.2f}")

