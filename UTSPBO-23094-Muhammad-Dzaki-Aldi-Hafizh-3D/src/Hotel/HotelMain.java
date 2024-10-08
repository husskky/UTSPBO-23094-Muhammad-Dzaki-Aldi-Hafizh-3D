package Hotel;

import UserHotel.Admin;
import UserHotel.Customer;

import java.util.Scanner;

public class HotelMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        Customer customer = new Customer(admin);
        boolean running = true;
        boolean AdminMode = true; // Menandakan mode saat ini, default adalah admin

        while (running) {
            if (AdminMode) {
                System.out.println("\n=== Mode Admin ===");
                System.out.println("1. Cek Ketersediaan Kamar");
                System.out.println("2. Tambah Kamar");
                System.out.println("3. Ganti ke Customer Mode");
                System.out.println("4. Keluar");
                System.out.print("Pilih opsi: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Mengonsumsi newline

                switch (choice) {
                    case 1:
                        admin.cekKetersediaanKamar();
                        break;
                    case 2:
                        System.out.print("Masukkan ID Kamar: ");
                        int idKamar = scanner.nextInt();
                        scanner.nextLine(); // Mengonsumsi newline
                        System.out.print("Masukkan Tipe Kamar: ");
                        String tipeKamar = scanner.nextLine();
                        admin.tambahKamar(idKamar, tipeKamar);
                        break;
                    case 3:
                        AdminMode = false;
                        break;
                    case 4:
                        running = false;
                        break;
                    default:
                        System.out.println("Opsi tidak valid!");
                }
            } else {
                System.out.println("\n=== Mode Customer ===");
                System.out.println("1. Lihat Detail Pesanan");
                System.out.println("2. Pesan Kamar");
                System.out.println("3. Ganti ke Admin Mode");
                System.out.println("4. Keluar");
                System.out.print("Pilih opsi: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        customer.lihatDetailPesanan();
                        break;
                    case 2:
                        System.out.print("Masukkan ID Reservasi: ");
                        int idReservasi = scanner.nextInt();
                        System.out.print("Masukkan ID Kamar: ");
                        int kamarId = scanner.nextInt();
                        scanner.nextLine(); // Mengonsumsi newline
                        System.out.print("Masukkan Nama Customer: ");
                        String namaCustomer = scanner.nextLine();
                        System.out.print("Masukkan Tanggal Check-in: ");
                        String checkIn = scanner.nextLine();
                        System.out.print("Masukkan Tanggal Check-out: ");
                        String checkOut = scanner.nextLine();
                        customer.pesanKamar(idReservasi, kamarId, namaCustomer, checkIn, checkOut);
                        break;
                    case 3:
                        AdminMode = true;
                        break;
                    case 4:
                        running = false;
                        break;
                    default:
                        System.out.println("Opsi tidak valid!");
                }
            }
        }

        System.out.println("Terima kasih telah menggunakan aplikasi reservasi hotel!");
        scanner.close();
    }
}
