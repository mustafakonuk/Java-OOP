public class Test {

    public static void main(String[] args){
        //Bir s�n�f�n ba�ka bir s�n�f�n �zelliklerini ve metotlar�n� �d�n� almas�d�r.
        //Inheritanceda "is a" ili�kisi vard�r. �rne�in y�neticide bir �al��and�r gibi.

        Yonetici yonetici1 = new Yonetici("Mustafa KONUK",1000,"IT", 10);
        yonetici1.bilgileriGoster();

        yonetici1.zamYap(750);

    }
}