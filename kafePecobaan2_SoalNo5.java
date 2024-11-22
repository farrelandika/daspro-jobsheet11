public class kafePecobaan2_SoalNo5 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
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

        // Cek kode promo
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode Promo: " + kodePromo + " - Anda mendapatkan diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode Promo: " + kodePromo + " - Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode Promo: " + kodePromo + " - Tidak valid.");
        }

        System.out.println("Silahkan pilih menu yang anda inginkan");
    }

    public static void main(String[] args) {
        Menu("Andi", true, "DISKON50");
        Menu("Budi", false, "DISKON30");
        Menu("Citra", true, "TIDAKVALID");
    }
}

