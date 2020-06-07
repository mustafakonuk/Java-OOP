import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        //Polymorphism kullanarak Beyblade
        // Polymorphism kullanarak Beyblade Programý
        System.out.println("Beyblade Programýna Hoþgeldiniz...");
        System.out.println("Çýkýþ için q'ya basýn...");

        Scanner scanner =  new Scanner(System.in);

        while(true) {
            System.out.println("Hangi Beyblade'i üretmek istiyorsunuz ? ");
            String islem = scanner.nextLine();
            if (islem.equals("q")){

                System.out.println("Programdan Çýkýlýyor...");
                break;

            }
            else {
                BeybladeFabrikasý fabrika = new BeybladeFabrikasý();

                Beyblade beyblade = fabrika.beybladeUret(islem);

                if (beyblade == null) {

                    System.out.println("Lütfen geçerli bir beyblade ismi girin...");
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
