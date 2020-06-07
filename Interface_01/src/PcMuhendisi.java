import javax.sound.midi.Soundbank;


//implement anahtar kelimesi ile kal�t�m alm�� gibi olduk
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
			
			System.out.println("Askerli�imi yapt�m...");
		}
		else {
			System.out.println("Askerli�mi yapmad�m...");
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
			
			System.out.println("Adli sicil kayd�m bulunuyor...");
		}
		else {
			System.out.println("Herhangi bir adli sicil kayd�m bulunmuyor...");
		}
		
	}

	@Override
	public void is_tecrubesi(String[] array) {
		// TODO Auto-generated method stub
		
		System.out.println("Bilgisayar m�hendisi olarak �u �irketlerle �al��t�m:");
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
			
		}	
	}
}