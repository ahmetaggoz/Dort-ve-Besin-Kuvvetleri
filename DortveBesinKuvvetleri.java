package Giris;
import java.util.Scanner;
public class DortveBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        int n;
        System.out.print("Sayı girin : ");
        n = baba.nextInt();

        for (int i = 1; i <= n; i *= 4){
            System.out.println(i);
        }
    }
}
