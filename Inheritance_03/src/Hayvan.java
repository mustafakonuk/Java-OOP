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
		
		System.out.println("Veteteryan mı?:" + vejeteryan);
		System.out.println("Kuyruğu var mı?:" + kuyruk);
		System.out.println("İsim:" + isim);
		System.out.println("Bacak Sayısı:" + bacak_sayisi);
	}
}
