package Hotel;

public class Reservasi extends Kamar {
    private int idReservasi;
    private String namaCustomer;
    private String checkIn;
    private String checkOut;

    public Reservasi(int idReservasi, int idKamar, String tipeKamar, String namaCustomer, String checkIn, String checkOut) {
        super(idKamar, tipeKamar); 
        this.idReservasi = idReservasi;
        this.namaCustomer = namaCustomer;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getIdReservasi() {
        return idReservasi;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }
}
