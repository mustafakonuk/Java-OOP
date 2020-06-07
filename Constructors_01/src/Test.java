public class Test {

    public static void main(String[] args){

        /*Account account1 = new Account();
        account1.setHesapNo("123456");
        account1.setBakiye(1000.0);
        account1.setIsim("Mustafa KONUK");
        account1.setEmail("mustafakonuk@outlook.com.tr");
        account1.setTelefonNo("321654");

        System.out.println("Bakiye: " + account1.getBakiye());*/
        /*Bir sýnýfýn özelliklerine yukarýdaki gibi teker teker deðer verilebilir
        fakat bu biraz uðraþtýrýcý olur. Constructorlar bu iþ için vardýr. Sýnýf ismi
        ile ayný isme sahiptir ve sýnýfýn  özelliklerine ilk deðer atamasý yapýlmasýný saðlarlar.
         */

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*Account account1 = new Account();

        Account account2 = new Account("123456", 1000.0, "Mustafa KONUK", "mustafakonuk@outlook.com.tr", "321654");

        account2.paraYatir(500);
        account2.paraCekme(2000);*/
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*Account account3 = new Account();

        System.out.println(account3.getBakiye());
        System.out.println(account3.getEmail());*/
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Account account4 = new Account("Mustafa KONUK", "mustafakonuk@outlook.com.tr", "522146");
        //System.out.println("E-MAÝL: "+ account4.getEmail());
        account4.bilgileriGoster();

    }
}