public class Dracial extends Beyblade {

    private String kutsalCanavar;
    public Dracial(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "Ortaya ��kar�yor...");
        System.out.println(getBeybladeci() + "�n Sald�r�s�: Kale Savunmas�");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Ad�: " + kutsalCanavar);
    }
}
