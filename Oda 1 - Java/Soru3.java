import java.util.*;
// Girilen üç basamaklı sayının basamak değerlerini ekrana yazdıran kodu yazınız.
public class Soru3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üç basamaklı sayı giriniz: ");
        int sayi = input.nextInt();

        int yuzler = sayi / 100;
        int onlar = (sayi % 100) / 10;
        int birler = (sayi % 100) % 10;

        System.out.println("Yüzler basamağı: " + yuzler);
        System.out.println("Onlar basamağı: " + onlar);
        System.out.println("Birler basamağı: " + birler);
    }
}