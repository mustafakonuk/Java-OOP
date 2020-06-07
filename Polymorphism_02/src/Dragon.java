public class Dragon extends Beyblade {

    private String gizliYetenek;
    private String kutsalCanavar;

    public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "Ortaya Çýkarýyor...");
        System.out.println(getBeybladeci() + "ýn Saldýrýsý: Hayalet Kasýrgasý");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adý: " + kutsalCanavar);
        System.out.println("Gizli Yetenek Adý: " + gizliYetenek);
    }
}
