public class Araba {

    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;

    public void setModel(String model) { //SetModel fonksiyonu ile model de�i�kenine bir de�er atad�k.
        this.model = model;
        /*this anahtar kelimesi Araba s�n�f� i�erisinde tan�mlad���m�z model isimli de�i�keni g�sterir.
         atad���m�z de�i�kenin ismi ile Araba s�n�f�nda tan�mlad���m�z de�i�kenin ismi ayn� oldu�u i�in
         this anahtar kelimesini kullanmak zorunday�z!*/

        // model = AtananModel; gibi bir kullan�mda isimler ayn� olmad��� i�in this anahtar kelimesini kullanmad�k.
    }

    public String getModel() { //getModel fonksiyonu ile model de�i�kenine atanan de�eri d�nderdik.
        return model;
        //veya return this.model; de yaz�labilirdi.
    }

    public void setKapilar(int kapilar) {
        this.kapilar = kapilar;
        if (this.kapilar < 0) {
            System.out.println("Araban�n kap�s� negatif de�er alamaz.");
        }
        else {
            this.kapilar = kapilar;
        }
    }
}
