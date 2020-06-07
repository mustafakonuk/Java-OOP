public class Main {
	
	public static void main(String[] args) {
		
		PcMuhendisi muhendis = new PcMuhendisi(false, false);
		
		muhendis.askerlik_durumu_sorgula();
		muhendis.adli_sicil_sorgula();
		System.out.println(muhendis.mezuniyet_ortalamasi(3.50));
		String [] tecrube = {"Vestel", "Havelsan", "Turksat"};
		muhendis.is_tecrubesi(tecrube); 
	}
}
