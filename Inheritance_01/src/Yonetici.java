import java.security.PublicKey;

//SubClass denir.
public class Yonetici extends Calisan{//Miras bu �ekilde al�n�r.

    private int sorumlu_kisi;//Ekstra �zellik

    public Yonetici(String isim, int maas, String departman, int sorumlu_kisi){

        super(isim,maas,departman); //Cal��an Class�n�n constructor�n� �a��rm�� olduk.
        this.sorumlu_kisi = sorumlu_kisi;
    }
    public void zamYap(int zam_miktari){
        System.out.println("�al��anlara " + zam_miktari + " TL zam yap�ld�.");
    }

    public void bilgileriGoster(){
        /*Calisan s�n�f�ndada bu fonksiyondan vard� fakat biz sorumlu kisi say�s�n�da
        ekrana bast�rmak i�in Yonetici s�n�f�ndada bu fonksiyonu tan�mlad�k. Asl�nda Inheritanceda
        Overriding yapm�� olduk.

        System.out.println("�sim: " + getIsim());
        System.out.println("Maas: " + getMaas());
        System.out.println("Departman: " + getDepartman());
        System.out.println("Sorumlu kisi say�s�: " + this.sorumlu_kisi);*/

        /*Yukar�daki i�i farkl� �ekilde a�a��daki �ekildeki gibide yapabiliriz.
        super anahtar kelimesi ile Calisan s�n�f�n�n bilgileriGoster() fonksiyonunu
        �a��rd�k.
         */
        super.bilgileriGoster();
        System.out.println("Sorumlu kisi say�s�: " + this.sorumlu_kisi);
    }
}