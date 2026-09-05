import sys
sys.stdout.reconfigure(encoding='utf-8')
class Rekening:
    def __init__(self, pemilik: str, saldo_awal: float):
        self._pemilik = pemilik
        self._saldo = saldo_awal   # private → tidak bisa diakses langsung dari luar

    # "Pintu resmi" – saldo hanya bisa berubah melalui method berikut:
    def setor(self, jumlah: float):
        if jumlah > 0:
            self._saldo += jumlah
            print(f"[{self._pemilik}] Setor Rp{jumlah:.0f} → Saldo: Rp{self._saldo:.0f}")

    def tarik(self, jumlah: float):
        if 0 < jumlah <= self._saldo:
            self._saldo -= jumlah
            print(f"[{self._pemilik}] Tarik Rp{jumlah:.0f} → Saldo: Rp{self._saldo:.0f}")
        else:
            print(f"[{self._pemilik}] ⚠ Saldo tidak cukup!")

    @property
    def saldo(self) -> float:
        return self._saldo

    @property
    def pemilik(self) -> str:
        return self._pemilik

