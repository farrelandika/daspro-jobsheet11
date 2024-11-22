import java.util.Scanner;

public class HitungHargaSoal3 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuchino - Rp 20,000");
        System.out.println("3. Latte - Rp  22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 10,000");
        System.out.println("========================");
        System.out.println("Silahkan pilih menu yang anda inginkan");
    }

    public static int hitungTotalHarga09(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 10000};
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static int terapkanKodePromo(int totalHarga, String kodePromo) {
        if (kodePromo.equals("DISKON50")) {
            return (int) (totalHarga * 0.5); // Diskon 50%
        } else if (kodePromo.equals("DISKON30")) {
            return (int) (totalHarga * 0.7); // Diskon 30%
        } else {
            System.out.println("Kode Promo: " + kodePromo + " - Tidak valid.");
            return totalHarga; // Tidak ada diskon
        }
    }

    public static void main(String[] args) {
        Menu("Andi", true);
        Scanner sc = new Scanner(System.in);

        int totalHarga = 0;
        char pilihLagi;

        do {
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            totalHarga += hitungTotalHarga09(pilihanMenu, banyakItem);

            System.out.print("Apakah anda ingin memesan lagi? (y/n): ");
            pilihLagi = sc.next().charAt(0);
        } while (pilihLagi == 'y' || pilihLagi == 'Y');

        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.next();
        totalHarga = terapkanKodePromo(totalHarga, kodePromo);

        System.out.println("\nTotal harga untuk semua pesanan anda: Rp" + totalHarga);
    }
}
