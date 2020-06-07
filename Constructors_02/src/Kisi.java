public class Kisi {
	
	private String ad;
	private String soyad;
	private int yas;
	private String cinsiyet;
	
	public Kisi(String ad, String soyad, int yas, String cinsiyet) {
		
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.cinsiyet = cinsiyet;
	}
	public Kisi() {
		
		this("Bilgi Yok!" ,"Bilgi Yok!", 0, "Bilgi Yok!");
	}
	
	public String getAd() {
		return ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public int getYas() {
		return yas;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}
}
