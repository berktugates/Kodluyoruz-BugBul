import java.util.*;
/*
Aşağıdaki görüntüyü çiziniz. Taban değerini kullanıcıdan alınız.
*
**
***
****
*****
******
*/
public class Soru2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int taban = input.nextInt();

        for(int i=0; i<taban;i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}