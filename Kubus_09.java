public class Kubus_09 {
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    public static int hitungLuasPermukaan(int sisi) {
        return 6 * (sisi * sisi);
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Masukkan panjang sisi kubus: ");
        int sisi = input.nextInt();
        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);
        System.out.println("Volume Kubus: " + volume);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
        input.close();
 
 
 
  
    }

    
}
