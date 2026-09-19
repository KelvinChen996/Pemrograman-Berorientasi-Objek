import sys
sys.stdout.reconfigure(encoding='utf-8')
class RekeningTabungan:
    def __init__(self, nomor_rekening: str, nama_pemilik: str, saldo_awal: float):
        self._nomor_rekening = nomor_rekening
        self._nama_pemilik = nama_pemilik
        self._jumlah_transaksi = 0
        self._saldo = 0.0
        self.saldo = saldo_awal   # validasi lewat property setter

    # Getter (akses baca)
    @property
    def nomor_rekening(self) -> str:
        return self._nomor_rekening

    @property
    def nama_pemilik(self) -> str:
        return self._nama_pemilik

    @property
    def saldo(self) -> float:
        return self._saldo

    @property
    def jumlah_transaksi(self) -> int:
        return self._jumlah_transaksi

    # Setter dengan validasi
    @saldo.setter
    def saldo(self, saldo: float):
        if saldo >= 0:
            self._saldo = saldo
        else:
            print("  ⚠ Saldo awal tidak boleh negatif!")

    # Business method (bukan sekedar getter/setter)
    def setor(self, jumlah: float):
        if jumlah > 0:
            self._saldo += jumlah
            self._jumlah_transaksi += 1
            print(f"  [SETOR]  Rp{jumlah:12,.0f} → Saldo: Rp{self._saldo:12,.0f}")
        else:
            print("  ⚠ Jumlah setor harus > 0")

    def tarik(self, jumlah: float):
        if jumlah <= 0:
            print("  ⚠ Jumlah tarik harus > 0")
        elif jumlah > self._saldo:
            print(f"  ⚠ Saldo tidak cukup! Saldo: Rp{self._saldo:,.0f}")
        else:
            self._saldo -= jumlah
            self._jumlah_transaksi += 1
            print(f"  [TARIK]  Rp{jumlah:12,.0f} → Saldo: Rp{self._saldo:12,.0f}")

    def cetak_info(self):
        print("  ┌── Info Rekening ──────────────────────────┐")
        print(f"  │ No. Rekening : {self._nomor_rekening}")
        print(f"  │ Pemilik      : {self._nama_pemilik}")
        print(f"  │ Saldo        : Rp{self._saldo:,.0f}")
        print(f"  │ Transaksi    : {self._jumlah_transaksi} kali")
        print("  └───────────────────────────────────────────┘")

