package UserHotel;

import Hotel.Reservasi;
import Hotel.Kamar;

public class Customer implements AksiCustomer {
    private Reservasi reservasi;
    private Admin admin;

    public Customer(Admin admin) {
        this.admin = admin;
        this.reservasi = null;
    }

    @Override
    public void lihatDetailPesanan() {
        if (reservasi != null) {
            System.out.println("Detail Reservasi:");
            System.out.println("ID Reservasi: " + reservasi.getIdReservasi());
            System.out.println("Kamar: " + reservasi.getTipeKamar());
            System.out.println("Nama Customer: " + reservasi.getNamaCustomer());
            System.out.println("Check-in: " + reservasi.getCheckIn());
            System.out.println("Check-out: " + reservasi.getCheckOut());
        } else {
            System.out.println("Belum ada reservasi yang dibuat.");
        }
    }

    @Override
    public void pesanKamar(int idReservasi, int idKamar, String namaCustomer, String checkIn, String checkOut) {
        Kamar kamar = admin.getKamar();
        if (kamar != null && kamar.isTersedia() && kamar.getIdKamar() == idKamar) {
            this.reservasi = new Reservasi(idReservasi, idKamar, kamar.getTipeKamar(), namaCustomer, checkIn, checkOut);
            kamar.setStatus("terisi");
            System.out.println("Kamar berhasil dipesan untuk " + namaCustomer);
        } else {
            System.out.println("Kamar tidak tersedia atau belum didaftarkan.");
        }
    }
}
