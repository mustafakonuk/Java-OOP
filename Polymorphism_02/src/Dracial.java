public class Dracial extends Beyblade {

    private String kutsalCanavar;
    public Dracial(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "Ortaya Çýkarýyor...");
        System.out.println(getBeybladeci() + "ýn Saldýrýsý: Kale Savunmasý");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adý: " + kutsalCanavar);
    }
}
