import sys
sys.stdout.reconfigure(encoding='utf-8')
class Produk:
    def __init__(self, nama: str, harga: float, stok: int):
        self._nama = nama
        self._harga = harga
        self._stok = stok

    # Getter
    @property
    def nama(self) -> str:
        return self._nama

    @property
    def harga(self) -> float:
        return self._harga

    @property
    def stok(self) -> int:
        return self._stok

    # Business logic
    def tersedia(self) -> bool:
        return self._stok > 0

    def total_nilai(self) -> float:
        return self._harga * self._stok

    def beli(self, jumlah: int):
        if jumlah <= self._stok:
            self._stok -= jumlah
            print(f"  Beli {jumlah} unit {self._nama} → stok sisa: {self._stok}")
        else:
            print(f"  ⚠ Stok {self._nama} tidak cukup! (stok={self._stok})")

    def info(self):
        print(f"  {self._nama:<20} | Rp{self._harga:10,.0f} | Stok: {self._stok:3d} | Tersedia: {'Ya' if self.tersedia() else 'Tidak'}")

