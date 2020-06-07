
public interface IMuhendis {
	
	//Java'da C++'da olduðu gibi çoklu kalýtým yok.
    //Çoklu kalýtýmý saðlamak için Interface'ler kullanýlýyor
	//Interfaceden obje oluþturulamýyor.
	
	void askerlik_durumu_sorgula();
	String mezuniyet_ortalamasi(double derece);
	void adli_sicil_sorgula();
	void is_tecrubesi(String[] array);
}
