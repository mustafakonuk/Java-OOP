public class Test {

    public static void main(String[] args){

        /*Account account1 = new Account();
        account1.setHesapNo("123456");
        account1.setBakiye(1000.0);
        account1.setIsim("Mustafa KONUK");
        account1.setEmail("mustafakonuk@outlook.com.tr");
        account1.setTelefonNo("321654");

        System.out.println("Bakiye: " + account1.getBakiye());*/
        /*Bir s�n�f�n �zelliklerine yukar�daki gibi teker teker de�er verilebilir
        fakat bu biraz u�ra�t�r�c� olur. Constructorlar bu i� i�in vard�r. S�n�f ismi
        ile ayn� isme sahiptir ve s�n�f�n  �zelliklerine ilk de�er atamas� yap�lmas�n� sa�larlar.
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
        //System.out.println("E-MA�L: "+ account4.getEmail());
        account4.bilgileriGoster();

    }
}