public class Test {
	
	public static void main(String[] args) {
		
		Hayvan hayvan = new Hayvan();
		
		hayvan.setIsim("Boncuk");
		System.out.println("Hayvan�n �smi:" + hayvan.getIsim());
		
		hayvan.setYas(5);
		System.out.println("Hayvan�n Ya��:" + hayvan.getYas());
		
		hayvan.setBacak_sayisi(-6);
		System.out.println("Hayvan�n Bacak Say�s�:" + hayvan.getBacak_sayisi());
	}
}