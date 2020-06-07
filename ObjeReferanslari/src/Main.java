public class Main {

    public static void main(String[] args){

        /*Account account1 = new Account();
        Account account2 = account1;
        Account account3 = new Account();

        if(account1 == account2){
            System.out.println("Ayný Objeyi gösteriyorlar.");
        }

        if (account1 == account3){
            System.out.println("Ayný Objeyi gösteriyorlar.");
        }
        else {
            System.out.println("Ayný Objeyi göstermiyorlar.");
        }*/

        //Bu þekildede herhangi bir þeye atamadanda kullanýlabilir.
        new Account("Mustafa KONUK","mustafakonuk@outlook.com.tr","879456").bilgilerigoster();
    }
}
