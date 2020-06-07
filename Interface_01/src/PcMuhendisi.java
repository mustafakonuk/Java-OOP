import javax.sound.midi.Soundbank;


//implement anahtar kelimesi ile kalýtým almýþ gibi olduk
public class PcMuhendisi implements IMuhendis {
	
	private boolean askerlik;
	private boolean adli_sicil;
	
	

	public PcMuhendisi(boolean askerlik, boolean adli_sicil) {
		  
		this.askerlik = askerlik;
		this.adli_sicil = adli_sicil;
	}

	@Override
	public void askerlik_durumu_sorgula() {
		// TODO Auto-generated method stub
		
		if(askerlik) {
			
			System.out.println("Askerliðimi yaptým...");
		}
		else {
			System.out.println("Askerliðmi yapmadým...");
		}
		
	}

	@Override
	public String mezuniyet_ortalamasi(double derece) {
		// TODO Auto-generated method stub
		return "Ortalamam:" + derece;
	}

	@Override
	public void adli_sicil_sorgula() {
		// TODO Auto-generated method stub
		
		if(adli_sicil) {
			
			System.out.println("Adli sicil kaydým bulunuyor...");
		}
		else {
			System.out.println("Herhangi bir adli sicil kaydým bulunmuyor...");
		}
		
	}

	@Override
	public void is_tecrubesi(String[] array) {
		// TODO Auto-generated method stub
		
		System.out.println("Bilgisayar mühendisi olarak þu þirketlerle çalýþtým:");
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
			
		}	
	}
}