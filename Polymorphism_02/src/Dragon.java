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
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "Ortaya ��kar�yor...");
        System.out.println(getBeybladeci() + "�n Sald�r�s�: Hayalet Kas�rgas�");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Ad�: " + kutsalCanavar);
        System.out.println("Gizli Yetenek Ad�: " + gizliYetenek);
    }
}
