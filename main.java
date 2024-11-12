package zakatPBO;

import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("KALKULATOR PENGHITUNG ZAKAT MAAL");
        System.out.println("===============================================\n");

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String ulang;

        // Menentukan nisab berdasarkan harga emas per gram
        double hargaEmasPerGram = 1000000; // Dalam Rupiah
        double nisab = hargaEmasPerGram * 85;

        // Daftar penerima zakat
        Penerima[] daftarPenerima = {
            new Penerima("Ahmad Fauzan", "Jl. Mangga No. 10"),
            new Penerima("Lisa Maharani", "Jl. Melati No. 5"),
            new Penerima("Iwan Kurniawan", "Jl. Durian No. 7"),
            new Penerima("Dina Oktavia", "Jl. Pisang No. 2"),
            new Penerima("Rendy Mahardika", "Jl. Jambu No. 3")
        };

        // Perulangan do-while untuk menghitung zakat
        do {
            System.out.println("Masukkan Nama Muzaki:");
            String namaMuzaki = input.nextLine();

            System.out.println("Masukkan jumlah harta yang dimiliki dalam Rupiah:");
            double harta = input.nextDouble();
            input.nextLine();  // Membersihkan buffer

            Muzaki muzaki = new Muzaki(namaMuzaki, harta);

            // Mengecek apakah wajib zakat
            if (muzaki.isWajibZakat(nisab)) {
                double jumlahZakat = muzaki.hitungZakat();
                System.out.println("===============================================\n");
                System.out.printf("Halo %s\nAnda harus membayar zakat maal sebesar: Rp %.2f\n", muzaki.getNama(), jumlahZakat);

                // Memilih penerima zakat secara acak
                Penerima penerimaZakat = daftarPenerima[random.nextInt(daftarPenerima.length)];
                System.out.println("Penerima zakat yang dipilih:");
                System.out.printf("Nama: %s\nAlamat: %s\n", penerimaZakat.getNama(), penerimaZakat.getAlamat());
            } else {
                System.out.printf("Halo %s, harta Anda belum mencapai nisab. Anda tidak wajib membayar zakat maal.\n", muzaki.getNama());
            }

            System.out.println("===============================================\n");
            System.out.println("Ingin menghitung zakat lagi? (y/n)");
            ulang = input.nextLine();

        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("===============================================");
        System.out.println("TERIMA KASIH TELAH MENGGUNAKAN PROGRAM INI");
        System.out.println("===============================================");
    }
}
