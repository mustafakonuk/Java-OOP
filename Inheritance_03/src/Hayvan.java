public class Hayvan {
	
	private boolean vejeteryan;
	private boolean kuyruk;
	private String isim;
	private int bacak_sayisi;
	
	public Hayvan(boolean vejeteryan, boolean kuyruk, String isim, int bacak_sayisi) {
		super();
		this.vejeteryan = vejeteryan;
		this.kuyruk = kuyruk;
		this.isim = isim;
		this.bacak_sayisi = bacak_sayisi;
	}
	
	public void ekranaBas() {
		
		System.out.println("Veteteryan m�?:" + vejeteryan);
		System.out.println("Kuyru�u var m�?:" + kuyruk);
		System.out.println("�sim:" + isim);
		System.out.println("Bacak Say�s�:" + bacak_sayisi);
	}
}
