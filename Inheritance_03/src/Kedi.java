public class Kedi extends Hayvan{
	
	private String renk;

	public Kedi(boolean vejeteryan, boolean kuyruk, String isim, int bacak_sayisi, String renk) {
		super(vejeteryan, kuyruk, isim, bacak_sayisi);
		this.renk = renk;
	}
	
	public void ekranaBas() {
		
		super.ekranaBas();
		System.out.println("Renk:" + renk);
	}
}
