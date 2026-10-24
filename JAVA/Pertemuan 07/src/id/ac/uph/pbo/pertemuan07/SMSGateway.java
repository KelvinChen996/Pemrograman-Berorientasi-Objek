package id.ac.uph.pbo.pertemuan07;

public class SMSGateway implements Notifikasi {
    @Override
    public void kirimNotifikasi(String pesan) {
        System.out.println("  [SMS] " + pesan);
    }
}
