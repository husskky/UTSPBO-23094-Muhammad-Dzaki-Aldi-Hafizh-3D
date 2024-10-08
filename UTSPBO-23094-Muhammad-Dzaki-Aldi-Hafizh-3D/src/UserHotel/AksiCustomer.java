package UserHotel;

public interface AksiCustomer {
    void lihatDetailPesanan();
    void pesanKamar(int idReservasi, int idKamar, String namaCustomer, String checkIn, String checkOut);
}
