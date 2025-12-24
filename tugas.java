import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang ingin dihitung (n): ");
        int n = sc.nextInt();

        int[] angka = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }
        System.out.println();
        int hasilIteratif = fungsiIteratif(angka, n);
        System.out.println("Jumlah hasil iteratif: " + hasilIteratif);

        int hasilRekursif = fungsiRekursif(angka, n);
        System.out.println("Jumlah hasil rekursif: " + hasilRekursif);
    }

    static int fungsiIteratif(int[] data, int n) {
        int hasil = 0;
        for (int i = 0; i < n; i++) {
            hasil += data[i];
        }
        return hasil;
    }
    static int fungsiRekursif(int[] data, int n) {
        if (n == 0) {
            return 0;
        } else {
            return data[n - 1] + fungsiRekursif(data, n - 1);
        }
    }
}