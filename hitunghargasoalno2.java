import java.util.Scanner;

public class hitunghargasoalno2 {

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

    public static int hitungTotalHarga09(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 10000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal *= 0.5; // Diskon 50%
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal *= 0.7; // Diskon 30%
        } else {
            System.out.println("Kode Promo: " + kodePromo + " - Tidak valid.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Menu("Andi", true);
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.next();

        int totalHarga = hitungTotalHarga09(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan anda: Rp" + totalHarga);
    }
}
    
