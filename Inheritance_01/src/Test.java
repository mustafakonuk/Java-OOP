public class Test {

    public static void main(String[] args){
        //Bir sýnýfýn baþka bir sýnýfýn özelliklerini ve metotlarýný ödünç almasýdýr.
        //Inheritanceda "is a" iliþkisi vardýr. Örneðin yöneticide bir çalýþandýr gibi.

        Yonetici yonetici1 = new Yonetici("Mustafa KONUK",1000,"IT", 10);
        yonetici1.bilgileriGoster();

        yonetici1.zamYap(750);

    }
}