public class Test {

    public static void main(String[] args){

        Araba araba1 = new Araba(); //Bir class'tan obje bu �ekilde olu�turulur.

        araba1.renk = "K�rm�z�"; //Olu�turulan obje ile class'�n public �zelliklerine eri�tik.
        araba1.kapilar = 4;
        araba1.tekerlekler = 4;
        araba1.motor = "16V";
        araba1.model = "Renault";

        System.out.println("Araban�n rengi:" + araba1.renk);
        System.out.println("Araban�n " + araba1.kapilar + " tane kap�s� var.");
    }
}