import java.util.*;
/*
Müşteri havalimanında alışveriş yapmak istiyor. Otomatta su, çikolata, bisküvi ve kraker bulunuyor.
Müşteri alışveriş bitince toplam ücretini ekranda görmek istiyor.
Su = 8 TL
Çikolata = 12 TL
Bisküvi = 15 TL
Kraker = 14
*/
public class Soru4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int su=8,cikolata=12,biskuvi=15,kraker=14,toplam=0;
        boolean continue_shopping = true;
        System.out.println(
                "ALIŞVERİŞE HOŞ GELDİNİZ!" +
                "\n1)Su: " + su +
                "\n2)Çikolata: " + cikolata +
                "\n3)Bisküvi: " + biskuvi +
                "\n4)Kraker: " + kraker
        );

        while(continue_shopping){
            System.out.print("Hangi ürünü satın almak istediğinizi seçiniz: ");
            int secim = input.nextInt();
            switch (secim){
                case 1:
                    toplam+=su;
                    break;
                case 2:
                    toplam+=cikolata;
                    break;
                case 3:
                    toplam+=biskuvi;
                    break;
                case 4:
                    toplam+=kraker;
                    break;
                default:
                    System.out.println("Hatalı tuşlama yaptınız!");
                    break;
            }
            System.out.print("Alışverişe devam etmek istiyor musunuz [Evet : 1 / Hayır : 2]: ");
            int karar = input.nextInt();

            if(karar == 2){
                continue_shopping = false;
            } else if (karar!=2 && karar !=1){
                System.out.println("Hatalı tuşlama yaptınız!");
                continue_shopping = false;
            }
        }

        System.out.println("Ödemeniz gereken ücret: " + toplam);
    }
}