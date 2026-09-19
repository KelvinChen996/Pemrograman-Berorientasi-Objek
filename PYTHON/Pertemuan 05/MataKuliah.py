import sys
sys.stdout.reconfigure(encoding='utf-8')
class MataKuliah:
    def __init__(self, kode: str = None, nama: str = None, sks: int = None, tipe: str = None, nilai_min: float = None, lain = None):
        if lain is not None:
            # ── Copy Constructor ──────────────────────────────────────────────────────
            self._kode = lain._kode
            self._nama = lain._nama
            self._sks = lain._sks
            self._tipe = lain._tipe
            self._nilai_min = lain._nilai_min
            print(f"  [Copy Constructor] Salinan dari: {lain._kode}")
        else:
            if kode is None and nama is None:
                # ── Konstruktor Default (no-arg) ─────────────────────────────────────────
                self._kode = "UNKNOWN"
                self._nama = "Belum Ditentukan"
                self._sks = 2
                self._tipe = "Wajib"
                self._nilai_min = 55.0
                print("  [Konstruktor Default] MataKuliah dibuat dengan nilai awal.")
            elif sks is None:
                # ── Konstruktor Non-Default (2 parameter) ────────────────────────────────
                self._kode = kode
                self._nama = nama
                self._sks = 2
                self._tipe = "Wajib"
                self._nilai_min = 55.0
                print(f"  [Konstruktor 2-param] {kode} – {nama}")
            elif tipe is None and nilai_min is None:
                # ── Konstruktor Non-Default (3 parameter) ────────────────────────────────
                self._kode = kode
                self._nama = nama
                self._sks = sks if sks > 0 else 2
                self._tipe = "Wajib"
                self._nilai_min = 55.0
                print(f"  [Konstruktor 3-param] {kode} – {nama} ({sks} sks)")
            else:
                # ── Konstruktor Lengkap (5 parameter) ────────────────────────────────────
                self._kode = kode
                self._nama = nama
                self._sks = sks if sks > 0 else 2
                self._tipe = tipe if tipe is not None else "Wajib"
                self._nilai_min = nilai_min if nilai_min is not None else 55.0

    # Getter
    @property
    def kode(self) -> str:
        return self._kode

    @property
    def nama(self) -> str:
        return self._nama

    @property
    def sks(self) -> int:
        return self._sks

    @property
    def tipe(self) -> str:
        return self._tipe

    def tampilkan(self):
        print(f"  {self._kode:<12} | {self._nama:<40} | {self._sks} sks | {self._tipe:<8} | Min: {self._nilai_min:.0f}")

