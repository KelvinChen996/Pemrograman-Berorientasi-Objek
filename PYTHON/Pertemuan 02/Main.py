import sys
sys.stdout.reconfigure(encoding='utf-8')
import ElemenDasarJava
import TugasLatihan

def main():
    while True:
        print("\n=== MENU PRAKTIKUM PERTEMUAN 02 ===")
        print("1. Jalankan ElemenDasarJava")
        print("2. Jalankan TugasLatihan")
        print("0. Keluar")
        
        try:
            pilihan = int(input("Pilihan Anda: "))
        except ValueError:
            print("Input tidak valid!")
            continue
            
        if pilihan == 0:
            print("Keluar dari menu.")
            break
            
        print("-------------------------------------------------")
        if pilihan == 1:
            ElemenDasarJava.main()
        elif pilihan == 2:
            TugasLatihan.main()
        else:
            print("Pilihan tidak ada di menu.")
        print("-------------------------------------------------")

if __name__ == "__main__":
    main()

