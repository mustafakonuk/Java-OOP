public class BeybladeFabrikasý {

    public Beyblade beybladeUret(String beyblade_turu){

        if(beyblade_turu.equals("Dragon")){
            return new Dragon("Takao", 800, 300, "Mavi Ejderha", "Kutsal Canavarla Konuþma");
        }
        else if(beyblade_turu.equals("Dranza")){
            return new Dranza("Kai", 600, 400, "Kýrmýzý Anka Kuþu");
        }
        else if(beyblade_turu.equals("Drayga")){
            return new Drayga("Rei", 600, 250, "Beyaz Kaplan");
        }
        else if(beyblade_turu.equals("Dracial")){
            return new Dracial("Max", 400, 1000, "Kýrmýzý Anka Kuþu");
        }
        else {
            return null;
        }
    }
}