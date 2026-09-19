import sys
sys.stdout.reconfigure(encoding='utf-8')
class Karyawan:
    # Konstanta kelas
    TARIF_LEMBUR = 50_000  # per jam
    TARIF_BONUS = 0.10     # 10%
    GAJI_MINIMUM = 3_000_000

    def __init__(self, nik: str, nama: str, jabatan: str, gaji_pokok: float):
        self._nik = nik
        self._nama = nama
        self._jabatan = jabatan
        self._jam_lembur = 0
        self._gaji_pokok = 0.0
        self.gaji_pokok = gaji_pokok  # Uses property setter for validation

    # Getter
    @property
    def nik(self) -> str:
        return self._nik

    @property
    def nama(self) -> str:
        return self._nama

    @property
    def jabatan(self) -> str:
        return self._jabatan

    @property
    def gaji_pokok(self) -> float:
        return self._gaji_pokok

    @property
    def jam_lembur(self) -> int:
        return self._jam_lembur

    # Setter dengan validasi
    @gaji_pokok.setter
    def gaji_pokok(self, gaji: float):
        if gaji >= self.GAJI_MINIMUM:
            self._gaji_pokok = gaji
        else:
            print(f"  ⚠ Gaji {gaji:.0f} di bawah minimum Rp{self.GAJI_MINIMUM:.0f}!")

    @jabatan.setter
    def jabatan(self, jabatan: str):
        if jabatan and jabatan.strip():
            self._jabatan = jabatan

    def tambah_lembur(self, jam: int):
        if jam > 0:
            self._jam_lembur += jam
            print(f"  {self._nama} lembur +{jam} jam (total: {self._jam_lembur} jam)")

    # Business logic: hitung total gaji
    def hitung_gaji(self) -> float:
        return self._gaji_pokok + (self._jam_lembur * self.TARIF_LEMBUR)

    def hitung_bonus(self) -> float:
        return self._gaji_pokok * self.TARIF_BONUS

    def cetak_slip_gaji(self):
        print("  ┌── Slip Gaji ──────────────────────────────┐")
        print(f"  │ NIK      : {self._nik:<30}│")
        print(f"  │ Nama     : {self._nama:<30}│")
        print(f"  │ Jabatan  : {self._jabatan:<30}│")
        print(f"  │ Gaji Pokok  : Rp{self._gaji_pokok:10,.0f}             │")
        print(f"  │ Tunjangan LB: Rp{self._jam_lembur * self.TARIF_LEMBUR:10,.0f}             │")
        print(f"  │ Bonus (10%) : Rp{self.hitung_bonus():10,.0f}             │")
        print("  │" + "─" * 44 + "│")
        print(f"  │ TOTAL GAJI  : Rp{self.hitung_gaji() + self.hitung_bonus():10,.0f}             │")
        print("  └───────────────────────────────────────────┘")

