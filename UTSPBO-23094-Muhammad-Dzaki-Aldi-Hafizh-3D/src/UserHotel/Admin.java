package UserHotel;

import Hotel.Kamar;

public class Admin implements AksiAdmin {
    private Kamar kamar;

    public Admin() {
        this.kamar = null;
    }

    @Override
    public void cekKetersediaanKamar() {
        if (kamar != null) {
            System.out.println("Kamar " + kamar.getIdKamar() + ": " + kamar.getTipeKamar() + " - " + (kamar.isTersedia() ? "Tersedia" : "Terisi"));
        } else {
            System.out.println("Belum ada kamar yang terdaftar.");
        }
    }

    @Override
    public void tambahKamar(int idKamar, String tipeKamar) {
        if (kamar == null) {
            this.kamar = new Kamar(idKamar, tipeKamar);
            System.out.println("Kamar " + tipeKamar + " berhasil ditambahkan.");
        } else {
            System.out.println("Kamar sudah terdaftar.");
        }
    }

    public Kamar getKamar() {
        return kamar;
    }
}