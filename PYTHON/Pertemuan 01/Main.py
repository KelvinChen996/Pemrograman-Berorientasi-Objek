import sys
sys.stdout.reconfigure(encoding='utf-8')
import AnalogiDuniaNyata
import EmpatPilarOOP
import OOPSolusi
import PraktekMandiriMobil
import ProseduralBermasalah
import ProsesAbstraksi
import TugasLatihan

def main():
    while True:
        print("\n=== MENU PRAKTIKUM PERTEMUAN 01 ===")
        print("1. Jalankan AnalogiDuniaNyata")
        print("2. Jalankan EmpatPilarOOP")
        print("3. Jalankan OOPSolusi")
        print("4. Jalankan PraktekMandiriMobil")
        print("5. Jalankan ProseduralBermasalah")
        print("6. Jalankan ProsesAbstraksi")
        print("7. Jalankan TugasLatihan")
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
            AnalogiDuniaNyata.main()
        elif pilihan == 2:
            EmpatPilarOOP.main()
        elif pilihan == 3:
            OOPSolusi.main()
        elif pilihan == 4:
            PraktekMandiriMobil.main()
        elif pilihan == 5:
            ProseduralBermasalah.main()
        elif pilihan == 6:
            ProsesAbstraksi.main()
        elif pilihan == 7:
            TugasLatihan.main()
        else:
            print("Pilihan tidak ada di menu.")
        print("-------------------------------------------------")

if __name__ == "__main__":
    main()

