public class Main {

    public static void main(String[] args){
        //Nesne Y�nelimli bir ATM uygulamas�
        //Login Class'� kullan�c� giri�ini kontrol edecek
        //Hesap Class'� hesap i�lemlerini yapacak
        //ATM Class'� ise ATM mizi �al��t�racak

        ATM atm = new ATM();
        Hesap hesap = new Hesap("Mustafa KONUK","12345", 2000);
        atm.calis(hesap);
        System.out.println("Programdan ��k�l�yor...");
    }
}