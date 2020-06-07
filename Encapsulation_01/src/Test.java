public class Test {
	
	public static void main(String[] args) {
		
		Hayvan hayvan = new Hayvan();
		
		hayvan.setIsim("Boncuk");
		System.out.println("Hayvanýn Ýsmi:" + hayvan.getIsim());
		
		hayvan.setYas(5);
		System.out.println("Hayvanýn Yaþý:" + hayvan.getYas());
		
		hayvan.setBacak_sayisi(-6);
		System.out.println("Hayvanýn Bacak Sayýsý:" + hayvan.getBacak_sayisi());
	}
}