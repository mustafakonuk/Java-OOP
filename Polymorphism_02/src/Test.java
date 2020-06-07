import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        //Polymorphism kullanarak Beyblade
        // Polymorphism kullanarak Beyblade Program�
        System.out.println("Beyblade Program�na Ho�geldiniz...");
        System.out.println("��k�� i�in q'ya bas�n...");

        Scanner scanner =  new Scanner(System.in);

        while(true) {
            System.out.println("Hangi Beyblade'i �retmek istiyorsunuz ? ");
            String islem = scanner.nextLine();
            if (islem.equals("q")){

                System.out.println("Programdan ��k�l�yor...");
                break;

            }
            else {
                BeybladeFabrikas� fabrika = new BeybladeFabrikas�();

                Beyblade beyblade = fabrika.beybladeUret(islem);

                if (beyblade == null) {

                    System.out.println("L�tfen ge�erli bir beyblade ismi girin...");
                }
                else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
        }
    }
}
