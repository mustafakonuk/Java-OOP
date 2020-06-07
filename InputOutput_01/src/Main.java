public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * Java I/O, dosyalardan ve deðiþik kaynaklardan
		 * input almak ve dosyalara ve deðiþik kaynaklara
		 * output yazmak için bir API olarak bilinir.
		 * 
		 * Input ve Output iþlemlerini hýzlandýrmak için Java
		 * streamleri kullanýr. Java I/O API sinin içinde input,
		 * output iþlemleri için onlarca sýnýf bulunur.
		 */
		
		/*
		 * Stream Nedir?
		 * Stream verilerin input ve output yoluyla Java
		 * projelerine aktýðý bir veri dizisidir ve Javada
		 * streamler verilerin byte(1 ve 0) halinde aktýðý
		 * yapýlardýr.
		 * 
		 * Javadaki standart streamlerden bir tanesini aslýnda
		 * daha önce kullandýk. Javada hazýr kullanmamýz için
		 * oluþturulmuþ 3 tane hazýr stream bulunmaktadýr.
		 * 
		 * System.out: Standart Output Stream
		 * System.err: Standart Error Stream
		 * System.in: Standart Input Stream
		 */
		
		/*OutputStream
		 * Java uygulamalarý bir dosyaya, bir sockete ve baðlanmýþ
		 * bir aygýta veriyi Stream halinde yazmak(byte halinde 1 ve 0'lar ile)
		 * için OutputStream abstract classýndan(soyut sýnýf)
		 * türeyen bir alt sýnýfý kullanýr.
		 * 
		 * write() metodu: Belli bir byte dizisini veya tek bir byte'ý hedefe yazar.
		 * flush() metodu: Herhangi bir bufferlanmýþ veri varsa bu metod
		 * sayesinde hemen hedefe yazýlmasýný söylemiþ oluruz.
		 * close() metodu: OutputStream'i kapatýr.
		 */
		
		/*InputStream
		 * Java uygulamalarý bir dosyadan, bir socketten ve baðlanmýþ bir 
		 * aygýttan veriyi Stream halinde okumak(byte halinde 1 ve 0'lar ile)
		 * için InputStream abstract classýndan(soyut sýnýf) türeyen bir 
		 * alt sýnýfý kullanýr.
		 * 
		 * read() metodu: Kaynaktan bir sonraki byte'ý okur. Okuyacak herhangi
		 * bir veri yoksa -1 deðeri döner.
		 * avaible() metodu: Okunabilecek byte sayýsýný döner.
		 * close() metodu: InputStream'i kapatýr.
		 */
	}

}