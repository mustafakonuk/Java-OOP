public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * Java I/O, dosyalardan ve de�i�ik kaynaklardan
		 * input almak ve dosyalara ve de�i�ik kaynaklara
		 * output yazmak i�in bir API olarak bilinir.
		 * 
		 * Input ve Output i�lemlerini h�zland�rmak i�in Java
		 * streamleri kullan�r. Java I/O API sinin i�inde input,
		 * output i�lemleri i�in onlarca s�n�f bulunur.
		 */
		
		/*
		 * Stream Nedir?
		 * Stream verilerin input ve output yoluyla Java
		 * projelerine akt��� bir veri dizisidir ve Javada
		 * streamler verilerin byte(1 ve 0) halinde akt���
		 * yap�lard�r.
		 * 
		 * Javadaki standart streamlerden bir tanesini asl�nda
		 * daha �nce kulland�k. Javada haz�r kullanmam�z i�in
		 * olu�turulmu� 3 tane haz�r stream bulunmaktad�r.
		 * 
		 * System.out: Standart Output Stream
		 * System.err: Standart Error Stream
		 * System.in: Standart Input Stream
		 */
		
		/*OutputStream
		 * Java uygulamalar� bir dosyaya, bir sockete ve ba�lanm��
		 * bir ayg�ta veriyi Stream halinde yazmak(byte halinde 1 ve 0'lar ile)
		 * i�in OutputStream abstract class�ndan(soyut s�n�f)
		 * t�reyen bir alt s�n�f� kullan�r.
		 * 
		 * write() metodu: Belli bir byte dizisini veya tek bir byte'� hedefe yazar.
		 * flush() metodu: Herhangi bir bufferlanm�� veri varsa bu metod
		 * sayesinde hemen hedefe yaz�lmas�n� s�ylemi� oluruz.
		 * close() metodu: OutputStream'i kapat�r.
		 */
		
		/*InputStream
		 * Java uygulamalar� bir dosyadan, bir socketten ve ba�lanm�� bir 
		 * ayg�ttan veriyi Stream halinde okumak(byte halinde 1 ve 0'lar ile)
		 * i�in InputStream abstract class�ndan(soyut s�n�f) t�reyen bir 
		 * alt s�n�f� kullan�r.
		 * 
		 * read() metodu: Kaynaktan bir sonraki byte'� okur. Okuyacak herhangi
		 * bir veri yoksa -1 de�eri d�ner.
		 * avaible() metodu: Okunabilecek byte say�s�n� d�ner.
		 * close() metodu: InputStream'i kapat�r.
		 */
	}

}