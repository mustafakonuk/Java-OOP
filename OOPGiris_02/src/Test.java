public class Test {
    public static void main(String[] args){

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*Araba araba1 = new Araba();
        araba1.model = "Renault";
        araba1.kapilar = -4;*/

        /* Yukar�da Araba s�n�f�n�n kapilar isimli �zelli�ine
        do�rudan eri�ebildik ve -4 de�erini atad�k. Normal hayatta
        arablar�n kap�lar� asla eksi(-) de�er almazlar. Bu sebeble
        bir s�n�f�n �zelliklerine do�rudan eri�mek �ok sak�ncal�d�r.
        Bu y�zden s�n�flar�n �zelliklerine do�rudan eri�imi engellemek
        i�in private anahtar kelimesi kullan�l�r ve dolayl� eri�im sa�lan�r.
        Buna Nesne Y�nelimli Programlamada Encapsulatin denir.
         */
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*Araba araba1 = new Araba();

        araba1.setModel("Renault");
        System.out.println("Araban�n modeli:" + araba1.getModel());

        araba1.setKapilar(-5);//Kap�lar negatif de�er almad�klar� i�in uyar� mesaj�n� ekrana basar.*/
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*Araba araba1; //Olu�turulan bu referans hi�bir objeyi g�stermedi�i i�in do�rudan hata verir.
        araba1.setKapilar(-5);*/
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Araba araba1 = null;//Bu referans hen�z herhangi bir objeyi g�stermiyor onun i�in do�rudan hata vermez sadece projeyi �al��t�rd���m�zda hata verir.
        araba1.setModel("Renault");

    }
}