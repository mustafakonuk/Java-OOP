public class Test {
    public static void main(String[] args){

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*Araba araba1 = new Araba();
        araba1.model = "Renault";
        araba1.kapilar = -4;*/

        /* Yukarýda Araba sýnýfýnýn kapilar isimli özelliðine
        doðrudan eriþebildik ve -4 deðerini atadýk. Normal hayatta
        arablarýn kapýlarý asla eksi(-) deðer almazlar. Bu sebeble
        bir sýnýfýn özelliklerine doðrudan eriþmek çok sakýncalýdýr.
        Bu yüzden sýnýflarýn özelliklerine doðrudan eriþimi engellemek
        için private anahtar kelimesi kullanýlýr ve dolaylý eriþim saðlanýr.
        Buna Nesne Yönelimli Programlamada Encapsulatin denir.
         */
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*Araba araba1 = new Araba();

        araba1.setModel("Renault");
        System.out.println("Arabanýn modeli:" + araba1.getModel());

        araba1.setKapilar(-5);//Kapýlar negatif deðer almadýklarý için uyarý mesajýný ekrana basar.*/
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*Araba araba1; //Oluþturulan bu referans hiçbir objeyi göstermediði için doðrudan hata verir.
        araba1.setKapilar(-5);*/
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Araba araba1 = null;//Bu referans henüz herhangi bir objeyi göstermiyor onun için doðrudan hata vermez sadece projeyi çalýþtýrdýðýmýzda hata verir.
        araba1.setModel("Renault");

    }
}