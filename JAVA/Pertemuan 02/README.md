# PERTEMUAN 02 - Elemen Dasar Java

Folder ini berisi materi praktikum untuk **Pertemuan 2** mata kuliah Pemrograman Berorientasi Objek.

## 📌 Topik Pembelajaran
1. **Tipe Data Primitif:** Penggunaan tipe data bawaan Java (int, double, char, boolean, dll).
2. **Operator:** Aritmatika, relasional (perbandingan), logika, dan *assignment*.
3. **Kontrol Alur (Control Flow):** Penggunaan `if-else`, `switch`, `for`, `while`, dan `do-while`.
4. **Java Coding Standard:** Konvensi penamaan (PascalCase untuk Class, camelCase untuk Method/Variabel, UPPER_SNAKE_CASE untuk Konstanta).
5. **Access Modifier:** Memahami perbedaan visibilitas dari `public`, `protected`, `default`, dan `private`.
6. **Class Sederhana:** Implementasi class `Mahasiswa` dengan konsep dasar dan enkapsulasi ringan.

## 📂 Struktur File
- `src/id/ac/uph/pbo/pertemuan02/ElemenDasarJava.java` : Class utama yang berisi method `main` untuk mendemonstrasikan kelima topik di atas.
- `src/id/ac/uph/pbo/pertemuan02/Mahasiswa.java` : Class pendukung yang direpresentasikan sebagai objek dunia nyata.
- `src/id/ac/uph/pbo/pertemuan02/TugasLatihan.java` : **(Latihan Mandiri)** Contoh latihan untuk memperdalam kontrol alur dan tipe data.

## 🚀 Cara Menjalankan (Compile & Run)

Mengingat file-file pada pertemuan ini telah dipisahkan menggunakan **Package** (`id.ac.uph.pbo.pertemuan02`), kita perlu menjalankannya dari root project (folder `Pertemuan 02`).

**1. Buka Terminal / Command Prompt**
Arahkan ke folder `Pertemuan 02`:
```bash
cd "E:\Data\UPH\Ganjil 2026-2027\Pemrograman Berorientasi Objek\Kode Program\Pertemuan 02"
```

**2. Proses Kompilasi (Compile)**
```bash
javac -d bin src/id/ac/uph/pbo/pertemuan02/*.java
```

**3. Proses Eksekusi (Run)**
Menjalankan program utama (`ElemenDasarJava`):
```bash
java -cp bin id.ac.uph.pbo.pertemuan02.ElemenDasarJava
```

Menjalankan Tugas Latihan:
```bash
java -cp bin id.ac.uph.pbo.pertemuan02.TugasLatihan
```
