
public interface IMuhendis {
	
	//Java'da C++'da oldu�u gibi �oklu kal�t�m yok.
    //�oklu kal�t�m� sa�lamak i�in Interface'ler kullan�l�yor
	//Interfaceden obje olu�turulam�yor.
	
	void askerlik_durumu_sorgula();
	String mezuniyet_ortalamasi(double derece);
	void adli_sicil_sorgula();
	void is_tecrubesi(String[] array);
}
