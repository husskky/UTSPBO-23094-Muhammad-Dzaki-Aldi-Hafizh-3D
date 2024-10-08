package Hotel;

public class Kamar {
    private int idKamar;
    private String tipeKamar;
    private boolean tersedia;

    public Kamar(int idKamar, String tipeKamar) {
        this.idKamar = idKamar;
        this.tipeKamar = tipeKamar;
        this.tersedia = true; 
    }

    public int getIdKamar() {
        return idKamar;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setStatus(String status) {
        if (status.equals("terisi")) {
            this.tersedia = false;
        } else {
            this.tersedia = true;
        }
    }
}
