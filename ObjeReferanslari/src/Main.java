public class Main {

    public static void main(String[] args){

        /*Account account1 = new Account();
        Account account2 = account1;
        Account account3 = new Account();

        if(account1 == account2){
            System.out.println("Ayn� Objeyi g�steriyorlar.");
        }

        if (account1 == account3){
            System.out.println("Ayn� Objeyi g�steriyorlar.");
        }
        else {
            System.out.println("Ayn� Objeyi g�stermiyorlar.");
        }*/

        //Bu �ekildede herhangi bir �eye atamadanda kullan�labilir.
        new Account("Mustafa KONUK","mustafakonuk@outlook.com.tr","879456").bilgilerigoster();
    }
}
