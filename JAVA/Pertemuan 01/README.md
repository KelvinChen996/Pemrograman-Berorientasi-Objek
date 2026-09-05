# ☕ Panduan Setup & Menjalankan Program Java
### SYS07406 – Pemrograman Berorientasi Objek | Universitas Pelita Harapan

---

## 📋 Daftar Isi
1. [Yang Perlu Diinstall](#1-yang-perlu-diinstall)
2. [Install JDK](#2-install-jdk-java-development-kit)
3. [Verifikasi Instalasi](#3-verifikasi-instalasi)
4. [Pilih Editor / IDE](#4-pilih-editor--ide)
5. [Setup VS Code untuk Java](#5-setup-vs-code-untuk-java-rekomendasi)
6. [Struktur Folder Project](#6-struktur-folder-project)
7. [Cara Menjalankan Program](#7-cara-menjalankan-program)
8. [Daftar File Pertemuan 1](#8-daftar-file-pertemuan-1)
9. [Troubleshooting](#9-troubleshooting)

---

## 1. Yang Perlu Diinstall

| Software | Fungsi | Wajib? |
|----------|--------|--------|
| **JDK 25** (Java Development Kit) | Mengompilasi & menjalankan program Java | ✅ Wajib |
| **VS Code** | Editor kode (ringan, gratis) | ⭐ Rekomendasi |
| **Extension Pack for Java** | Plugin Java di VS Code | ⭐ Rekomendasi |
| IntelliJ IDEA Community | IDE Java lengkap (alternatif) | 🔄 Alternatif |
| Eclipse | IDE Java klasik (alternatif) | 🔄 Alternatif |

> **Catatan**: JDK adalah satu-satunya yang **wajib**. Editor/IDE bisa disesuaikan selera.

---

## 2. Install JDK (Java Development Kit)

### Langkah 1 – Download JDK

Buka browser, kunjungi salah satu link berikut:

- 🔗 **Oracle JDK 25** (resmi): https://www.oracle.com/java/technologies/downloads/
- 🔗 **Eclipse Temurin 25** (gratis, open-source): https://adoptium.net/

> 💡 **Rekomendasi**: Gunakan **Eclipse Temurin 25 LTS** — gratis dan tidak ada lisensi komersial.

### Langkah 2 – Pilih Installer

Pilih sesuai sistem operasi Anda:

```
Windows  → .msi  (installer grafis, paling mudah)
macOS    → .pkg  (installer grafis)
Linux    → .tar.gz atau pakai apt/dnf
```

### Langkah 3 – Install (Windows)

1. Jalankan file `.msi` yang sudah didownload
2. Klik **Next** → **Next** → **Install**
3. Centang opsi **"Set JAVA_HOME variable"** jika tersedia
4. Tunggu hingga selesai → **Finish**

### Langkah 4 – Set Environment Variable (jika belum otomatis)

Buka **Command Prompt** atau **PowerShell**, ketik:

```powershell
# Cek apakah Java sudah terdaftar
java -version
```

Jika muncul error, lakukan ini:

1. Buka **System Properties** → **Environment Variables**
2. Di bagian **System Variables**, klik **New**:
   - Variable name: `JAVA_HOME`
   - Variable value: `C:\Program Files\Eclipse Adoptium\jdk-25.x.x` *(sesuaikan path)*
3. Cari variabel **Path** → klik **Edit** → **New** → tambahkan: `%JAVA_HOME%\bin`
4. Klik **OK** semua → **restart terminal**

---

## 3. Verifikasi Instalasi

Buka **Terminal / PowerShell / Command Prompt**, jalankan:

```bash
# Cek versi Java
java -version
```

Output yang diharapkan (contoh dengan JDK 25):
```
java 25.0.2 2026-01-20 LTS
Java(TM) SE Runtime Environment (build 25.0.2+10-LTS-69)
Java HotSpot(TM) 64-Bit Server VM (build 25.0.2+10-LTS-69, mixed mode, sharing)
```

> Kalau pakai Eclipse Temurin (bukan Oracle JDK), formatnya sedikit beda, misalnya `openjdk version "25.0.x"` — yang penting nomor versinya 21 ke atas.

```bash
# Cek compiler Java
javac -version
```

Output yang diharapkan:
```
javac 25.0.x
```

> ✅ Jika kedua perintah di atas menampilkan versi Java → instalasi berhasil!

---

## 4. Pilih Editor / IDE

### Perbandingan

| | VS Code | IntelliJ IDEA Community | Eclipse |
|--|---------|------------------------|---------|
| **Berat** | Ringan | Berat | Sedang |
| **Harga** | Gratis | Gratis | Gratis |
| **Kemudahan** | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐ | ⭐⭐⭐ |
| **Fitur** | ⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐ |
| **Cocok untuk** | Pemula–Menengah | Semua level | Semua level |
| **Download** | [code.visualstudio.com](https://code.visualstudio.com) | [jetbrains.com](https://www.jetbrains.com/idea/download/) | [eclipse.org](https://www.eclipse.org/downloads/) |

> 🎯 **Rekomendasi untuk mata kuliah ini**: **VS Code** — ringan, mudah, dan cukup lengkap.

---

## 5. Setup VS Code untuk Java (Rekomendasi)

### Langkah 1 – Install VS Code

1. Download di: https://code.visualstudio.com/
2. Jalankan installer → klik **Next** sampai selesai

### Langkah 2 – Install Extension Java

1. Buka VS Code
2. Klik ikon **Extensions** di sidebar kiri (atau tekan `Ctrl + Shift + X`)
3. Cari: **`Extension Pack for Java`**
4. Klik **Install** pada ekstensi dari Microsoft

   Extension ini otomatis menginstall:
   - Language Support for Java (Red Hat)
   - Debugger for Java
   - Test Runner for Java
   - Maven for Java
   - Project Manager for Java
   - IntelliCode

### Langkah 3 – Buka Folder Project

```
File → Open Folder → pilih folder "Pertemuan 01"
```

Atau via terminal:
```bash
code "E:\Data\UPH\Ganjil 2026-2027\Pemrograman Berorientasi Objek\Kode Program\Pertemuan 01"
```

### Langkah 4 – Jalankan Program di VS Code

Ada **3 cara** menjalankan program Java di VS Code:

**Cara A – Klik Tombol Run (Termudah)**
```
Buka file .java → lihat tulisan "▶ Run" di atas method main() → Klik!
```

**Cara B – Klik Kanan**
```
Klik kanan di dalam file .java → "Run Java"
```

**Cara C – Terminal Terintegrasi**
```
Terminal → New Terminal → ketik perintah javac dan java
```

---

## 6. Struktur Folder Project

```
📁 Kode Program/
└── 📁 Pertemuan 01/
    │
    ├── 📄 01_ProseduralBermasalah.java   ← Contoh masalah kode prosedural
    ├── 📄 02_OOPSolusi.java              ← Solusi dengan enkapsulasi OOP
    ├── 📄 03_AnalogiDuniaRata.java       ← Identity, State & Behavior objek
    ├── 📄 04_ProsesAbstraksi.java        ← Konsep abstraksi
    ├── 📄 05_EmpatPilarOOP.java          ← 4 Pilar: Encap, Inherit, Poly, Abstrak
    ├── 📄 06_PraktekMandiriMobil.java    ← Praktek dari slide (class Mobil)
    ├── 📄 07_TugasLatihan.java           ← Jawaban 3 tugas latihan
    ├── 📄 README.md                      ← Panduan ini
    │
    └── 📁 bin/                           ← Hasil compile (auto-generated)
        ├── ProseduralBermasalah.class
        ├── OOPSolusi.class
        └── ... (semua .class di sini)
```

> 💡 Folder `bin/` dibuat **otomatis** saat compile. Anda tidak perlu menyentuhnya.

---

## 7. Cara Menjalankan Program

### Menggunakan Terminal / PowerShell

Buka terminal di folder `Pertemuan 01`, lalu:

#### ▶ Compile Satu File

```bash
javac -d bin 01_ProseduralBermasalah.java
```

#### ▶ Compile Semua File Sekaligus

```bash
javac -d bin *.java
```

> Opsi `-d bin` → hasil `.class` disimpan rapi di folder `bin/`

#### ▶ Jalankan Program

```bash
java -cp bin ProseduralBermasalah
```

> Opsi `-cp bin` → cari class di folder `bin/`

#### ▶ Contoh Lengkap – Semua Program

```bash
# Compile semua
javac -d bin *.java

# Jalankan masing-masing
java -cp bin ProseduralBermasalah
java -cp bin OOPSolusi
java -cp bin AnalogiDuniaRata
java -cp bin ProsesAbstraksi
java -cp bin EmpatPilarOOP
java -cp bin PraktekMandiriMobil
java -cp bin TugasLatihan
```

#### ▶ Bersihkan File .class (opsional)

```bash
# Windows PowerShell
Remove-Item bin\*.class

# Atau hapus seluruh folder bin
Remove-Item bin -Recurse
```

---

## 8. Daftar File Pertemuan 1

| File | Topik Utama | Class yang Bisa Dijalankan |
|------|-------------|---------------------------|
| `01_ProseduralBermasalah.java` | Masalah pendekatan prosedural | `ProseduralBermasalah` |
| `02_OOPSolusi.java` | Enkapsulasi & getter/setter | `OOPSolusi` |
| `03_AnalogiDuniaRata.java` | Identity, State, Behavior | `AnalogiDuniaRata` |
| `04_ProsesAbstraksi.java` | Abstraksi dua konteks berbeda | `ProsesAbstraksi` |
| `05_EmpatPilarOOP.java` | 4 Pilar OOP sekaligus | `EmpatPilarOOP` |
| `06_PraktekMandiriMobil.java` | Class Mobil dari slide | `PraktekMandiriMobil` |
| `07_TugasLatihan.java` | 3 tugas latihan mandiri | `TugasLatihan` |

---

## 9. Troubleshooting

### ❌ `java` atau `javac` tidak dikenali

```
'javac' is not recognized as an internal or external command
```

**Solusi**: JDK belum terdaftar di PATH. Ulangi [Langkah 4 – Set Environment Variable](#langkah-4--set-environment-variable-jika-belum-otomatis) di atas, lalu restart terminal.

---

### ❌ Error: `class X is public, should be declared in a file named X.java`

```
error: class ProseduralBermasalah is public, should be declared in a file named ProseduralBermasalah.java
```

**Penjelasan**: Java mengharuskan `public class` memiliki nama yang **sama persis** dengan nama file.

**Solusi**: File di repo ini sudah menggunakan `class` (tanpa `public`) agar bisa dikompilasi dengan nama file bernomor. Pastikan tidak ada perubahan yang menambahkan kata `public` kembali.

---

### ❌ Error: `could not find or load main class`

```
Error: Could not find or load main class ProseduralBermasalah
```

**Solusi**: Pastikan Anda sudah compile terlebih dahulu dan menggunakan `-cp bin`:

```bash
javac -d bin 01_ProseduralBermasalah.java   # compile dulu
java -cp bin ProseduralBermasalah            # baru jalankan
```

---

### ❌ Error: `cannot find symbol`

```
error: cannot find symbol
```

**Penjelasan**: Ada nama variabel/method yang salah ketik, atau class yang dirujuk belum dikompilasi.

**Solusi**: Compile **semua file** sekaligus agar semua class tersedia:

```bash
javac -d bin *.java
```

---

### ❌ Karakter aneh di output (kotak/tanda tanya)

Terjadi karena encoding terminal tidak mendukung karakter Unicode (emoji, simbol box).

**Solusi di PowerShell**:
```powershell
[Console]::OutputEncoding = [System.Text.Encoding]::UTF8
chcp 65001
```

---

## 📚 Referensi Belajar

| Sumber | Link |
|--------|------|
| Dokumentasi resmi Java | https://docs.oracle.com/en/java/ |
| Tutorial Java W3Schools | https://www.w3schools.com/java/ |
| Buku referensi kuliah | *Object-Oriented Software Construction* – Bertrand Meyer |
| VS Code Java Guide | https://code.visualstudio.com/docs/languages/java |

---

*Pertemuan 1 – Pengantar Pemrograman Berorientasi Objek | SYS07406*  
*Program Studi Sistem Informasi – Universitas Pelita Harapan*
