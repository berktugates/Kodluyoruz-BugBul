import java.util.*;
/*
Rastgele sayılardan oluşmuş 100 elemanlık tamsayı dizisindeki tüm elemanların ortalamasını alacak programı geliştirin.
Programı yazarken aşağıdaki özelliklere uygun yazınız.

1)Rastgele oluşan 100 elemanlık sayı kümesi program yeniden her çalıştığında değişsin. Sabit elemanlı bir dizi vermeyin!
2)Ortalama almayı sağlayacak kodu bir fonksiyon halinde tasarlayın. İçine diziyi girdi (input) olarak alsın.
3)Ortalama alan fonksiyon ortalamayı ondalıklı sayı olarak döndürsün.
*/
public class Soru5 {
    public static double ortalama(int[] arr){
        double toplam = 0;
        for(int i=0; i< arr.length;i++){
            toplam+=arr[i];
        }
        return toplam/ arr.length;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] sayilar = new int[100];
        for(int i=0; i< sayilar.length;i++){
            sayilar[i] = random.nextInt(1000); // 1000 sayısı rastgele üretilecek sayının aralığını belirtiyor.
        }
        System.out.println(ortalama(sayilar));
    }
}