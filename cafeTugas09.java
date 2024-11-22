import java.util.Scanner;

public class cafeTugas09 {
    static final int JM = 5; 
    static final int JH = 7; 

    public static void main(String[] args) {
        int[][] dp = new int[JM][JH]; 
        String[] nm = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

        input(dp, nm);
        tampilData(dp, nm);
        menuTertinggi(dp, nm);
        rataRata(dp, nm);
    }

    public static void input(int[][] dp, String[] nm) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < JM; i++) {
            System.out.println("Masukkan data penjualan untuk: " + nm[i]);
            for (int j = 0; j < JH; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                dp[i][j] = sc.nextInt();
            }
        }
    }

    public static void tampilData(int[][] dp, String[] nm) {
        System.out.println("Data Penjualan:");
        System.out.print("Menu\t\t");
        for (int j = 1; j <= JH; j++) {
            System.out.print("Hari " + j + "");
        }
        System.out.println();

        for (int i = 0; i < JM; i++) {
            System.out.print(nm[i] + "");
            for (int j = 0; j < JH; j++) {
                System.out.print(dp[i][j] + "");
            }
            System.out.println();
        }
    }

    public static void menuTertinggi(int[][] dp, String[] nm) {
        int max = 0;
        String mt = ""; 

        for (int i = 0; i < JM; i++) {
            int total = 0;
            for (int j = 0; j < JH; j++) {
                total += dp[i][j];
            }
            if (total > max) {
                max = total;
                mt = nm[i];
            }
        }

        System.out.println("Menu dengan penjualan tertinggi: " + mt + " (Total: " + max + ")");
    }

    public static void rataRata(int[][] dp, String[] nm) {
        System.out.println("Rata-rata penjualan tiap menu:");
        for (int i = 0; i < JM; i++) {
            int total = 0;
            for (int j = 0; j < JH; j++) {
                total += dp[i][j];
            }
            double rtrt = (double) total / JH;
            System.out.println(nm[i] + ": " + rtrt);
        }
    }
}
