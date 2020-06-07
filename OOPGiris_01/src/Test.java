public class Test {

    public static void main(String[] args){

        Araba araba1 = new Araba(); //Bir class'tan obje bu þekilde oluþturulur.

        araba1.renk = "Kýrmýzý"; //Oluþturulan obje ile class'ýn public özelliklerine eriþtik.
        araba1.kapilar = 4;
        araba1.tekerlekler = 4;
        araba1.motor = "16V";
        araba1.model = "Renault";

        System.out.println("Arabanýn rengi:" + araba1.renk);
        System.out.println("Arabanýn " + araba1.kapilar + " tane kapýsý var.");
    }
}