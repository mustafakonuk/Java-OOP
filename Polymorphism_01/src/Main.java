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
        return "Hayvan Konuþuyor...";
    }
}

class Kedi extends Hayvan{
    @Override //Burdaki override yorum satýrý gibi fonksiyonun override yapýldýðýný ifade ediyor.
    public String konus() {
        return this.getIsim() + " Miyavlýyor...";
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
        return this.getIsim() + " Haylýyor...";
    }
}

class At extends Hayvan{
    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Kiþniyor...";
    }
}
public class Main {

    public static void main(String[] args){

        /*Hayvan hayvan = new Kedi("Fýndýk");
        Hayvan hayvan1 = new Kopek("Karabaþ");
        Hayvan hayvan2 = new At("Þahbatur");

        System.out.println(hayvan.konus());
        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus() );*/

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Kopek kopek = new Kopek("Karabaþ");

        if(kopek instanceof Kopek){
            System.out.println("Bu nesne Kopek sýnýfýndandýr...");
        }
        else {
            System.out.println("Bu nesne Kopek sýnýfýnfan deðildir...");
        }
    }
}
