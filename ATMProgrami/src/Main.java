public class Main {

    public static void main(String[] args){
        //Nesne Yönelimli bir ATM uygulamasý
        //Login Class'ý kullanýcý giriþini kontrol edecek
        //Hesap Class'ý hesap iþlemlerini yapacak
        //ATM Class'ý ise ATM mizi çalýþtýracak

        ATM atm = new ATM();
        Hesap hesap = new Hesap("Mustafa KONUK","12345", 2000);
        atm.calis(hesap);
        System.out.println("Programdan Çýkýlýyor...");
    }
}