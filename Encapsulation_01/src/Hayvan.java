public class Hayvan {
	
	//Encapsulation private eriþim belirleyicisi ile saðlanýyor
	private String isim;
	private int yas;
	private int bacak_sayisi;
	
	public String getIsim() {
		
		return isim;
	}
	
	public void setIsim(String isim) {
		
		this.isim = isim;
	}
	
	public int getYas() {
		
		return yas;
	}
	
	public void setYas(int yas) {
		
		this.yas = yas;
		
		if(this.yas <= 0) {
			System.out.println("Hayvanýn Yaþý Negatif Deðer Alamaz!!");
		}
		else {
			this.yas = yas;
		}
	}
	
	public int getBacak_sayisi() {
		
		return bacak_sayisi;
	}
	
	public void setBacak_sayisi(int bacak_sayisi) {
		
		this.bacak_sayisi = bacak_sayisi;
		
		if(this.bacak_sayisi <= 0) {
			
			System.out.println("Hayvanýn Bacak Sayýsý Negatif Deðer Alamaz!!");
		}
		else {
			this.bacak_sayisi = bacak_sayisi;
		}
	}
}