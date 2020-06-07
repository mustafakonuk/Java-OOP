public class Hayvan {
	
	//Encapsulation private eri�im belirleyicisi ile sa�lan�yor
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
			System.out.println("Hayvan�n Ya�� Negatif De�er Alamaz!!");
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
			
			System.out.println("Hayvan�n Bacak Say�s� Negatif De�er Alamaz!!");
		}
		else {
			this.bacak_sayisi = bacak_sayisi;
		}
	}
}