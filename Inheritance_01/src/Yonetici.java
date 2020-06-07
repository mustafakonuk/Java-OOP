import java.security.PublicKey;

//SubClass denir.
public class Yonetici extends Calisan{//Miras bu þekilde alýnýr.

    private int sorumlu_kisi;//Ekstra özellik

    public Yonetici(String isim, int maas, String departman, int sorumlu_kisi){

        super(isim,maas,departman); //Calýþan Classýnýn constructorýný çaðýrmýþ olduk.
        this.sorumlu_kisi = sorumlu_kisi;
    }
    public void zamYap(int zam_miktari){
        System.out.println("Çalýþanlara " + zam_miktari + " TL zam yapýldý.");
    }

    public void bilgileriGoster(){
        /*Calisan sýnýfýndada bu fonksiyondan vardý fakat biz sorumlu kisi sayýsýnýda
        ekrana bastýrmak için Yonetici sýnýfýndada bu fonksiyonu tanýmladýk. Aslýnda Inheritanceda
        Overriding yapmýþ olduk.

        System.out.println("Ýsim: " + getIsim());
        System.out.println("Maas: " + getMaas());
        System.out.println("Departman: " + getDepartman());
        System.out.println("Sorumlu kisi sayýsý: " + this.sorumlu_kisi);*/

        /*Yukarýdaki iþi farklý þekilde aþaðýdaki þekildeki gibide yapabiliriz.
        super anahtar kelimesi ile Calisan sýnýfýnýn bilgileriGoster() fonksiyonunu
        çaðýrdýk.
         */
        super.bilgileriGoster();
        System.out.println("Sorumlu kisi sayýsý: " + this.sorumlu_kisi);
    }
}