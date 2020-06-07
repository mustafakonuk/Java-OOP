public class Araba {

    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;

    public void setModel(String model) { //SetModel fonksiyonu ile model deðiþkenine bir deðer atadýk.
        this.model = model;
        /*this anahtar kelimesi Araba sýnýfý içerisinde tanýmladýðýmýz model isimli deðiþkeni gösterir.
         atadýðýmýz deðiþkenin ismi ile Araba sýnýfýnda tanýmladýðýmýz deðiþkenin ismi ayný olduðu için
         this anahtar kelimesini kullanmak zorundayýz!*/

        // model = AtananModel; gibi bir kullanýmda isimler ayný olmadýðý için this anahtar kelimesini kullanmadýk.
    }

    public String getModel() { //getModel fonksiyonu ile model deðiþkenine atanan deðeri dönderdik.
        return model;
        //veya return this.model; de yazýlabilirdi.
    }

    public void setKapilar(int kapilar) {
        this.kapilar = kapilar;
        if (this.kapilar < 0) {
            System.out.println("Arabanýn kapýsý negatif deðer alamaz.");
        }
        else {
            this.kapilar = kapilar;
        }
    }
}
