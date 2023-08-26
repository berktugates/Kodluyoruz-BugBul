import java.util.*;
// Kullanıcıdan sayı alarak kullanıcının girdiği sayılardan kaç tanesinin pozitif kaç tanesinin negatif varsa kaç tanesinin 0 olduğunu bulan kodu java dilinde yazınız.
// Ayrıca pozitif,negatif sayıları ekrana yazdırınız.
public class Soru1 {
    public static void main(String[] args) {
        int ps=0,ns=0,s=0;
        ArrayList <Integer> pozitif = new ArrayList<>();
        ArrayList <Integer> negatif = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı girmek istiyorsunuz: ");
        int adet = input.nextInt();

        for(int i=0;i<adet;i++){
            System.out.print("Bir sayı giriniz: ");
            int sayi = input.nextInt();

            if(sayi>0){
                pozitif.add(sayi);
                ps++;
            }
            else if(sayi==0){
                s++;
            }
            else{
                negatif.add(sayi);
                ns++;
            }
        }
        System.out.println("-----Pozitif Sayılar-----");
        for(int i=0; i<pozitif.size();i++){
            System.out.print(pozitif.get(i) + " ");
        }
        System.out.println();
        System.out.println("-----Negatif Sayılar-----");
        for(int i=0; i<negatif.size();i++){
            System.out.print(negatif.get(i) + " ");
        }
        System.out.println();
        System.out.println("Pozitif sayı adedi: " + ps);
        System.out.println("Negatif sayı adedi: " + ns);
        System.out.println("Sıfır sayı adedi: " + s);
    }
}