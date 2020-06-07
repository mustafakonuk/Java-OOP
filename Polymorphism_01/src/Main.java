class Hayvan{//Base Class
    private String isim;

    public Hayvan(String isim) {
        this.setIsim(isim);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){
        return "Hayvan Konu�uyor...";
    }
}

class Kedi extends Hayvan{
    @Override //Burdaki override yorum sat�r� gibi fonksiyonun override yap�ld���n� ifade ediyor.
    public String konus() {
        return this.getIsim() + " Miyavl�yor...";
    }

    public Kedi(String isim) {
        super(isim);
    }
}

class Kopek extends Hayvan{
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Hayl�yor...";
    }
}

class At extends Hayvan{
    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Ki�niyor...";
    }
}
public class Main {

    public static void main(String[] args){

        /*Hayvan hayvan = new Kedi("F�nd�k");
        Hayvan hayvan1 = new Kopek("Karaba�");
        Hayvan hayvan2 = new At("�ahbatur");

        System.out.println(hayvan.konus());
        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus() );*/

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Kopek kopek = new Kopek("Karaba�");

        if(kopek instanceof Kopek){
            System.out.println("Bu nesne Kopek s�n�f�ndand�r...");
        }
        else {
            System.out.println("Bu nesne Kopek s�n�f�nfan de�ildir...");
        }
    }
}
